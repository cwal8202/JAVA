public class TestString2 {
	public static void main(String[] args) {
		String hello = "Hello";
		// 띄어쓰기도 하나의 문자 값으로 친다. 대행문자(\n)또한 하나의 문자로 침.
						//charAt 메소드를 불러왔다. java에 내포되어있는 메소드이다.
		char h = hello.charAt(0); // 컴퓨터는 0부터 시작 즉 1번째는 0이다.
		System.out.println(h);
		//System.out.println(hello.charAt(-2)); // 컴파일은 되지만 실행할때 오류난다. 즉 이 줄부터 오류가 난다.
		System.out.println(hello.charAt(1));
		System.out.println(hello.charAt(2));
		System.out.println(hello.charAt(3));
		System.out.println(hello.charAt(4));
		
		int length = hello.length(); 
		System.out.println(length);
	}
}