package interfaces;


	
	


public class CustomerManager {
	//neye baðýmlýysak private alaný olarak yazýyoruz
	private Logger[] loggers;
	
	public CustomerManager(Logger[] loggers) {
		super();
		this.loggers = loggers;
	}
	// iki  tip baðlanma var
	//loosly or tightly
	
	public void add(Customer customer) {
		System.out.println("müþteri eklendi"+ customer.getFirstName() );
		
		Utils.runLoggers(loggers, customer.getFirstName());
		
		
		
	}
	public void delete(Customer customer) {
		System.out.println("müþteri silindi"+customer.getFirstName());
		Utils.runLoggers(loggers, customer.getLastName());
		
		
		
	}

}
