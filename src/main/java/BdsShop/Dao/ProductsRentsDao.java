package BdsShop.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import BdsShop.Dto.ProductsRentsDto;
import BdsShop.Dto.ProductsRentsDtoMapper;

@Repository
public class ProductsRentsDao extends BaseDao{
	private final boolean YES = true;
	
	private StringBuffer SqlString() {
		StringBuffer  sql = new StringBuffer();
		sql.append("SELECT ");
		sql.append("p.id as id_product ");
		sql.append(", p.id_categoryrent ");
		sql.append(", p.name ");
		sql.append(", p.address ");
		sql.append(", p.bedroom ");
		sql.append(", p.barthroom ");
		sql.append(", p.area ");
		sql.append(", p.price "); 
		sql.append(", p.rents ");
		sql.append(", p.status ");
		sql.append(", c.id as id_img ");
		sql.append(", p.created_at ");
		sql.append(", p.updated_at ");
		sql.append("FROM ");
		sql.append("product_rents AS p ");
		sql.append("INNER JOIN ");
		sql.append("image_products AS c ");
		sql.append("ON p.id = c.id_products ");
		return sql;
	}
	private String SqlProductsRents(boolean rents) {
		StringBuffer sql = SqlString();
		sql.append("WHERE 1 = 1 ");
		if (rents) {
			sql.append("AND p.rents = true ");
		}
		sql.append("GROUP BY p.id, c.id_products ");
		if (rents) {
			sql.append("LIMIT 6 ");
		}
		return sql.toString();
	}
	
	private StringBuffer SqlProductsRentsByID(int id) {
		StringBuffer sql = SqlString();
		sql.append("WHERE 1 = 1 ");
		sql.append("AND id_categoryrent = " + id + " ");
		return sql;
	}
	
	public List<ProductsRentsDto> GetAllProductsRentsByID(int id) {
		String sql = SqlProductsRentsByID(id).toString();
		List<ProductsRentsDto> listProductsRents = _jdbcTemplate.query(sql, new ProductsRentsDtoMapper());
		return listProductsRents;
	}
	
	private String SqlProductsRentsPaginate(int id, int start, int totalPage) {
		StringBuffer sql = SqlProductsRentsByID(id);
		sql.append("LIMIT " + start + ", "+ totalPage);
		return sql.toString();
	}
	
	public List<ProductsRentsDto> GetDataProductsRents() {
		String sql = SqlProductsRents(YES);
		List<ProductsRentsDto> listProductsRents = _jdbcTemplate.query(sql, new ProductsRentsDtoMapper());
				return	listProductsRents;
	}
	public List<ProductsRentsDto> GetDataProductsRentsPaginate(int id, int start, int totalPage) {
		StringBuffer sqlGetDataByID = SqlProductsRentsByID(id);
		List<ProductsRentsDto> listProductsRentsByID = _jdbcTemplate.query(sqlGetDataByID.toString(), new ProductsRentsDtoMapper());
		List<ProductsRentsDto> listProductsRents = new ArrayList<ProductsRentsDto>();
		if(listProductsRentsByID.size() > 0) {
			String sql = SqlProductsRentsPaginate(id, start, totalPage);
			listProductsRents = _jdbcTemplate.query(sql, new ProductsRentsDtoMapper());
		}
		return listProductsRents;
	}
	private String SqlProductRentsByID(long id) {
		StringBuffer sql = SqlString();
		sql.append("WHERE 1 = 1 ");
		sql.append("AND p.id = " + id + " ");
		sql.append("LIMIT 1 ");
		return sql.toString();
	}
	public List<ProductsRentsDto> GetProductRentsByID(long id) {
		String sql = SqlProductRentsByID(id);
		List<ProductsRentsDto> listProductsRents = _jdbcTemplate.query(sql, new ProductsRentsDtoMapper());
		return listProductsRents;
	}

}
