// 사용자가 3대 측정 
// 벤치, 스쿼트, 데드
// 합이 500이상이면 true
// false
import java.util.Scanner;
public class Sbd {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("언더아머 단속반입니다. S,B,D, 무게 입력하세요. : ");
		int squat = scan.nextInt();
		int bench = scan.nextInt();
		int dead = scan.nextInt();
		
		int sum = squat+bench+dead;
		
		System.out.println(sum >= 500);
		// boolean result = (sum >= 500);
		// System.out.println("3대 500? : " + result);
	}
}
		
		