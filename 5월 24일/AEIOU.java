// 사용자가 입력한 영단어(latin 문자열)에서 모음(a e i o u)이 몇 개인지 출력하세요

import java.util.Scanner;

public class AEIOU {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String line = scan.nextLine();
		
		int length = line.length(); // 글자수를 알려준다.
		int count = 0;
		for (int i = 0; i < length; i++) { // 0부터 시작이므로 글자수 5개면 i < 5 (0 1 2 3 4)가 된다.
			char c = line.charAt(i); //charAt은 문자의 순서 숫자를 입력하면 그 순서의 문자를 찾아주는
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c== 'u') {
				count++;
			}
		}
		System.out.println("모음 개수 : " + count);
	}
}
// 글자수가 최대값이 되고 글자의 위치를 숫자로 계산한 charAt을 이용해서 
// 글자 위치의 값을 반복하며 일일이 비교한다.