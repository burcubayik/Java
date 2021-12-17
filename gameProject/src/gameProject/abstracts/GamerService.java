package gameProject.abstracts;

import java.rmi.RemoteException;

import gameProject.entities.Gamer;

public interface GamerService {
	 void add(Gamer gamer) throws RemoteException ;

	 void update(Gamer gamer) ;


	void delete(Gamer gamer);
}
