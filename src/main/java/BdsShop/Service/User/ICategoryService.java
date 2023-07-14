package BdsShop.Service.User;

import java.util.List;


import org.springframework.stereotype.Service;

import BdsShop.Dto.ProductsDto;
import BdsShop.Dto.ProductsRentsDto;

@Service
public interface ICategoryService {

	public List<ProductsDto> GetAllProductsByID(int id);
	

	public List<ProductsRentsDto> GetAllProductsRentsByID(int id);
}
