package interfaceAbstractDemo;



public class Main {

	public static void main(String[] args) throws Throwable  {
		BaseCustomerManager customerManager= new StarbucksCustomerManager(new MernisServiceAdapter());
		Customer customer=new Customer(1,"bbbb","aaaaa",1990,"11111111111");
		customerManager.save(customer);
		

	}

}
