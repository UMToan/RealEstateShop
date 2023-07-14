package BdsShop.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import BdsShop.Entity.CategorysRents;
import BdsShop.Entity.MapperCategorysRents;



@Repository
public class CategorysRentsDao extends BaseDao{

	public List<CategorysRents> GetDataCategorysRents(){
		List<CategorysRents> list = new ArrayList<CategorysRents>();
		String sql = "SELECT * FROM categorysrents";
		list = _jdbcTemplate.query(sql, new MapperCategorysRents());
		return list;
	}
	

}