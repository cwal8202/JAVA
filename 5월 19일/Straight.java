// 2. 사용자에게 3개의 정수를 입력받아 순서대로 입력된 수일 경우 true을 출력하세요.
// 나머지 경우는 false. ex) 1 2 3 -> true, 4 5 6 -> true, 7 9 10 -> false
// 세수의 합을 3으로 나누면 
import java.util.Scanner;
public class Straight {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자 3개를 연속해서 입력하시오 : ");
		int x = scan.nextInt();
		int y = scan.nextInt();
		int z = scan.nextInt();
			
		System.out.print(z-y == 1 && y-x == 1);
	}
}