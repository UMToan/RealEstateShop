package BdsShop.UserController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import BdsShop.Service.User.IProductDetailService;

@Controller
public class ProductRentsController extends BaseController{
	
	@Autowired
	private IProductDetailService _productDetailService;
	
	
	@RequestMapping(value = { "chi-tiet-bat-dong-san-thue/{id}" })//id là id sản phẩm
	public ModelAndView Index(@PathVariable long id) {		
		_mvShare.setViewName("users/products/productRents");
		_mvShare.addObject("productRents", _productDetailService.GetProductRentsByID(id));
		return _mvShare;
	}

}

