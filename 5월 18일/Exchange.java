//잔돈계산
//받은돈 만원 단가 7500원 부가세 10% 잔돈 = 만원- (단가+부가세)
// 받은돈 = x ->입력값
import java.util.Scanner;

public class Exchange {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		
		System.out.print("받은 돈을 입력하세요 : ");
		int money = scan.nextInt();
		System.out.print("물건의 가격을 입력하세요 : ");
		int cos = scan.nextInt();
		
		double tax = cos*0.1;
		int exchange = money - (cos) ;
		
		System.out.print("상품의 총액: " + cos);
		System.out.print("부가세: "+ tax);
		System.out.print("잔돈: " + exchange);
	}
}