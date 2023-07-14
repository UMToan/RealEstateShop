package BdsShop.Entity;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import BdsShop.Dao.BillsDao;
import BdsShop.Dto.CartDto;
import BdsShop.Service.User.IBillsService;
@Service
public class BillsServiceImpl implements IBillsService{
	@Autowired
	private BillsDao billsDao; // tuong tac voi database
	
	public int AddBills(bills bills) {
		return billsDao.AddBills(bills);
	}
	public void AddbillsDetail(HashMap<Long, CartDto> carts) {
		
		long idBills = billsDao.GetIDLastBills();
		
		for(Map.Entry<Long, CartDto> itemCarts : carts.entrySet()) {
			billDetail billDetail = new billDetail();
			billDetail.setId_bills(idBills);
			billDetail.setId_products(itemCarts.getValue().getProduct().getId_product());
			billDetail.setQuanty(itemCarts.getValue().getQuanty());
			billDetail.setTotal(itemCarts.getValue().getTotalPrice());
			billsDao.AddBillsDetail(billDetail);
		}
	}
}
