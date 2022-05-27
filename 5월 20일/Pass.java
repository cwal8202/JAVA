//사용자의 점수(정수형)를 입력받아
//60점 이상 이면 "합격" 출력
// 60점 미만이면 "불합격" 문자열과 부족한 점수도 같이 출력
import java.util.Scanner;
public class Pass {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("점수를 입력하세요 : ");
		int score = scan.nextInt();
		
		if (60 <= score && score <= 100){
		System.out.println("합격");
		}
		
		else {
		System.out.println ("불합격");//System.out.println("불합격, 필요한 점수는" + (60 - score));
		System.out.printf("%s %d", "부족한 점수 : ", 60 - score);
		}
		
		System.out.println("프로그램 종료");
	}
}