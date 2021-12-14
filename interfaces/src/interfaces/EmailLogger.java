package interfaces;

public class EmailLogger implements Logger {

	@Override
	public void log(String message) {
		// TODO Auto-generated method stub
		System.out.println("e mail gönderildi "+ message);
		
	}

}
