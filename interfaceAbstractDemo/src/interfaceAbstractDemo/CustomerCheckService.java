package interfaceAbstractDemo;

import java.rmi.RemoteException;

public interface CustomerCheckService {
	boolean CheckIfRealPerson(Customer customer) throws RemoteException,NumberFormatException;

}
