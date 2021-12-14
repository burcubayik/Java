package oopIntro;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product product1= new Product(1,"lenovo14",16000,"16 gb ram",10);//örnek olþturma,referans oluþturma, instance oluþturma
		
		
		Product product2= new Product();
		product2.setId(1);
		product2.setName("lenovo v15");
		product2.setDetail("16 gb ram");
		product2.setDiscount(10);
		product2.setUnitPrice(16000);
		
		System.out.println(product2.getUnitPriceAfterDiscount());
		
		Category category1= new Category();
		category1.setId(1);
		category1.setName("içecek");
		
		Category category2= new Category();
		category2.setId(2);
		category2.setName("yiyecek");
		System.out.println(category1.getName());
		System.out.println(category2.getName());
		

	}

}
