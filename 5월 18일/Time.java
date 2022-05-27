// 사용자에게 초단위의 시간을 입력받아
// 시간 분 초로 변환을 하는 프로그램

// 입력예) 3666
// 출력예) 1시간 1분 6초
//1시간은 3600초, 1분은  60초이다.
// 3666을 3600으로 나눈다. 값은 1 나머지 66나올것이다. 66을 60으로 나눈다.
// 값은 1 나머지 6이 나올것이다.

import java.util.Scanner;

public class Time {
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("초단위 시간을 입력하시오 : ");
		int time = scan.nextInt();

		int hour = time / 3600;
		int min = (time%3600)/60;
		int sec = (time%3600)%60;
		// 강사님 = int sec = time % 60;
		
		System.out.print(hour+ "시간" + min + "분" + sec + "초");
	}
}