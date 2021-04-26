
public abstract class AsteriskLogger implements Logger{

	public static void main(String[] args) {
		//  should print out the String it receives between 
		//3 asterisks on either side of the String 
		//(e.g. if the String passed in is “Hello”, 
		//then it should print ***Hello*** to the console
		
		

	}

	@Override
	public void log(String log) {
		System.out.println("***"+log+"***");
		
		
	}

	@Override
	public void error(String log) {
		System.out.println("**********");
		System.out.println("***Error Hello***");
		System.out.println("*********");
		
		
		
	      
		
	}

}
