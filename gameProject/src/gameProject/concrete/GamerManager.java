package gameProject.concrete;

import gameProject.abstracts.GamerService;
import gameProject.entities.Gamer;

public class GamerManager implements GamerService {
	

	Gamer gamer;

	@Override
	public void add(Gamer gamer) {
		System.out.println("kullanıcı eklendi :"+ gamer.getFirstName());
		
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("kullanıcı güncellendi :"+ gamer.getFirstName());
		
	}

	@Override
	public void delete(Gamer gamer) {
		
		System.out.println("kullanıcı silindi :"+ gamer.getFirstName());
	}
	
	

	

}
