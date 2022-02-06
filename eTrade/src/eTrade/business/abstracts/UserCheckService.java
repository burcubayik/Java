package eTrade.business.abstracts;

import eTrade.entities.concretes.User;

public interface UserCheckService {
	boolean checkFirstName(User user);
	boolean checkLastName(User user);
	boolean checkEMail(User user);
	boolean checkPassword(User user);
	boolean isUniqueEMail(User user);
	boolean isValid(User user);

}
