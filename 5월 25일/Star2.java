public class Star2 {
	public static void main(String[] args) {
		int input = 5;
		for (int i = input; i > 0 ; i--) {
			for (int j = 0; j < i ; j++) {
				System.out.print("*");
			} System.out.println();
		}
	}
}