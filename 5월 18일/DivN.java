import java.util.Scanner;

public class DivN {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("****큰수부터 입력하세요****");
		System.out.print("정수를 입력하십시오 : ");
		int large = scan.nextInt();
		System.out.print("정수를 입력하십시오 : ");
		int small = scan.nextInt();
		
		// System.out.print(large + "을" + small + "으로 나눈 몫은 " 
					// + (large/small) + "이고 나머지는 " 
					// + (large%small) + "입니다." );
					
		System.out.printf("%d을 %d으로 나눈 몫은 %d이고 나머지는 %d입니다."
							, large, small, large / small, large % small);
	}
}