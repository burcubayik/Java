package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product product= new Product();
		product.id=1;
		product.name="Laptop";
		System.out.println(product.name);
		ProductManager productManager=new ProductManager();
		productManager.AddProduct(product);

	}

}
