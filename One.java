
public class One {
	public static void main(String args[]) {
		int d,a;
		try {
			d = 0;
			a = 42 / d;
			System.out.println("��� �� �������");
		} catch (ArithmeticException e) {
			System.out.println("������� �� ����");
		}
		System.out.println("����� ��������� catch");
		
	}

}
