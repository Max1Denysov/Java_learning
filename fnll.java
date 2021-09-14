
public class fnll {
	static void procA() {
		try {
			System.out.println("In body of meth procA()");
			throw new RuntimeException("DEMONSTRATION");
		}finally {
			System.out.println("Block finally in meth procA");
		}
	}
	
	static void procB() {
		try {
			System.out.println("In body of meth procB()");
			throw new RuntimeException("DEMONSTRATION");
		}finally {
			System.out.println("Block finally in meth procB");
		}
	}
	
	static void procC() {
		try {
			System.out.println("In body of meth procC()");
			throw new RuntimeException("DEMONSTRATION");
		}finally {
			System.out.println("Block finally in meth procC");
		}
	}
	
	public static void main(String...args) {
		try {
			procA();
		} catch (Exception e) {
			System.out.println("exception catched");
		}
		procB();
		procC();
	}
}
