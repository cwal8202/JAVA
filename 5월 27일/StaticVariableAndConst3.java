public class StaticVariableAndConst3 {
	public static int NUMBER = 100; // 전역 변수
   // 많아지면 많아질수록 변할 가능성이 있는 변수들을 넓은 범위에 존재할테니 개발자가 관리 측면에서 힘들어짐
   // 그래서 현대인들은 전역 변수를 만들어서 사용하는 걸 극도로 싫어함
	
	
	public static void test() {
		//NUMBER++;
		System.out.println("테스트메소드에서 : " + NUMBER);
	}
	
	public static void main(String[] args) {
		//NUMBER++;
		System.out.println("메인메소드에서 : " + NUMBER);
		
		test();
		
		// 자바 안에 있는 전역 변수
		System.out.println(Math.PI);
		// Math.PI++'
		 
		// double a = Math.abs(-372);
		// System.out.println(a);
		
		double r = Math.random();
		r = (int) (r * 1000); // 이거 이해해보자
		System.out.println(r);
		
		
	}
}
