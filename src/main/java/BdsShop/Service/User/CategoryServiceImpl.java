package BdsShop.Service.User;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import BdsShop.Dao.ProductsDao;
import BdsShop.Dao.ProductsRentsDao;
import BdsShop.Dto.ProductsDto;
import BdsShop.Dto.ProductsRentsDto;
@Service
public class CategoryServiceImpl implements ICategoryService{
	@Autowired
	private ProductsDao productsDao;
	
	public List<ProductsDto> GetAllProductsByID(int id) {
		return productsDao.GetAllProductsByID(id);
	}
	
	public List<ProductsDto> GetDataProductsPaginate(int id, int start, int totalPage){
		return productsDao.GetDataProductsPaginate(id, start, totalPage);
	}
	
	@Autowired
	private ProductsRentsDao productsrentsDao;
	
	public List<ProductsRentsDto> GetAllProductsRentsByID(int id) {
		return productsrentsDao.GetAllProductsRentsByID(id);
	}
	
	public List<ProductsRentsDto> GetDataProductsRentsPaginate(int start, int id, int totalPage){
		return productsrentsDao.GetDataProductsRentsPaginate(start, id, totalPage);
	}
}
