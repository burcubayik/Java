package gameProject.concrete;

import java.rmi.RemoteException;

import gameProject.abstracts.CheckGamerService;
import gameProject.entities.Gamer;

public class CheckGamerManager implements CheckGamerService {

	@Override
	public boolean CheckIfRealPerson(Gamer gamer) throws RemoteException {
		// TODO Auto-generated method stub
		return true;
	}

}
