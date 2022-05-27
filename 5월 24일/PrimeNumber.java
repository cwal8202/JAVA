// 사용자가 입력한 정수가 소수임을 확인하여 출력하는 프로그램

import java.util.Scanner;
public class PrimeNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int input = scan.nextInt() ;
		int count = 0;
		if ( input > 0) {
			for (int i = input - 1; i > 1 ; i--) {
				int test = input % i;
				if(test == 0){ System.out.print("소수가 아닙니다.");
					count++;
					break;
				} 
			} 
			
			if(count == 0) {System.out.print("소수입니다.");
			}
		} else { System.out.print("소수는 자연수만 성립됩니다.");
			
		}
	}
}