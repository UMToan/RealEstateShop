package BdsShop.Service.User;

import java.util.HashMap;

import org.springframework.stereotype.Service;

import BdsShop.Dto.CartDto;
import BdsShop.Entity.bills;

@Service
public interface IBillsService {
	public int AddBills(bills bills);
	
	public void AddbillsDetail(HashMap<Long, CartDto> carts);
}
