package BdsShop.UserController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class PostController extends BaseController{
	@RequestMapping(value="/post", method = RequestMethod.GET)
	public ModelAndView Post() {
		_mvShare.setViewName("users/post/newPost");
		return _mvShare;
	}
}
