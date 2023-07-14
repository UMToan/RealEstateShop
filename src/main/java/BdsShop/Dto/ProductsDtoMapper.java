package BdsShop.Dto;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class ProductsDtoMapper implements RowMapper<ProductsDto>{

	public ProductsDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		ProductsDto products = new ProductsDto(); 
		products.setId_product(rs.getInt("id_product"));
		products.setId_category(rs.getInt("id_category"));
		products.setName(rs.getString("name"));
		products.setAddress(rs.getString("address"));
		products.setBedroom(rs.getInt("bedroom"));
		products.setBarthroom(rs.getInt("barthroom"));
		products.setArea(rs.getString("area"));
		products.setPrice(rs.getString("price"));
		products.setSells(rs.getInt("sells"));
		products.setStatus(rs.getString("status"));
		products.setId_img(rs.getString("id_img"));
		products.setCreated_at(rs.getDate("created_at"));
		products.setUpdated_at(rs.getDate("updated_at"));
		return products;
	}

}
