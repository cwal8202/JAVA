// 사용자가 입력한 원하는 반복 만큼만 
// 0부터 1씩 증가하는 수를 출력하기.

import java.util.Scanner;
public class Repeat {
	public static void main(String[] agrs) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("값을 입력하세요 : ");
		int a = scan.nextInt();
		
		int b = 0;
		while ( b <= a) {
			System.out.println(b);
			b++;
		}
	}
}
