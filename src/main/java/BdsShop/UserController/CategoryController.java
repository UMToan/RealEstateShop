package BdsShop.UserController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import BdsShop.Dto.PaginatesDto;
import BdsShop.Service.User.CategoryServiceImpl;
import BdsShop.Service.User.PaginatesServiceImpl;
@Controller
public class CategoryController extends BaseController{
	
	@Autowired
	private CategoryServiceImpl categoryService;
	@Autowired
	private PaginatesServiceImpl paginatesService;
	
	private int totalProductsPage = 9;//tổng số sản phẩm trên 1 trang
	
	@RequestMapping(value = "/bat-dong-san/{id}")
	public ModelAndView Category(@PathVariable String id) {	
		_mvShare.setViewName("users/products/category");
		int totalData = categoryService.GetAllProductsByID(Integer.parseInt(id)).size();
		PaginatesDto paginateInfo = paginatesService.GetInfoPaginates(totalData, totalProductsPage, 1);
		_mvShare.addObject("categorys", _homeService.GetDataCategorys());
		_mvShare.addObject("idCategory", id);
		_mvShare.addObject("paginateInfo", paginateInfo);
		_mvShare.addObject("productsPaginate", categoryService.GetDataProductsPaginate(Integer.parseInt(id),paginateInfo.getStart(), totalProductsPage));
		return _mvShare;
	}
	
	@RequestMapping(value = "/bat-dong-san/{id}/{currentPage}")
	public ModelAndView Category(@PathVariable String id, @PathVariable String currentPage) {		
		_mvShare.setViewName("users/products/category");
		int totalData = categoryService.GetAllProductsByID(Integer.parseInt(id)).size();
		PaginatesDto paginateInfo = paginatesService.GetInfoPaginates(totalData, totalProductsPage, Integer.parseInt(currentPage));
		_mvShare.addObject("categorys", _homeService.GetDataCategorys());
		_mvShare.addObject("idCategory", id);
		_mvShare.addObject("paginateInfo", paginateInfo);
		_mvShare.addObject("productsPaginate", categoryService.GetDataProductsPaginate(Integer.parseInt(id),paginateInfo.getStart(), totalProductsPage));
		return _mvShare;
	}
	
	@RequestMapping(value = "/bat-dong-san-thue/{id}")
	public ModelAndView Categorysrents(@PathVariable String id) {
		
		_mvShare.setViewName("users/products/categorysrents");
		int totalData = categoryService.GetAllProductsRentsByID(Integer.parseInt(id)).size();
		PaginatesDto paginateInfo = paginatesService.GetInfoPaginates(totalData, totalProductsPage, 1);
		_mvShare.addObject("categorysrents", _homeService.GetDataCategorysRents());
		_mvShare.addObject("idCategory", id);
		_mvShare.addObject("paginateInfo", paginateInfo);
		_mvShare.addObject("productsRentsPaginate", categoryService.GetDataProductsRentsPaginate(Integer.parseInt(id),paginateInfo.getStart(), totalProductsPage));
		return _mvShare;
	}
	
	@RequestMapping(value = "/bat-dong-san-thue/{id}/{currentPage}")
	public ModelAndView Categorysrents(@PathVariable String id, @PathVariable String currentPage) {
		
		_mvShare.setViewName("users/products/categorysrents");
		int totalData = categoryService.GetAllProductsRentsByID(Integer.parseInt(id)).size();
		PaginatesDto paginateInfo = paginatesService.GetInfoPaginates(totalData, totalProductsPage, Integer.parseInt(currentPage));
		_mvShare.addObject("categorysrents", _homeService.GetDataCategorysRents());
		_mvShare.addObject("idCategory", id);
		_mvShare.addObject("paginateInfo", paginateInfo);
		_mvShare.addObject("productsRentsPaginate", categoryService.GetDataProductsRentsPaginate(Integer.parseInt(id),paginateInfo.getStart(), totalProductsPage));
		return _mvShare;
	}
}
