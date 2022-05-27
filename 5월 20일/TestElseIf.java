//컵 사이즈 알려주기
// 사용자의 정수를 입력받아서
// 200이상이면 large
// 100이상 ~ 200미만 medium
// 100미만 small
import java.util.Scanner;

public class TestElseIf {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int cup = 90;
		
		String size;
		if (cup > 200) {
			size = "large"; 
		} else if (cup >= 100 ) {
			size = "medium";
		} else {
			size = "small";
		}
		//if 3개로 하면 먼저 if한것이 '참'이든 '거짓'이든 무조건 검사한다.
		// if else는 if가 아니면 검사한다. 두개의 흐름은 다른것이다.
		
		System.out.println(size);
		
	}
}