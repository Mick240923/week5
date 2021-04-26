
public abstract class SpacedLogger implements Logger{

	public static void main(String[] args) {
		
	}

	@Override
	public void log(String log) {
		StringBuilder result = new StringBuilder();
		for(int i = 0; i < log.length(); i++) {
			if( i >0) {
				result.append(" ");
			}result.append(log.charAt(i));
		}System.out.println(result.toString());
	}

	@Override
	public void error(String error) {
		StringBuilder result = new StringBuilder();
		for(int i = 0; i < error.length(); i++) {
			if( i >0) {
				result.append(" ");
			}result.append(error.charAt(i));
		}System.out.println("ERROR: " + result.toString());
	  
		
	}

}
