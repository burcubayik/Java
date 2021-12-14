package inheritance;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IndividualCustomer burcu= new  IndividualCustomer();
		burcu.customerNumber="12345";
		
		CorporateCustomer hepsiBurada= new CorporateCustomer();
		hepsiBurada.customerNumber="6789";
		
		 CustomerManager customerManager= new CustomerManager();
		 Customer[] customers= {burcu, hepsiBurada};
		 
		 customerManager.addMultiple(customers);
		

	}

}
