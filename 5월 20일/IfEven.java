// 사용자가 정수를 입력받아
// 짝수면 "짝수입니다". 출력하기
//
import java.util.Scanner;
public class IfEven {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수 값을 입력하세요. : ");
		int even = scan.nextInt();
		
		if (even % 2 == 0){
		System.out.print("짝수입니다.");
		}
		
		else { //if (!(even % 2 == 0))
		System.out.println("홀수입니다.");
		}
		
		System.out.println("프로그램 종료");
	}
}