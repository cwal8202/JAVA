// 정수 2개를 입력 받아서 큰 수에서~ 작은 수로 나눈 몫과 나머지를 출력
// 
import java.util.Scanner;
public class Revenge {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 두개를 차례대로 입력하세요 : ");
		int x = scan.nextInt();
		int y = scan.nextInt();
		int div; // if문 안에서 선언을 하면 사라진다. 그렇기 때문에 if문 밖에서
		int mod; // 선언을 먼저 하고 if문 안에서 초기화를 시킨다.
		if (x != 0 && y != 0) {
			if(x > y) {
				 div = x/y;
				 mod = x%y;
			} else {
				 div = y/x;
				 mod = y%x;
			}
			System.out.println("몫 : " + div);
			System.out.println("나머지 : " + mod);
		} else {
			System.out.println("0을 입력하면 안됩니다.");
		}
	}
}