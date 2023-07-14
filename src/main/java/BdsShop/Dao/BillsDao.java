package BdsShop.Dao;

import org.springframework.stereotype.Repository;
import BdsShop.Entity.billDetail;
import BdsShop.Entity.bills;

@Repository
public class BillsDao extends BaseDao{
	
	public int AddBills(bills bills) {
		StringBuffer sql = new StringBuffer();
		sql.append("INSERT INTO bills ");
		sql.append("( ");
		sql.append("	`user`, `phone`, `display_name`, `address`, `total`, `quanty`, `note` ");
		sql.append(") ");
		sql.append("VALUES ");
		sql.append("( ");
		sql.append("	 '"+bills.getUser()+"', ");
		sql.append("	 '"+bills.getPhone()+"', ");
		sql.append("	 '"+bills.getDisplay_name()+"', ");
		sql.append("	 '"+bills.getAddress()+"', ");
		sql.append("	 '"+bills.getTotal()+"', ");
		sql.append("	 "+bills.getQuanty()+", ");
		sql.append("	 '"+bills.getNote()+"' ");
		sql.append(");");
		int insert = _jdbcTemplate.update(sql.toString());		
		return insert;
	};
	public long GetIDLastBills() {
		StringBuffer sql = new StringBuffer();
		sql.append("SELECT MAX(id) FROM bills;");
		long id = _jdbcTemplate.queryForObject(sql.toString(), new Object[] {}, Long.class);
		return id;
	};
	public int AddBillsDetail(billDetail billDetail) {
		StringBuffer  sql = new StringBuffer();
		sql.append("INSERT INTO billdetail ");
		sql.append("( ");
		sql.append("	id_products, ");
		sql.append("	id_bills, ");
		sql.append("	quanty, ");
		sql.append("	total ");
		sql.append(") ");
		sql.append("VALUES ( ");
		sql.append("	"+billDetail.getId_products()+", ");
		sql.append("	"+billDetail.getId_bills()+", ");
		sql.append("	"+billDetail.getQuanty()+", ");
		sql.append("	'"+billDetail.getTotal()+"' ");
		sql.append(")");
		int insert = _jdbcTemplate.update(sql.toString());
		return insert;
	};
}
