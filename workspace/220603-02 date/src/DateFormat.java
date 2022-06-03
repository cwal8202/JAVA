import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class DateFormat {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		String result = dateFormat.format(date);
		System.out.println(result);
		
		
		
		
//		Calendar cal = Calendar.getInstance();
//		Date date = cal.getTime();
//		
//		// 날짜를 문자열 형태로 변환하게끔 한게
//		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");	// 월은 'M' 시간에서 '분'은 m
//		String result = dateFormat.format(date);
//		System.out.println(result);
	}
}
