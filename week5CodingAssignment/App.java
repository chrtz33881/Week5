package week5CodingAssignment;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Logger logger = new AsteriskLogger();
		logger.log("Hello, world!");
		logger.error("Something went wrong.");

		Logger logger2 = new SpacedLogger();
		logger2.log("Hello, world!");
		logger2.error("Something went wrong.");

	}

}
