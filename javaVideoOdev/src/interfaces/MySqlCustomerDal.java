package interfaces;

public class MySqlCustomerDal implements CustomerDal {

	@Override
	public void add() {
		System.out.println("my sql eklendi");
		
	}//veritabanı ile ilgili opersayonlarda Dal isimlendirmesi kullanılır.

}
