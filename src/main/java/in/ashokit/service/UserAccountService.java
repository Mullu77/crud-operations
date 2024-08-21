package in.ashokit.service;

import java.util.List;

import in.ashokit.entity.UserAccount;

public interface UserAccountService {
	
	// save() ui @ inser+update(user registration page)
	public String saveOrUpdateUserAcc(UserAccount userAcc);
	
	//find all() db table all records on ui
	public List<UserAccount> getAllUserAccounts();
	
	//edit icon on ui
	public UserAccount getUserAcc(Integer userId);
	
	public boolean deleteUserAcc(Integer userId);
	
	
	// activate and deactivate
	public boolean updateUserAccStatus(Integer userId, String status);
	
	

}
