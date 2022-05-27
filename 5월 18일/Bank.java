import java.util.Scanner;

public class Bank {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("금액을 입력하세요");
		
		System.out.print("500원 : ");
		int hak = scan.nextInt();
		System.out.print("100원 : ");
		int lee = scan.nextInt();
		System.out.print("50원 : ");
		int bori = scan.nextInt();
		System.out.print("10원 : ");
		int dabo = scan.nextInt();
		
		int sum = (hak*500)+ (lee*100) + (bori*50) + (dabo*10);
		
		System.out.print("총합 : " + sum +"원");
		
	}

}