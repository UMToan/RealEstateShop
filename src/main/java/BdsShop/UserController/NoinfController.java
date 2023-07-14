package BdsShop.UserController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class NoinfController extends BaseController{
	@RequestMapping(value="/noinf", method = RequestMethod.GET)
	public ModelAndView noinf() {
		_mvShare.setViewName("users/post/noinf");
		return _mvShare;
	}
}
