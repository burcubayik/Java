package interfaces;

public class OracleCustomerDal implements CustomerDal, Repository{

	@Override
	public void add() {
		System.out.println("oracle eklendi");
		
	}

}
