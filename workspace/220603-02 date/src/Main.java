import java.time.LocalDate;
import java.util.Calendar;

public class Main {
	public static void main(String[] args) {
//		Calendar now = Calendar.getInstance();	//오늘의 날짜를 알기 위핸 
//		
//		System.out.println(now.get(Calendar.YEAR));  // 정수를 넣을려고 한다. 숫자를 단어의 형태로 불러오기 위해서 YEAR이라고 썼다.
//		System.out.println(now.get(Calendar.MONTH) + 1);	// 1월을 0인 값으로 나오기 때문에 +1을 해준다. 
//		System.out.println(now.get(Calendar.DAY_OF_MONTH));
//		System.out.println(now.get(Calendar.DAY_OF_WEEK));
//	
		
		LocalDate now = LocalDate.now();	// .now는 스테틱 변수이다.
		System.out.println(now.getYear());
		
		System.out.println(now.getMonth().getValue());
		System.out.println(now.getMonthValue());
		
		System.out.println(now.getDayOfMonth());
		
		System.out.println(now.getDayOfWeek());
		System.out.println(now.getDayOfWeek().getValue());
	}
}
