
public class thrwsdm {
	static void tw() throws IllegalAccessException {
		System.out.println("In meth body");
		throw new IllegalAccessException("DEMONSTRATION");
	}
	public static void main (String ...args) {
		try {
			tw();
		} catch(IllegalAccessException e) {
			System.out.println("Exception catched: " + e);
		}
		 
	}

}
