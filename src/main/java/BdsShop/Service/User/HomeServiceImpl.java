package BdsShop.Service.User;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import BdsShop.Dao.CategorysDao;
import BdsShop.Dao.CategorysRentsDao;
import BdsShop.Dao.ContentDao;
import BdsShop.Dao.MenusDao;
import BdsShop.Dao.ProductsDao;
import BdsShop.Dao.ProductsRentsDao;
import BdsShop.Dto.ProductsDto;
import BdsShop.Dto.ProductsRentsDto;
import BdsShop.Entity.Categorys;
import BdsShop.Entity.CategorysRents;
import BdsShop.Entity.Content;
import BdsShop.Entity.Menus;


@Service

public class HomeServiceImpl implements IHomeService{
	@Autowired
	private ContentDao contentDao;
	@Autowired
	private CategorysDao categorysDao;
	@Autowired
	private CategorysRentsDao categorysrentsDao;
	@Autowired
	private MenusDao menusDao;
	@Autowired
	private ProductsDao productsDao;
	@Autowired
	private ProductsRentsDao productsrentsDao;

	
	public List<Content> GetDataContent(){
		return contentDao.GetDataContent();
	}
	
	
	public List<Categorys> GetDataCategorys(){
		return categorysDao.GetDataCategorys();		
	}
	
	public List<CategorysRents> GetDataCategorysRents(){
		return categorysrentsDao.GetDataCategorysRents();		
	}
	
	public List<Menus> GetDataMenus(){
		return menusDao.GetDataMenus();		
	}


	public List<ProductsDto> GetDataProducts() {
		List<ProductsDto> listProducts = productsDao.GetDataProducts();
		listProducts.get(0).getId_img();
		return listProducts;
	}
	
	public List<ProductsRentsDto> GetDataProductsRents() {
		List<ProductsRentsDto> listProductsRents = productsrentsDao.GetDataProductsRents();
		listProductsRents.get(0).getId_img();
		return listProductsRents;
	}



	


}
