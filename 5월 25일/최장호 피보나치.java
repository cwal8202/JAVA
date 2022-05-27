// ;피보나치 수열 100 이하로만!

public class Fibonacci {
	public static void main(String[] args) {
		int a = 0;
		for (int b = 1; ; b += a) {
			System.out.println(b);
			a  += b;
			if (a >= 100 || b >= 100) {
				break;
			}
			System.out.println(a);
			
			
		}
		






		// int a = 0;
		// int b = 1;
		// int r;
		// System.out.println(1);
		// for (int i = 1; i <= 10; i++) {
			// r = a + b;
			// System.out.println(r);
			// a = r + b;
			// System.out.println(a);
			// b = a + r;
			// System.out.println(b);
		// }
			
	
	}
}