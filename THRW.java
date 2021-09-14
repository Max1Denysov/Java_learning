
public class THRW {
	
	static void demo() {
		try {
			throw new NullPointerException("DEMONSTRATION");
		} catch(NullPointerException e) {
			System.out.println(" exception catched in body of method demo: " + e);
			throw e;
		}
	}
	public static void main(String...args) {
		try {
			demo();
			
		}catch(NullPointerException e) {
			System.out.println("Re-catched: " + e);
		}
	}
}
