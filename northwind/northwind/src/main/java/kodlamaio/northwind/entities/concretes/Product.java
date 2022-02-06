package kodlamaio.northwind.entities.concretes;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity    //hangi sınıfa ait
@Table(name= "products")   // hangi tablodaki veriler
@AllArgsConstructor//parametreli
@NoArgsConstructor//parametresiz

public class Product  {
	
	@Id   //işlemler idye göre yapılacak sorgular için bu satır gerekli
	@GeneratedValue(strategy=GenerationType.IDENTITY)  // idnin nasıl  üretildiği söylenmeli şuan yazdığımız birbir arttırılacak genelde de bu şekildedir.
	@Column(name="product_id")//hangi sütunlar
	private int id;
	
	@Column(name="category_id")
	private int categoryId;
	
	@Column(name="product_name")
	private String productName;
	
	@Column(name="unit_price")
	private double unitPrice;
	
	@Column(name="units_in_stock")
	private short unitsInStock;
	
	@Column(name="quantity_per_units")
	private String quantityPerUnit;
	
	
	

}
