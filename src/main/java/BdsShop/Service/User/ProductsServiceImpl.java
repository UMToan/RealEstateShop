package BdsShop.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import BdsShop.Dao.ProductsDao;
import BdsShop.Dao.ProductsRentsDao;
import BdsShop.Dto.ProductsDto;
import BdsShop.Dto.ProductsRentsDto;
@Service
public class ProductsServiceImpl implements IProductsService{
	@Autowired
	ProductsDao productsDao = new ProductsDao();
	
	public ProductsDto GetProductsByID(long id) {
		List<ProductsDto> listProducts = productsDao.GetProductByID(id);
		return listProducts.get(0);
	}
	public List<ProductsDto> GetProductsByIDCategory(int id) {		
		return productsDao.GetAllProductsByID(id);
	}
	


	@Autowired
	ProductsRentsDao productsrentsDao = new ProductsRentsDao();
	
	public ProductsRentsDto GetProductsRentsByID(long id) {
		List<ProductsRentsDto> listProductsRents = productsrentsDao.GetProductRentsByID(id);
		return listProductsRents.get(0);
	}
	
	public List<ProductsRentsDto> GetProductsRentsByIDCategory(int id) {
		 return productsrentsDao.GetAllProductsRentsByID(id);
	}



}
