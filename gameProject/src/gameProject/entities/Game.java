package gameProject.entities;

public class Game {
	Gamer gamer;
	int gameId;
	String gameName;
	double unitPrice;
	
	public Game() {
		
	}
	public Game( int gameId, String gameName, double unitPrice) {
		super();
		
		this.gameId = gameId;
		this.gameName = gameName;
		this.unitPrice = unitPrice;
		
	}
	public int getGameId() {
		return gameId;
	}
	public void setGameId(int gameId) {
		this.gameId = gameId;
	}
	public String getGameName() {
		return gameName;
	}
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	

}
