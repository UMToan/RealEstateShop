package BdsShop.Service.User;


import org.springframework.stereotype.Service;

import BdsShop.Dto.ProductsDto;
import BdsShop.Dto.ProductsRentsDto;


@Service
public interface IProductDetailService {
	public ProductsDto GetProductByID(long id);//trả về 1 sp thôi chứ cần list nữa
	
	
	public ProductsRentsDto GetProductRentsByID(long id);
}
