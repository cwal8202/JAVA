// 오늘의 날씨를 물어보고
// "비"를 입력 받으면
// 우산을 챙겨라고 문자열 출력하는 프로그램
import java.util.Scanner;

public class Umbrella {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("오늘의 날씨는 ? : ");
		String weather = scanner.nextLine();
		
		if (weather.equals("비")) {
			System.out.println("우산을 챙겨가세요.");
		}
		
		System.out.println("좋은 하루 보내세요.");
		
		
	}
}