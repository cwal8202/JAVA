// 구구단
// 4단
// 4 1 4
public class Gugudan2 {
	public static void main(String[] args) {
		
		for (int j = 2; j <= 9; j++) {
			for (int i = 1; i <= 9; i++) {
				System.out.printf("%d * %d = %d\n", j, i, j * i);
			}
		}
		
		// int a = 2;
		// int b = a;
		// for (int i = 1; i < 10 ;i++) {
			// a = b * i;
			// System.out.printf("%d * %d = %d", b, i, a);
			// System.out.println();
		}
	}
}
