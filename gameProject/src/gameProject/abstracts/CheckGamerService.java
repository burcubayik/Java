package gameProject.abstracts;

import java.rmi.RemoteException;

import gameProject.entities.Gamer;

public interface CheckGamerService {
	
	boolean CheckIfRealPerson(Gamer gamer) throws RemoteException;
}