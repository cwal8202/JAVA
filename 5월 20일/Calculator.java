// 정수 2개와 연산자(문자열)등 을 입력받아 사칙연산을 수행하는 계산기 프로그램

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수 2개를 입력하세요 : ");
		int x = scan.nextInt();
		int y = scan.nextInt();
		
		System.out.print("연산자를 입력하세요 :  ");
		scan.nextLine();
		String operation = scan.nextLine();
		
		String result;
		if (operation.equals("*")) {
			result = "" + (x * y);
		} else if (operation.equals("/")) {
			result = "" + (x / y);
		} else if (operation.equals("+")) {
			result = "" + (x + y);
		} else if (operation.equals("-")) {
			result = "" + (x - y);
		} else { result = "연산자를 입력하세요";
		}
		System.out.print(result);
	}
}