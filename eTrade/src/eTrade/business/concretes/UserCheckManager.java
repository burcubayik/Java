package eTrade.business.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eTrade.business.abstracts.UserCheckService;
import eTrade.entities.concretes.User;

public class UserCheckManager implements UserCheckService {
	List<String> listOfMailAdresses= new ArrayList<String>();

	@Override
	public boolean checkFirstName(User user) {
		
		if(user.getFirstName().isEmpty()) {
			System.out.println("Lütfen isim giriniz");
			return false;
		}
		
		else if(user.getFirstName().length()<2) {
			System.out.println("Hata Ýsim bilgisi iki karakterden az olamaz");
			return false; 
		}
		return true;
		
	}

	@Override
	public boolean checkLastName(User user) {
		if(user.getLastName().isEmpty()) {
			System.out.println("Lütfen soyadýnýzý giriniz");
			return false;
		}
	else if(user.getLastName().length()<2) {
			System.out.println("Hata soyadý bilgisi iki karakterden az olamaz");
			return false;
		}
		
			return true;
		
		
	}

	@Override
	public boolean checkEMail(User user) {
		String regex = "^(.+)@(.+)$";
		Pattern pattern=Pattern.compile(regex);
		Matcher matcher=pattern.matcher(user.geteMail());
		
		
		if(user.geteMail().isEmpty()) {
			System.out.println("Lütfen Emailinizi giriniz");
			return false;
		}
		else if(matcher.matches()==false) {
			System.out.println("Email adresinizi kontrol ediniz. Örnek: example@example.com");
			return false;
		}
		
		return true;
		
		
	}

	@Override
	public boolean checkPassword(User user) {
		if(user.getPassword().isEmpty()) {
			System.out.println("Parola alaný boþ býrakýlamaz. Lütfen parola giriniz.");
			return false;
		}
		else if(user.getPassword().length()<6) {
			System.out.println("Lütfen parolanýzý en az 6 karakter olacak þekilde düzenleyiniz.");
			return false;
		}
		return true;
		
	}

	

	@Override
	public boolean isUniqueEMail(User user) {
		if(listOfMailAdresses.contains(user.geteMail())) {
			
			System.out.println("Kullanýcý sistemimizde kayýtlýdýr. Giriþ yapýnýz veya baþka bir email adresi ile deneyiniz..");
		return false;
		}
		else {
			listOfMailAdresses.add(user.geteMail());
			return true;
		}
		
	}

	@Override
	public boolean isValid(User user) {
		if(checkFirstName(user)&&checkLastName(user)&&checkPassword(user)&& checkEMail(user)&& isUniqueEMail(user)) {
			return true;
		}
		return false;
	}

}
