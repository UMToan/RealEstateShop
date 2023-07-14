package BdsShop.UserController;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import BdsShop.Dto.CartDto;
import BdsShop.Entity.BillsServiceImpl;
import BdsShop.Entity.Users;
import BdsShop.Entity.bills;
import BdsShop.Service.User.CartServiceImpl;

@Controller
public class CartController extends BaseController {
	@Autowired
	private CartServiceImpl cartService = new CartServiceImpl();
	@Autowired
	private BillsServiceImpl billsService = new BillsServiceImpl();
	
	@RequestMapping(value = "tu-van")
	public ModelAndView Index() {
		_mvShare.addObject("categorys", _homeService.GetDataCategorys());
		_mvShare.addObject("categorysrents", _homeService.GetDataCategorysRents());
		_mvShare.addObject("products", _homeService.GetDataProducts());
		_mvShare.addObject("productsrents", _homeService.GetDataProductsRents());
		_mvShare.setViewName("users/carl/list");
		return _mvShare;
	}

	@RequestMapping(value = "Booking/{id}")
	public String AddCart(HttpServletRequest request,HttpSession session, @PathVariable long id) {
		HashMap<Long, CartDto> cart = (HashMap<Long, CartDto>) session.getAttribute("Cart");
		if (cart == null) {
			cart = new HashMap<Long, CartDto>();
		}
		cart = cartService.AddCart(id, cart);
		session.setAttribute("Cart", cart);
		session.setAttribute("TotalQuantyCart", cartService.TotalQuanty(cart));
		session.setAttribute("TotalPriceCart", cartService.TotalPrice(cart));
//		return "redirect:/chi-tiet-bat-dong-san/" + id;
		return "redirect:"+request.getHeader("Referer");
	}
	
	@RequestMapping(value = "EditBooking/{id}/{quanty}")
	public String EditCart(HttpServletRequest request,HttpSession session, @PathVariable long id,@PathVariable int quanty) {
		HashMap<Long, CartDto> cart = (HashMap<Long, CartDto>) session.getAttribute("Cart");
		if (cart == null) {
			cart = new HashMap<Long, CartDto>();
		}
		cart = cartService.EditCart(id, quanty, cart);
		session.setAttribute("Cart", cart);
		session.setAttribute("TotalQuantyCart", cartService.TotalQuanty(cart));
		return "redirect:"+request.getHeader("Referer");
	}
	
	@RequestMapping(value = "DelBooking/{id}")
	public String DelCart(HttpServletRequest request,HttpSession session, @PathVariable long id) {
		HashMap<Long, CartDto> cart = (HashMap<Long, CartDto>) session.getAttribute("Cart");
		if (cart == null) {
			cart = new HashMap<Long, CartDto>();
		}
		cart = cartService.DeleteCart(id, cart);
		session.setAttribute("Cart", cart);
		session.setAttribute("TotalQuantyCart", cartService.TotalQuanty(cart));
		return "redirect:"+request.getHeader("Referer");
	}
	
	@RequestMapping(value = "checkout", method = RequestMethod.GET)
	public ModelAndView Checkout(HttpServletRequest request,HttpSession session) {
		_mvShare.setViewName("users/booking/checkout");
		bills bills = new bills();//khoi tao 1 doi tuong bills moi la entity bills
		Users loginInfo = (Users)session.getAttribute("LoginInfo");// lay thong tin login
		if(loginInfo != null) {//!null nghia la usser da login roi
			bills.setDisplay_name(loginInfo.getDisplay_name());
			bills.setUser(loginInfo.getUsername());
		}
		_mvShare.addObject("bills",bills);//"bills" dinh dang lai cho bills 
		return _mvShare;
	}
	
	
	@RequestMapping(value = "checkout", method = RequestMethod.POST)
	public String CheckoutBill(HttpServletRequest request,HttpSession session,@ModelAttribute("bills") bills bills) {
//		bills.setQuanty(Integer.parseInt((String)session.getAttribute("TotalQuantyCart")));
		if(billsService.AddBills(bills) > 0) {
			HashMap<Long, CartDto> carts = (HashMap<Long, CartDto>)session.getAttribute("Cart");
			billsService.AddbillsDetail(carts);
		}
		session.removeAttribute("Cart");
		return "redirect:tu-van";	
	}
}
