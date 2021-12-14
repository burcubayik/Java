package gameProject.abstracts;

import gameProject.entities.Campaign;
import gameProject.entities.Game;
import gameProject.entities.Gamer;

public interface SaleService {
	void sale(Gamer gamer, Game game, Campaign campaign) ;

}
