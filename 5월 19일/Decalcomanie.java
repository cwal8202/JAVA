// 3. 사용자가 입력한 4자리의 정수가 좌우가 같을 때 true를 출력하세요. 나머지 경우는
// false. ex) 1221 -> true, 1557 -> false, 9009 -> true

import java.util.Scanner;
public class Decalcomanie {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("4자리 정수를 입력하세요. : ");
		int x = scan.nextInt();
		
		// a 천의 자리수, b 백의 자리수, c 십의 자리수, d 일의 자리수
		int a = x / 1000;
		int b = x % 1000 / 100;
		int c = x % 100 / 10;
		int d = x % 10;
		
		System.out.print(a == d && b == c);
	}
}