import java.util.*;

public class DaysInMonth {
	public static void main(String[] args) {
		int month;
		int year = 2009;
		int days = 0;
		
		System.out.print("일수를 알고 싶은 달을 입력하시오:");
		Scanner scan = new Scanner(System.in);
		month = scan.nextInt();
		
		switch (month) {
			case 1:		case 3:		case 5:		case 7:
			case 8:		case 10:	case 12:
				days = 31;  // if (case == 1|| case == 3) 이런느낌이랑 비슷한것이다!
				break;
			case 4:		case 6:		case 9:		case 11:
				days = 30;
			case 2:
				if(((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) // 윤년
					days = 29;
				else
					days = 28;
				break;
			default:
				System.out.println("월이 잘못 입력되었습니다.");
				break; // break; 가 없어도 흐름에 문제는 없다!.
			}
			System.out.println("월의 날수는 " + days);
	}
}
	