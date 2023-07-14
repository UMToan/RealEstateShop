package BdsShop.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import BdsShop.Entity.Content;
import BdsShop.Entity.MapperContent;



@Repository
public class ContentDao extends BaseDao{

	public List<Content> GetDataContent(){
		List<Content> list = new ArrayList<Content>();
		String sql = "SELECT * FROM categorys";
		list = _jdbcTemplate.query(sql, new MapperContent());
		return list;
	}
	

}
