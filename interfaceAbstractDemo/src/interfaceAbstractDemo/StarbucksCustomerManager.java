package interfaceAbstractDemo;

import java.rmi.RemoteException;

public class StarbucksCustomerManager extends BaseCustomerManager implements CustomerCheckService{
	private CustomerCheckService customerCheckService;

	

	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService=customerCheckService;
	}

	@Override
	public void save(Customer customer) throws RemoteException, NumberFormatException {
		if(customerCheckService.CheckIfRealPerson(customer)) {
		
		super.save(customer);
		}
		else {
			System.out.println("geçersiz kullanýcý");
		}
		
		
	}

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		// TODO Auto-generated method stub
		return true;
	}

	
}
