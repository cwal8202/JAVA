import java.util.Scanner;

public class Main5 {
	public static int divide(int left, int right) throws MyZeroDivideException {
		if (right == 0) {
			throw new MyZeroDivideException("나눌 수 없음");
		} else {
			return left / right;
		}
	}
	

	public static int myFunction() {
		// 아직 미완성
		throw new UnsupportedOperationException
		("내일 만든다... 아니 진짜 내일은 한다니깐");
	}
	
	
	public static void main(String[] args) {
		myFunction();
//		Scanner scan = new Scanner(System.in);
//		
//		scan.nextInt();
//		
//		try {
//			int result = divide(100, 50);
//		} catch (MyZeroDivideException e) {
//			System.out.println(e.getMessage());
//		}
	}

}
