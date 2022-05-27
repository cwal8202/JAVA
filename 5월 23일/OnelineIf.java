public class OnelineIf {
	public static void main(String[] args) {
		boolean con = true;
		
		String result = (con) ? "참" : "거짓";
	// ? = 삼항연산자 , boolean 값이 오면 :(콜론)을 기준으로 둘 중 하나를 선택한다.
	// true면 왼쪽, false는 오른쪽의 값을 나타낸다. if, else와 비슷하다.
		
		/* int r;
		if (con) {
			r = 100;
		} else {
			r = -100;
		}
		두개가 같은말이다.
		int result = (con) ? 100 : -100; */
		
		System.out.println(result);
		
		System.out.println("프로그램 종료");
	
		// //if문에서 수행하는게 한 문장일 경우 중괄호 생략가능하다.
		// // 또한 한줄에 if 와 else 를 입력해도 된다.
		// if (con) 
			// System.out.println("참일 경우 실행할 문장");
		 // else {
			// System.out.println("거짓일 경우 실행할 문장1");
			// System.out.println("거짓일 경우 실행할 문장2");
		 // }
		
		System.out.println("프로그램 종료");
	}
}