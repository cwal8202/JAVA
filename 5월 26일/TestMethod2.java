public class TestMethod2 {
	// 메소드의 이름. 영소문자. 여러단어가 있으면 다음 단어의 첫번째 글자를 대문자로.
	public static int sum() { // return type : void (없다 는뜻)
							  // void 대신 출력할 값을 적어도 된다.
		int a = 10;
		int b = 20;
		int sum = a + b; // 메소드와 변수의 이름이 같으면 나중에 호출할때 헷갈릴수 있으므로
						 // 두개의 차이를 주는게 좋다!
		return sum; // 값을 뱉어내겠다. 값을 하나 가지고 돌아왔다. 여기서 sum은 변수 이름이다.

	}

	// pi 메소드 {3.14 실수값을 반환하는 메소드}
	public static double pi() { 
		double pie = 3.14;
		
		return pie;
	}



// 메인 위에서 아래로, 내려가다 (sum = 30 만들어내는 기계동작)으로 불러온다. 값이 없어지기 전에
// 돌아오게 하는 return을 썼다.

	// void = 메소드의 return type이 비어있다는 뜻.
	public static void main(String[] args) {
		System.out.println("시작");

		int result = sum(); // 30을 만들어내는 기계동작.
		
		System.out.println(result);
		

		double p = pi();
		System.out.println(p);
		
		System.out.println("끝");
	}
}