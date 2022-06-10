public class Main {
	public static void someMethod(int param) {
		
	}
	
	public static void sum(int a, int b) {
		System.out.println(a + b);
	}
	
//	public static int sum(int asdf, intasd) { 파라미터에 똑같은 타입이면서 메소드 이름도 같으면 똑같은 메소드이다. 파라미터는 타입만 중요하지 변수 지정은 아무거나 해도 된다.
//											 	
//	}
	
	public static void sum(double a, double b) {		// 메소드 이름도 비교하지만 파라미터도 비교를 한다. 생성자와 똑같은 개념. 생성자도 오버로딩이 된것이다.
		System.out.println(a + b);
	}
	
	public static void main(String[] args) {
//		someMethod(3893);
//		someMethod("asdf");
		
		
		// Method Overloading
//		System.out.println(12312);
//		System.out.println(123.123);
//		System.out.println("123.123");
		sum(10.0, 40.0);
	}

}
