package in.ashokit.service;

import java.util.List;
import java.util.Optional;

import in.ashokit.entity.UserAccount;
import in.ashokit.rep.UserAccountRepo;

public class UserAccountServiceImpl implements UserAccountService {

	private UserAccountRepo userAccRepo;

	@Override // 1
	public String saveOrUpdateUserAcc(UserAccount userAcc) {
		Integer userId = userAcc.getUserId();
		userAccRepo.save(userAcc);

		if (userId == null) {
			return "user record saved";
		} else {
			return "user record updated ";
		}

	}

	@Override // 2
	public List<UserAccount> getAllUserAccounts() {

		List<UserAccount> Account = userAccRepo.findAll();
		return Account;

	}

	@Override // 3
	public UserAccount getUserAcc(Integer userId) {
		Optional<UserAccount> findById = userAccRepo.findById(userId);
		if (findById.isPresent()) {
			return findById.get();
		}
		return null;
	}

	@Override // 4
	public boolean deleteUserAcc(Integer userId) {

		/*
		 * try { userAccRepo.deleteById(userId); return true; } catch (Exception e) {
		 * e.printStackTrace();
		 * 
		 * }return false;
		 */
		boolean existsById = userAccRepo.existsById(userId);
		if (existsById) {
			userAccRepo.deleteById(userId);
			return true;
		}
		return false;

	}

	@Override//5
	public boolean updateUserAccStatus(Integer userId, String status) {
		
	try {
		userAccRepo.updateUserAccStatusById(userId, status);
		return true;
	}catch(Exception e){
		e.printStackTrace();
	}
	return false;
	}
	}


