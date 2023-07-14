package BdsShop.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperContent implements RowMapper<Content>{

	public Content mapRow(ResultSet rs, int rowNum) throws SQLException {
		Content content = new Content();
		content.setId(rs.getInt("id"));
		content.setName(rs.getString("name"));
		content.setDescription(rs.getString("description"));
		return content;
	}
}
