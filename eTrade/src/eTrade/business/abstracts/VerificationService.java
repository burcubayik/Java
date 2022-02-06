package eTrade.business.abstracts;

import eTrade.entities.concretes.User;

public interface VerificationService {
	
	boolean sendToVerifyEmail(String email);
	boolean verifyEmail(String email);
	boolean checkVerify(String email);

}
