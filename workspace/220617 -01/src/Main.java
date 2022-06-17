import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[] agrs) {
		System.out.println("프로그램 시작");
		Scanner scan = new Scanner(System.in);
		
//		try {
//			// 프로그램 흐름 문장
//		} catch (예외타입) {
//			// 예외를 처리하는 문장
//		}

		try {
			System.out.println("왼쪽 수 입력?");
			int left = scan.nextInt();
			System.out.println("오른쪽 수 입력?");
			int right = scan.nextInt();
			
			if (right != 0) {
				System.out.println("나눈 몫: " + (left / right));
			} else {
				System.out.println("분모에 0을 입력할 수 없습니다");
			}
		} catch (InputMismatchException e) {
			System.out.println("숫자를 입력해야합니다.");
			System.out.println(e.getMessage());
			e.printStackTrace();		// 어디서 오류를 낸지 알 수 있다.
		}
	
		System.out.println("프로그램 정상 종료");
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
