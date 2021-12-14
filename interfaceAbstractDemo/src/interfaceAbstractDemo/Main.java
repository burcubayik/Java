package interfaceAbstractDemo;



public class Main {

	public static void main(String[] args) throws Throwable  {
		BaseCustomerManager customerManager= new StarbucksCustomerManager(new MernisServiceAdapter());
		Customer customer=new Customer(1,"Burcu","Bayýk",1998,"29221334770");
		customerManager.save(customer);
		

	}

}
