// 사용자에게 5번의 정수를 입력받아
// 최근 입력한 순 (역순)으로 출력하기

// 예) 10 20 30 40 50 -> 50 40 30 20 10

//  사용자가 0 이하의 정수를 입력할 때 까지 반복하여 입력
// 최근 5개를 출력

// 10 20 30 40 50 60 70 80 90 100 -1 -> 100 90 80 70 60
import java.util.Scanner;

public class Main5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
//		int[] iBox = new int[5];
//		for (int i = 0; i < iBox.length; i++) {
//			System.out.println("정수를 입력하세요!");
//			iBox[i] = scan.nextInt();
//		}
//		for (int j = iBox.length - 1; j >= 0; j--) {	// 실행할때 오류났었다. index는 0부터 시작하기 때문이다!
//			System.out.print(iBox[j]);
//		}
		
	///////////////////////// 1번
		System.out.println("값 입력해줘");
		int count = scan.nextInt();
		int number = 0;
			do {
				if (count < 5) {
				System.out.println("값 입력해줘");
				count = scan.nextInt();
				number++;
				}
			} while(count < 5);
			System.out.println("몇번반복했냐 = " + number);	
			
			
			
		
		
		int[] aBox = new int[count];
		
		for (int x = 0; x < aBox.length; x++) {
			System.out.println("값 입력해라");
			aBox[x] = scan.nextInt();
		}
		
		for (int y = aBox.length - 1; y >= aBox.length - 5; y--) {
			System.out.print(aBox[y]);
		}
		
		
		
		
	}

}
