package gameProject;

import gameProject.concrete.GamerManager;
import gameProject.concrete.SaleManager;
import gameProject.entities.Campaign;
import gameProject.entities.Game;
import gameProject.entities.Gamer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gamer gamer=new Gamer(1,"Burcu","Bayýk", 1998, "12345678910");
		GamerManager gameManager= new GamerManager();
		gameManager.add(gamer);
		Game game=new Game(1,"Candy Crush", 1000);
		Campaign campaign=new Campaign(2,"Büyük Yýlbaþý Kampanyasý",25);
		SaleManager saleManager= new SaleManager();
		saleManager.sale(gamer, game, campaign);

	}

}
