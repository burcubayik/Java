package gameProject.concrete;

import gameProject.abstracts.GameService;
import gameProject.entities.Game;

public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		System.out.println("Oyunlara eklendi: " + game.getGameName());
	
		
	}

	@Override
	public void delete(Game game) {
		System.out.println("Silindi: " + game.getGameName());
		
	}

	@Override
	public void update(Game game) {
		System.out.println("Güncellendi: " + game.getGameName());
		
	}

}
