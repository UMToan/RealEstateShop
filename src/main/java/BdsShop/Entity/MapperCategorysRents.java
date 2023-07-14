package BdsShop.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperCategorysRents implements RowMapper<CategorysRents>{
	public CategorysRents mapRow(ResultSet rs, int rowNum) throws SQLException {
		CategorysRents categorysrents = new CategorysRents();
		categorysrents.setId(rs.getInt("id_rents"));
		categorysrents.setName(rs.getString("name"));
		categorysrents.setDescription(rs.getString("description"));
		return categorysrents;
	}
}
