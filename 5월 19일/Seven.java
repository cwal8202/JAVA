// 1. 사용자가 입력한 정수가 0 이상이며 7의 배수일 때 true를 출력하세요.
// 입력한 정수 0이상 (관계연산자 + and연산사, 7로 나눌때 나머지 0이면 true 니깐 boolean연산자)

import java.util.Scanner;
public class Seven {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 값을 입력하세요 : ");
		int x = scan.nextInt();
		// int x7 = x%7;
		
		// boolean result = (x7 == 0);
		// System.out.println(0 <= x && result);
		System.out.println(0 <= x && x%7 == 0);
	}
}
	