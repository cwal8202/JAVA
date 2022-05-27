public class TestMethod {
	public static void printRepeat() { // 메소드 머리(head)
		// 메소드 몸통(body)
		for (int i = 0; i < 3; i++) {
			System.out.println("반복 중");
		}
	}

	public static void printHello() {
		int number = 10;
		System.out.println("Hello");
		System.out.println("초기화한 변수 값 : " + number);

	} // 메소드 몸통(body)은 비워있어도 오류 안남. 대신 몸통부분을 꼭 같이 적어줘야함.

	// 프로그램 시작은 main 메소드로 시작한다. 그래서 printRepeat();을 불러줘야만 출력이 된다!
	public static void main(String[] args) {
		System.out.println("프로그램 시작~");
		
		printHello();
		// System.out.println("헬로 안에서 초기화한 변수 값 : " + number);
		// number가 printHello의 지역변수라서 컴파일 오류남
		// for (int i = 0; i < 2; i++) { // 메소드를 반복문에 넣을 수도 있다.
			// printRepeat();
		// }

		System.out.println("프로그램 끝~");
	}
}