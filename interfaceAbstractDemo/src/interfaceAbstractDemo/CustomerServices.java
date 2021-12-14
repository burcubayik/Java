package interfaceAbstractDemo;

import java.rmi.RemoteException;

public interface CustomerServices {
	void save(Customer customer) throws NumberFormatException,RemoteException;

}
