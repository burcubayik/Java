package eTrade;

import eTrade.business.concretes.UserCheckManager;
import eTrade.business.concretes.UserManager;
import eTrade.business.concretes.VerificationManager;
import eTrade.dataAccess.concretes.HibernateUserDao;
import eTrade.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		User user1= new User(1,"Burcu","Bayýk","bcfssf3@ghj.com","123456");
		User user2= new User(1,"Duygu","Bayýk","bcff3@ghj.com","123456");
		UserManager customerManager= new UserManager(new UserCheckManager(), new VerificationManager(), new HibernateUserDao());
		customerManager.signUp(user1);
		customerManager.signUp(user2);
		
		

	}

}
