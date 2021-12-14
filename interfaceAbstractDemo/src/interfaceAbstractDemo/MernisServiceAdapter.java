package interfaceAbstractDemo;

import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) throws RemoteException, NumberFormatException {
		
		KPSPublicSoapProxy kpsPublic =new KPSPublicSoapProxy();
		return kpsPublic.TCKimlikNoDogrula(Long.parseLong(customer.nationalityId), customer.firstName.toUpperCase(), customer.lastName.toUpperCase(), customer.dateOfBirth);
		
	}

}
