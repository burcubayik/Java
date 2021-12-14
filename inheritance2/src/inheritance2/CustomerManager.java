package inheritance2;

public class CustomerManager {
	public void add(Logger logger) {
		System.out.println("müþteri eklendi");
		//somut sýnýflarý nwleme bir kodun içinde baþka iþ yapan sýnýf newleniyorsa o koddan hayýr bekleme
		logger.log();//sistemlerde ne olup bittiðini kontrol etmek
	}

}
