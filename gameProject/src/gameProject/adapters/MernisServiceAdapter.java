package gameProject.adapters;

import java.rmi.RemoteException;

import gameProject.abstracts.CheckGamerService;
import gameProject.entities.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CheckGamerService {

	

	@Override
	public boolean CheckIfRealPerson(Gamer gamer) throws RemoteException {
		KPSPublicSoapProxy kpsPublic= new KPSPublicSoapProxy();
		return kpsPublic.TCKimlikNoDogrula(Long.parseLong(gamer.nationalityId),gamer.firstName.toUpperCase(), gamer.lastName.toUpperCase(),gamer.dateOfBirth);
	}

}
