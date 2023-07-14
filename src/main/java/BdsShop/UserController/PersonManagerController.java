package BdsShop.UserController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import BdsShop.Dao.UsersDao;
import BdsShop.Entity.Users;
import BdsShop.Entity.bills;
import BdsShop.Service.User.AccountServiceImpl;

@Controller
public class PersonManagerController extends BaseController{
	@Autowired
	AccountServiceImpl accountService = new AccountServiceImpl();
	
	@RequestMapping(value = "PersonManager", method = RequestMethod.GET)
	public ModelAndView Checkout(HttpServletRequest request,HttpSession session) {
		_mvShare.setViewName("users/post/PersonManager");
		bills bills = new bills();//khoi tao 1 doi tuong bills moi la entity bills
		Users loginInfo = (Users)session.getAttribute("LoginInfo");// lay thong tin login
		if(loginInfo != null) {//!null nghia la usser da login roi
			bills.setDisplay_name(loginInfo.getDisplay_name());
			bills.setUser(loginInfo.getUsername());
			bills.setTotal(loginInfo.getPassword());

		}
		_mvShare.addObject("bills",bills);//"bills" dinh dang lai cho bills 
		return _mvShare;
	}
}
