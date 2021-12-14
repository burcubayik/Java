package interfaces;

public class Main {

	public static void main(String[] args) {
		//CustomerDal customerDal= new CustomerDal(); bu kullaným yanlýþ fakat customer dal onu implemente eden classn referansýný alabilir
		CustomerDal customerDal=new OracleCustomerDal();
		

	}

}
