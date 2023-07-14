package BdsShop.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import BdsShop.Dto.ProductsDto;
import BdsShop.Dto.ProductsRentsDto;
import BdsShop.Entity.Categorys;
import BdsShop.Entity.CategorysRents;
import BdsShop.Entity.Menus;

@Service
public interface IHomeService {
	@Autowired
	public List<Categorys> GetDataCategorys();
	@Autowired
	public List<CategorysRents> GetDataCategorysRents();
	@Autowired
	public List<Menus> GetDataMenus();
	@Autowired
	public List<ProductsDto> GetDataProducts();
	@Autowired
	public List<ProductsRentsDto> GetDataProductsRents();

	
}
