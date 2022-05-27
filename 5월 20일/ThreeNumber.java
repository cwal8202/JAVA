// 3개의 정수를 입력받아
// 가장 큰 수를 출력하세요.
import java.util.Scanner;
public class ThreeNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("세 정수를 입력하세요. : ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		if (a > b && a > c) {
			max = a;
		} else if ( b > a && b > c) {
			max = b;
		} else if ( c > a && c > b) {
			max = c;
		} else 
		
		
	
	
		// if (a > b) {
			// if (a > c) {
				// max = a;
			// } else {
				// max = c;
			// }
		// } else {
			// if (b > c) {
				// max = b;
			// } else {
				// max = c;
			// }
		// }
	
		System.out.println("가장 큰수는 : " + max);
	}
}
