package BdsShop.Dto;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class ProductsRentsDtoMapper implements RowMapper<ProductsRentsDto>{
	public ProductsRentsDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		ProductsRentsDto productsrents = new ProductsRentsDto(); 
		productsrents.setId_product(rs.getInt("id_product"));
		productsrents.setId_categoryrent(rs.getInt("id_categoryrent"));
		productsrents.setName(rs.getString("name"));
		productsrents.setAddress(rs.getString("address"));
		productsrents.setBedroom(rs.getInt("bedroom"));
		productsrents.setBarthroom(rs.getInt("barthroom"));
		productsrents.setArea(rs.getString("area"));
		productsrents.setPrice(rs.getString("price"));
		productsrents.setRents(rs.getInt("rents"));
		productsrents.setStatus(rs.getString("status"));
		productsrents.setId_img(rs.getString("id_img"));
		productsrents.setCreated_at(rs.getDate("created_at"));
		productsrents.setUpdated_at(rs.getDate("updated_at"));
		return productsrents;
	}
}
