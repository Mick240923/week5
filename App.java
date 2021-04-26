
public class App {
	
	Logger astLogger;

	public static void main(String[] args) {
		Logger asteriskLogger = new AsteriskLogger();
		Logger astLogger;
		asteriskLogger.log("Hello");
		Logger asteriskError = new AsteriskLogger();
		asteriskLogger.error("Oops, this is an error!");
		
	Logger spcLogger;
		
		Logger spacedLogger = new SpacedLogger();
		Logger spcLog;
		spacedLogger.log("C'mon man!");
		Logger spacederror = new SpacedError();
		spacedLogger.error("This is not a Test");
	

	}

}
