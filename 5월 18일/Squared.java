// 사용자에게 정수 하나를 입력받아서
// 제곱 값을 출력하는 프로그램

// 정수 입력하는것 = Scanner, 객체= nextInt

import java.util.Scanner;

public class Squared {
	public static void main (String[] args){
		
		System.out.println("제곱 값 출력하기");
		
		Scanner root = new Scanner(System.in);
		
		System.out.print("제곱 할 값을 입력하세요 : ");
		int number = root.nextInt();
		System.out.print("몇 제곱 할지 입력하세요 : ");
		int i = root.nextInt();
		
		System.out.println( number + "의"+ i + "제곱은" + Math.pow(number,i));
	}
}

