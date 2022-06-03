import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;

public class TestDateMethods {
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
//		now.set(2022, Calendar.JUNE, 4);
		now.add(Calendar.DAY_OF_MONTH, 1);	// 
		
		Date date = now.getTime();
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		String result = dateFormat.format(date);
		System.out.println(result);
		
		
		
		
//		LocalDate now = LocalDate.now();
//		LocalDate tomorrow = now.plusDays(1);
//		// 내일의 객체
//		System.out.println(tomorrow);
//		
		
		// 내일 년월일 출력하기
		//1. LocalDate tomorrow = LocalDate.of(2022, 6, 4);
		//2. LocalDate nowPlusOne = now.plusDays(1);
		
		// System.out.println(tomorrow.equals(nowPlusOne);
		
		
		
		// LocalDate.now를 ctrl 눌려서 확인해보니 plusdays가 있었다. ()안에 숫자를 입력하면 그 숫자만큼 날짜가 더해진다. 그래서 LocalDate result라는 변수를 설정 후 
		// 1을 더해줘서 출력했다.
	}

}
