package BdsShop.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperUser implements RowMapper<Users>{
	public Users mapRow(ResultSet rs, int rowNum) throws SQLException{
		Users user = new Users();
		user.setId(rs.getInt("id"));
		user.setUsername(rs.getString("username"));
		user.setPassword(rs.getString("password"));
		user.setDisplay_name(rs.getString("display_name"));
		user.setIsSell(rs.getInt("issell"));
		user.setIsAdmin(rs.getInt("isadmin"));
		return user;
	}
}
