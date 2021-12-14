package oopIntro;

public class Category {
	private int id;
	private String name;
	
	public Category(){
		
	}
	public int getId() {
		return this.id;
	}
	public void setId(int id) {
	this.id=id;
	}
	public String getName() {
		return this.name+ " kategorisi";
	}
	public void setName(String name)
	{
		this.name=name;
	}
	

}
