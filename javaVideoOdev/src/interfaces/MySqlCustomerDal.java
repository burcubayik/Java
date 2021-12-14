package interfaces;

public class MySqlCustomerDal implements CustomerDal {

	@Override
	public void add() {
		System.out.println("my sql eklendi");
		
	}//veritabaný ile ilgili opersayonlarda Dal isimlendirmesi kullanýlýr.

}
