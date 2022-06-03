import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Calendar;
import java.util.Scanner;

class Week {
	public void print() {
		System.out.println("월   화   수   목   금   토   일");   //25글자

		
	}
}



public class PrintCalendar {

	public static void main(String[] args) {
		LocalDate now = LocalDate.of(2022,8,9);
		//System.out.print(now);
		
		
		DayOfWeek dayOfWeek = now.getDayOfWeek();

		//System.out.println(dayOfWeek);
	    System.out.print("오늘 : " + now + " " + dayOfWeek.getDisplayName(TextStyle.NARROW, Locale.KOREAN));
	    System.out.println();
	    
	
//	    ///////////////////////// 위에껀 오늘날짜 요일 나옴.
//	    
//	    System.out.println(dayOfWeek.getDisplayName(TextStyle.NARROW, Locale.KOREAN));
//	    
//	    int dayOfWeekNumber = dayOfWeek.getValue(); // 오늘날짜의 요일 숫자 나온다.
//	    System.out.println(dayOfWeekNumber);
//	    
	    int year = now.getYear();
	//    System.out.println(year);
	    int month = now.getMonthValue();
	 //   System.out.println(month);
	    
	    
	    
		LocalDate oneday = LocalDate.of(year,month,1);
		DayOfWeek dayOfWeek1 = oneday.getDayOfWeek();
	   
	    int firstday = dayOfWeek1.getValue(); 
		//System.out.println(firstday);
		
//	    
//	    
//	    
//	    Week week = new Week();
//	    week.print();
//	    
//	    int dayOfWeekNumber = dayOfWeek.getValue();  // 요일을 숫자로 나타남 월요일이 1이다.
//	    
//	    System.out.println(dayOfWeekNumber);
//	    
	    Scanner scan = new Scanner(System.in);
	    
	    int days = 0;
//	    int month;
	    
//	    System.out.println("달을 입력하세요. : ");
//	    month = scan.nextInt();
	    
	    switch (month) {
	    	case 1:		case 3:		case 5:		case 7:
	    	case 8:		case 10:	case 12:
	    		days = 31;
	    		break;
	    	case 4:		case 6:		case 9:		case 11:
	    		days = 30;
	    		break;
	    	case 2:
	    		if(((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))		// 윤년
	    			days = 29;
	    		else 
	    			days = 28;
	    		break;
	    	default:
	    		System.out.println("월이 잘못 입력되었습니다.");
	    		break;
	    }
	    
	    
	    
	    
	    /////////////////////////////////
	    int count = 0;
	    
	    // 30개 숫자 나열함
	    for (int j = firstday; 7 > j && j > 0; j--) {
	    	System.out.print("   ");
	    	count++;
	    	
	    }
	    for (int i = 1; i <= days; i++) {
	    	System.out.printf("%02d ", i);
	    	count++;
	    	  if (count > 6 && count % 7 == 0) {
	      		System.out.println();
	      		}
	    }

	}

}
