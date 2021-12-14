package interfaceAbstractDemo;

import java.rmi.RemoteException;

public abstract class BaseCustomerManager implements CustomerServices{

	@Override
	public void save(Customer customer) throws RemoteException, NumberFormatException  {
		System.out.println("db kaydedildi"+ customer.firstName);
		
	}

}
