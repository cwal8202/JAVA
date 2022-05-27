// 사용자가 몇 개의 정수를 입력할지 먼저 정한 후.
// 정수를 입력하면
// 합과 평균을 구해서 출력하는 프로그램.
import java.util.Scanner;
public class SumNumUser {
	public static void main(String[] args) {
		// Scanner scan = new Scanner(System.in);
		// System.out.print("몇개의 정수를 입력할까요? : ");
		// int a = scan.nextInt();
		// int sum = 0;
		// for (int b = 1; b <= a; b++) {
			// int num = scan.nextInt();
			// sum += num;
		// }
		// System.out.println("합은 : " + sum);
		// System.out.println("평균 : " + sum/a);
		
		Scanner scan = new Scanner(System.in);
		System.out.print("몇개의 정수를 입력할까요? : ");
		int input = scan.nextInt();
		int sumEven = 0;
		int sumOdd = 0;
		int countEven = 0;
		int countOdd = 0;
		for (int i = 1; i <= input; i++) {
			 int num = scan.nextInt();
			 if ( num % 2 == 0) {
				 sumEven += num ;
				 countEven++;
			 } else {
				sumOdd += num;
				countOdd++;
			 }
			}
			System.out.println("짝수의 합 : " + sumEven);
			System.out.println("짝수의 평균 : " + (sumEven / countEven));
			System.out.println("홀수의 합 : " + sumOdd);
			System.out.println("홀수의 평균 : " + (sumOdd / countOdd));
	}
}
//