package eTrade.dataAccess.abstracts;

import eTrade.entities.concretes.User;

public interface UserDao {
	void add(User user);
	void delete(User user);
	void update(User user);
	boolean loginEmailCheck(String userEmail);
	boolean loginPasswordCheck(String userPassword);
	

}
