package eTrade.business.concretes;

import eTrade.business.abstracts.UserService;
import eTrade.dataAccess.concretes.HibernateUserDao;
import eTrade.entities.concretes.User;

public class UserManager implements UserService {
	UserCheckManager userCheckManager;
	VerificationManager verificationManager;
	HibernateUserDao hibernateUserDao;


	public UserManager(UserCheckManager userCheckManager, VerificationManager verificationManager,
			HibernateUserDao hibernateUserDao) {
		
		this.userCheckManager = userCheckManager;
		this.verificationManager = verificationManager;
		this.hibernateUserDao = hibernateUserDao;
	}

	@Override
	public void signUp(User user) {
		if(userCheckManager.isValid(user)) {
			
			verificationManager.sendToVerifyEmail(user.geteMail());
			
			}
		if(verificationManager.verifiedEmailList.contains(user.geteMail())) {
			System.out.println("kullanýcý baþarýyla eklendi"+  user.getFirstName());
			hibernateUserDao.add(user);
			
		}
		
	}

	@Override
	public void signIn(User user) {
		verificationManager.verifyEmail(user.geteMail());
		if(hibernateUserDao.loginEmailCheck(user.geteMail())&& hibernateUserDao.loginPasswordCheck(user.getPassword())&&verificationManager.checkVerify(user.geteMail()) ) {
			System.out.println("Giriþ baþarýlý.");
			
		}
		else {
			System.out.println("lütfen bilgilerinizi  kontrol edin.");
		}
			
			
		
		
	}

}
