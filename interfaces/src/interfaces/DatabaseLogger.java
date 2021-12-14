package interfaces;

public class DatabaseLogger implements Logger{

	@Override//kodu ezmek için kullanýlýr
	public void log(String message) {
		System.out.println("database loglandý"+message);
		
		
	}

}
