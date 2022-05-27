import java.util.Scanner;

public class SumForUser {
	public static void main(String[] args) {
		// 사용자가 정수 범위를 지정(시작 - 끝 입력)
		// 합
		Scanner scan = new Scanner(System.in);
		System.out.println("시작과 끝까지 수의 합");
		int sum = 0;
		System.out.print("시작 값 입력하세요 : ");
		int start = scan.nextInt();
		System.out.print("끝 값 입력하세요 : ");
		int end = scan.nextInt();
		for ( int i = start; i <= end; i++) {
			sum += i;
		}
		System.out.print (sum);
	}
}