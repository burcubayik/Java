package oopIntro;

public class Product {
	//encapsulation
	private int id; //final elemanlarý dýþarýdan eriþim noktasýnda kýsýtlar. final sadece constructure da set edilebilir demektir.
	private String name;//private sadece bu classta çalýþýr dýþarýdan eriþimi engellemek için kullanýlýr.
	private double unitPrice;
	private String detail;
	private double discount;
	
	
	public Product() {}
	
	
	public Product(int id, String name, double unitPrice, String detail, double discount) {
		super();
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
		this.discount=discount;
	
	}
	
	public int getId() {
		return id;//okumak için return name kullanýlýr. gelen deðeri bir yere atayacaðýz.
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public double getUnitPriceAfterDiscount() {
		return this.unitPrice-(this.unitPrice*this.discount/100);
	}
	
	//constructror bloðu yazma
	//rule : bir constructor çalýþmak zorunda ayný tipte yazýlanlar çalýþýr ( AYNI ÝMZA)
	
	/*public Product() {
		System.out.println("çalýþýyorumm");
	}
	public Product(int id, String name, double unitPrice, String detail) {
		//çalýþýyorumm constructorunun çalýþmasý için
		this(); //yapmak gerekir.constructorlar kendi içinde çalýþabilir.
		this.id=id; //this classtaki demektir.
		this.name=name;
		this.detail=detail;
		this.unitPrice= unitPrice;
	}*/
	
	
	

}
