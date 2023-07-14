package BdsShop.UserController;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class HomeController extends BaseController{
	
	@RequestMapping(value = {"/", "/trang-chu"})
	public ModelAndView Index() {
		//ModelAndView: view là trả về gdien jsp, model là set dc dữ liệu truyền về cho view
		//ModelAndView mv = new ModelAndView("user/index");//cách 1ư
		//mv.addObject("content", homeDao.GetDataContent());
		_mvShare.addObject("categorys", _homeService.GetDataCategorys());
		_mvShare.addObject("categorysrents", _homeService.GetDataCategorysRents());
		_mvShare.addObject("products", _homeService.GetDataProducts());
		//_mvShare.addObject("sells", _homeService.GetDataProducts());
		//_mvShare.addObject("rents", _homeService.GetDataProducts());
		_mvShare.addObject("productsrents", _homeService.GetDataProductsRents());
		
		//mv.setViewName("user/index");cách 2
		_mvShare.setViewName("users/index");
		
		
		return _mvShare;
	}


}
