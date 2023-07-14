package BdsShop.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import BdsShop.Dao.ProductsDao;
import BdsShop.Dao.ProductsRentsDao;
import BdsShop.Dto.ProductsDto;
import BdsShop.Dto.ProductsRentsDto;
@Service
public class ProductDetailServiceImpl implements IProductDetailService{
	@Autowired
	ProductsDao productsDao = new ProductsDao();
	
	@Autowired
	ProductsRentsDao productsRentsDao = new ProductsRentsDao();
	
	public ProductsDto GetProductByID(long id) {
		List<ProductsDto> listProducts = productsDao.GetProductByID(id);
		return listProducts.get(0);//trả về sp đầu tiên
	}

	public ProductsRentsDto GetProductRentsByID(long id) {
		List<ProductsRentsDto> listProductsRents = productsRentsDao.GetProductRentsByID(id);
		return listProductsRents.get(0);
	}



	
	
	


}
