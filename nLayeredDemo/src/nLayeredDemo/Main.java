package nLayeredDemo;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.core.JloggerManagerAdapter;
import nLayeredDemo.dataAccess.concretes.AbcProductDao;

import nLayeredDemo.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {
		//Entityler hariç newleme sorun çýkarýr
		ProductService productService= new ProductManager(new AbcProductDao(), new JloggerManagerAdapter());
		Product product= new Product(2,1,"Elma",12,50);
		productService.add(product);
		

	}

}
