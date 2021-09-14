
public class six{
	static void ness(int a) {
		try {
			if(a == 1)
				a = a /(a-a);
			if(a == 2) {
				int c[] = {1};
				c[42] = 99;
				}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Index out: " + e);
		}
	}




 
	public static void main(String...args) {
		try {
			int a = args.length;
			int b = 42 / a;
			System.out.println("a = " + a);
			ness(a);
		}catch(ArithmeticException e) {
			System.out.println("Division by zero: " + e);
		}
	}

}
