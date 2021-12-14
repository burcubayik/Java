package abstarctDemo;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager=new CustomerManager();
		customerManager.databaseManager=new OracleDatabaseManager();
		customerManager.getCustomer();

	}

}
