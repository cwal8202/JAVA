// 주민번호를 입력하면
// 성별을 출력하는 프로그램
// 예) xxxxxx-1xxxxxx
import java.util.*;

public class IdN {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("주민번호를 13자리를 입력하세요 - 포함");
		String input = scan.nextLine();
		String result;
		
		if ( input.length() == 14) {
			char c = input.charAt(7);
			switch (c) {
				case '1': 	case '3':
					result = "man";
					break;
				case '2':	case '4':
					result = "woman";
					break;
				default:
					result = "잘못된 입력입니다.";
					break;
				}
		} else {
			System.out.print("잘못된 입력입니다.");
		}
			
	}
}