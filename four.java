
public class four {
	public static void main(String []args) {
		try {
			int a = 0;
			int b = 42 / a ;
		 
		} catch(ArithmeticException e) {
			System.out.println("Unreachable part of code");
		} catch(Exception e ) {
			System.out.println("Exception catch from public class");
	}

	}
}
