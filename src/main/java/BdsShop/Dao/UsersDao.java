package BdsShop.Dao;

import org.springframework.stereotype.Repository;

import BdsShop.Entity.MapperUser;
import BdsShop.Entity.Users;
@Repository
public class UsersDao extends BaseDao{
	
	public int AddAccount(Users user) {
		StringBuffer  sql = new StringBuffer();
		sql.append("INSERT ");
		sql.append("INTO user ");
		sql.append("( ");
		sql.append("    username, ");
		sql.append("    password, ");
		sql.append("    display_name, ");
		sql.append("    isSell, ");
		sql.append("    isAdmin ");
		sql.append(") ");
		sql.append("VALUES ");
		sql.append("( ");
		sql.append("    '"+user.getUsername()+"', ");
		sql.append("    '"+user.getPassword()+"', ");
		sql.append("    '"+user.getDisplay_name()+"', ");
		sql.append("   '"+user.getIsSell()+"', ");
		sql.append("   '"+user.getIsAdmin()+"' ");
		sql.append(")");	
		int insert = _jdbcTemplate.update(sql.toString());
		return insert;
	}
	public Users GetUserByAcc(Users user) {
		String sql = "SELECT * FROM user WHERE username='"+user.getUsername()+"'";
		Users rerult = _jdbcTemplate.queryForObject(sql, new MapperUser());
		return rerult;
	};
	
}
