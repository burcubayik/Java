package interfaces;

public class Main {

	public static void main(String[] args) {
		Logger [] loggers= {new SmsLogger(), new EmailLogger()};
		CustomerManager customerManager=new CustomerManager(loggers);
		Customer Burcu= new Customer(1,"Burcu","Bayýk");
		customerManager.add(Burcu);

	}

}
