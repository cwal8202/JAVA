// 첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
import java.util.*;
public class Star1 {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt();
      
      String star = "☆";                                                     		    // 1번
      
      //int count = 0; count++ 활용                                             		    // 3번
      
      String count = "";                                                     	  		// 4번    
                     
      for (int line = 1; line <= n; line++) {                                           // 2번        
         count += star;       //line = 1 일때 count = "" + "☆";                        	// 5번
         System.out.println(count);                                                    
      }
   }
}