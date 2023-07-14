package BdsShop.Service.User;
import java.util.List;
import org.springframework.stereotype.Service;

import BdsShop.Dto.ProductsDto;
import BdsShop.Dto.ProductsRentsDto;

@Service
public interface IProductsService {

	public ProductsDto GetProductsByID (long id);
	public List<ProductsDto> GetProductsByIDCategory(int id);
	

	public ProductsRentsDto GetProductsRentsByID (long id);
	public List<ProductsRentsDto> GetProductsRentsByIDCategory(int id);
	
	
}
