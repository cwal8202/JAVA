import java.util.Arrays;

public class Main3 {
	// 정수형 배열을 전달받아 같은 길이와 원소값을 가지는 정수 배열을 반환하는 메소드
	public static int[] copyArray(int[] origin) {
		int[] copy = new int[origin.length];
		
		for ( int i = 0; i < origin.length; i++) {
			copy[i] = origin[i];
		}
		
		return copy;
	}
	
	// 정수형 배열 2개가 동일한지(길이와 각 원소값)를 알수 있는 메소드
	
	public static void tOrF(int[]a, int[]b) {
		if (a.length == b.length ) {
			System.out.println("길이값" + true);
			if (Arrays.equals(a, b)) {
				System.out.print("원소값 : true;");
				
			} else {
				System.out.print("원소값 : false;");
				
			}
		}
		else {
			System.out.println(false);
		}
		
	}
	
	
	static int count = 0;
	public static void main(String[] args) {
		int[] test = { 50, 70, 90, 110};
		int[] test1 = { 55, 70, 90, 110};
		int[] c = copyArray(test);
		System.out.println(Arrays.toString(c));		//스테틱값 메소드, 배열에 관련된 스테틱값 메소드. 보고자 하는 배열의 참조를 전달해주면 문자열  형태로 조립을 해서 반환을 해준다.
		
		//////////////////////Array.equlas 안쓰고 한거////
		int a = 0;
		int b = 0;
		for (int i = 0; i < test.length; i++) {
			a = test1[i];
			b = c[i];
			if (a != b) {
				System.out.println("거어어짓!");
				break;
			}
			count++;
		} if (count == test.length) {
			System.out.println("참");
		}
		////////////////////////////////////////
		
//		tOrF(test, c);
	}
}
