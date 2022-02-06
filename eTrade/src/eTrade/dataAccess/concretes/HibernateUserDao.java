package eTrade.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eTrade.business.concretes.VerificationManager;
import eTrade.dataAccess.abstracts.UserDao;
import eTrade.entities.concretes.User;

public class HibernateUserDao implements UserDao {
	VerificationManager verificationManager;
	User  user;
	List<User> users=new ArrayList<User>();

	@Override
	public void add(User user) {
		users.add(user);
		
		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean loginEmailCheck(String userEmail) {
		
			for(User user: users) {
			if(user.geteMail()==userEmail) {
				return true;
			}
			
		}
		return false;
		
		
	}

	@Override
	public boolean loginPasswordCheck(String userPassword) {
		for(User user: users) {
			if(user.getPassword()==userPassword) {
				return true;
			}
			
		}
		return false;
		
	}

}
