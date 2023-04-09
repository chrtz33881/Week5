package week5;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Logger logger = new FileLogger();
		
		logger.info("Hello");
		
		logger.warning("This is a warning");
		
		logger.error("Ooops, this is an error!");
		
		logger.fatal("Fatal error");

	}

}
