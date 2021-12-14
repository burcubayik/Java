package interfaces;

public class Utils {
	//araç classý
	public static void runLoggers(Logger[] loggers,String message) {//static belleðe atma iþini yapar
		for(Logger logger: loggers) {
			logger.log(message);
			
		}
	}

}
