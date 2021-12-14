package inheritance2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//birbirinin LTERNATÝFÝ OLAN KODLAR ÝÇÝN ÝF KULLAILMAZ
		CustomerManager customerManager = new CustomerManager();
		customerManager.add(new EmailLogger());
	}

}
