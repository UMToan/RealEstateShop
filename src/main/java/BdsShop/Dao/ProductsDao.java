package BdsShop.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import BdsShop.Dto.ProductsDto;
import BdsShop.Dto.ProductsDtoMapper;
@Repository
public class ProductsDao extends BaseDao{
	
	private final boolean YES = true;
	
	private StringBuffer SqlString() {
		StringBuffer  sql = new StringBuffer();
		sql.append("SELECT ");
		sql.append("p.id as id_product ");
		sql.append(", p.id_category ");
		sql.append(", p.name ");
		sql.append(", p.address ");
		sql.append(", p.bedroom ");
		sql.append(", p.barthroom ");
		sql.append(", p.area ");
		sql.append(", p.price "); 
		sql.append(", p.sells ");
		sql.append(", p.status ");
		sql.append(", c.id as id_img ");
		sql.append(", p.created_at ");
		sql.append(", p.updated_at ");
		sql.append("FROM ");
		sql.append("product AS p ");
		sql.append("INNER JOIN ");
		sql.append("image_products AS c ");
		sql.append("ON p.id = c.id_products ");
		return sql;
	}
	
	private String SqlProducts(boolean sells) {
		StringBuffer sql = SqlString();
		sql.append("WHERE 1 = 1 ");
		if (sells) {
			sql.append("AND p.sells = true ");
		}
		sql.append("GROUP BY p.id, c.id_products ");
		if (sells) {
			sql.append("LIMIT 6 ");
		}
		return sql.toString();
	}
	
	private StringBuffer SqlProductsByID(int id) {
		StringBuffer sql = SqlString();
		sql.append("WHERE 1 = 1 ");//điều kiện để lấy theo thể loại
		sql.append("AND id_category = " + id + " ");
		return sql;
	}
	
	public List<ProductsDto> GetAllProductsByID(int id) {
		String sql = SqlProductsByID(id).toString();
		List<ProductsDto> listProducts = _jdbcTemplate.query(sql, new ProductsDtoMapper());
		return listProducts;
	}
	
	private String SqlProductsPaginate(int id, int start, int totalPage) {
		StringBuffer sql = SqlProductsByID(id);
		sql.append("LIMIT " + start + ", "+ totalPage);
		return sql.toString();
	}
	
	public List<ProductsDto> GetDataProducts() {
		String sql = SqlProducts(YES);
		List<ProductsDto> listProducts = _jdbcTemplate.query(sql, new ProductsDtoMapper());
				return	listProducts;
	}
	public List<ProductsDto> GetDataProductsPaginate(int id, int start, int totalPage) {
		StringBuffer sqlGetDataByID = SqlProductsByID(id);
		List<ProductsDto> listProductsByID = _jdbcTemplate.query(sqlGetDataByID.toString(), new ProductsDtoMapper());
		List<ProductsDto> listProducts = new ArrayList<ProductsDto>();
		if(listProductsByID.size() > 0) {//listProductsByID có dữ liệu tương ứng vs danh sách sp thì thực hiện lấy sp
			String sql = SqlProductsPaginate(id, start, totalPage);
			listProducts = _jdbcTemplate.query(sql, new ProductsDtoMapper());
		}
		return listProducts;
	}
	//sql lấy chi tiết sản phẩm
	private String SqlProductByID(long id) {
		StringBuffer sql = SqlString();
		sql.append("WHERE 1 = 1 ");
		sql.append("AND p.id = " + id + " ");
		sql.append("LIMIT 1 ");
		return sql.toString();
	}
	public List<ProductsDto> GetProductByID(long id) {
		String sql = SqlProductByID(id);
		List<ProductsDto> listProduct = _jdbcTemplate.query(sql, new ProductsDtoMapper());
		return listProduct;
	}
	
	public ProductsDto FindProductByID(long id) {
		String sql = SqlProductByID(id);
		ProductsDto product = _jdbcTemplate.queryForObject(sql, new ProductsDtoMapper());
		return product;
	}
	
}
