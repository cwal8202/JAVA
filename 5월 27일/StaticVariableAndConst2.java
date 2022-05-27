public class StaticVariableAndConst2 {
	public static void printTest(int param) {	//TEST_SCOPE 변수의 정수 값이 int param으로 간것이다 
		param++;
		System.out.println(param);
	}
	
	public static void main(String[] args) {
		int inner = 10;
		// System.out.println(TEST_SCOPE); 변수 선언 전 호출해서 안됨!
		final int TEST_SCOPE = 20;
		printTest(TEST_SCOPE);
		System.out.println("메인에서의 상수값: " + TEST_SCOPE);
		/* {
			System.out.println(inner);
			System.out.println(TEST_SCOPE);
			
			// final int TEST_SCOPE;
			final int BLOCK = 100;
		} 
		System.out.println(BLOCK); */
	}
}