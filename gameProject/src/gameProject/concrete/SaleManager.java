package gameProject.concrete;

import gameProject.abstracts.SaleService;
import gameProject.entities.Campaign;
import gameProject.entities.Game;
import gameProject.entities.Gamer;

public class SaleManager implements SaleService {


	@Override
	public void sale(Gamer gamer, Game game, Campaign campaign) {
		System.out.println(game.getGameName()+ " oyunu "+ gamer.getFirstName()+ " "+ gamer.getLastName() +" kiþisine "+
				(game.getUnitPrice()-(game.getUnitPrice()*campaign.getDiscount()/100)) +" TL tutarýnda satýldý.");
				
		
	}}
