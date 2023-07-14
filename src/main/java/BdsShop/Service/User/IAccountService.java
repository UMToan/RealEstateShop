package BdsShop.Service.User;

import BdsShop.Entity.Users;

public interface IAccountService {
	public int AddAccount(Users user);
	public Users CheckAccount(Users user);
}
