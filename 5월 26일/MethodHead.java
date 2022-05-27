public class MethodHead {   // public 은 접근 대상을 정해주는것. 뜻에 따라 달라진다. 
	// 정수 두 개를 전달받아 왼쪽이 큰지 오른쪽이 큰지 혹은 같은지를 알고 싶음.
	// public static int compare(int left , int right) {
		// return left - right;
	// }
// String.valueof(123); 정적인 메소드 // 우리가 만들어준 compare은 동적인 메소드이다.

	public static char compare(int left, int right) {
		if (left > right) {
			return 'L';
		} else if (left < right) {
			return 'R';
		} else {
			return 'S';
		}
	}
	
	public static void main(String[] args) {
		// int left = 10;
		// int right = 29;
		
		// int result = compare(left , right);
		// if (result > 0){System.out.print ("양수");
		// } else if (result == 0){System.out.print ("같음");}
		// else {System.out.print ("음수");}
	}
}