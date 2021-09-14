
public class One {
	public static void main(String args[]) {
		int d,a;
		try {
			d = 0;
			a = 42 / d;
			System.out.println("это не выведет");
		} catch (ArithmeticException e) {
			System.out.println("Деление на нуль");
		}
		System.out.println("После оператора catch");
		
	}

}
