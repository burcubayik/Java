package eTrade.business.concretes;

import java.util.ArrayList;
import java.util.List;

import eTrade.business.abstracts.VerificationService;

public class VerificationManager implements VerificationService {
	List<String> verifiedEmailList=new ArrayList<String>();

	@Override
	public boolean sendToVerifyEmail(String email) {
		System.out.println(email+ " hesabýna doðrulama epostasý gönderildi.");
		
		return false;
	}

	@Override
	public boolean verifyEmail(String email) {
		verifiedEmailList.add(email);
		System.out.println("Hesap baþarýyla doðrulandý.");
		
		return false;
	}

	@Override
	public boolean checkVerify(String email) {
		if(verifiedEmailList.contains(email)) {
			return true;
		}
		return false;
	}

}
