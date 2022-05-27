// 사용자에게 비밀번호를 물어보고 동일할 경우 통과
// 최대 3번의 기회를 줌 

import java.util.Scanner;

public class PassWord {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input;
		String answer = "a1b2c3";
		
		int count = 0;
		
		do { System.out.println("비밀번호를 입력하세요");
			input = scan.nextLine();
			count++;
			if ( count > 2) {
				System.out.print("3회 오류 입니다\n");
				break;
			} else if(!(input.equals(answer))) {
				System.out.printf("오류 %d회\n" , count);
			} else{
				System.out.print("통과");
			} 
		}
		while (!(input.equals(answer)));
		
		if (!(input.equals(answer))) {System.out.println("종료");}
	} 
}
