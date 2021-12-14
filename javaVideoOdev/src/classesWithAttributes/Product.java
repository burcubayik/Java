package classesWithAttributes;


public class Product {
	
	public Product(int id, String name, String description, double price, int stockAmount) {
		//overlooding
		System.out.println("yapýcý blok çalýþtý.");
		this.id=id;
		this.description=description;
		this.name=name;
		this.price=price;
		this.stockAmount=stockAmount;
		
	}
	public Product() {
		
	}
	
	//attribute or fields
	private int id;
	private String name;
	private String description;
	private double price;
	private int stockAmount;
	String kod;
	
	
	//getter
	public int getId() {
		return id;
	}
	//setter
	public void setId(int id) {//int id diye bir alan verilmeli
		this.id=id;//this bu classýn idsi
		
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getStockAmount() {
		return stockAmount;
	}
	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}
	public String getKod() {
		return this.name.substring(0, 1)+ id;
		
	}

}
