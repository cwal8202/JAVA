import java.util.*;

public class star00 {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      
      System.out.print("최대 별 개수를 입력하세요: ");
      int input = scan.nextInt();
      
      for (int i = 1; i <= input; i++) {
         
         for (int l = input; l > i; l--) {
            System.out.print(" ");
         }
         
         for (int j = 0; j < i; j++) {
            System.out.print("★");
         }
         
      
         System.out.println();
      } 
   }
}