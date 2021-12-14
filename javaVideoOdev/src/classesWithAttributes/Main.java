package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product product=new Product();
		product.setId(1);
		product.setName("laptop");
		product.setDescription("asus");
		product.setPrice(16000);
		product.setStockAmount(2);
		 
		System.out.println(product.getKod());
		
		Product product2= new Product(2,"telefon","realme",2500,3);
		System.out.println(product2.getName());
		System.out.println(product2.getKod());

	}

}
