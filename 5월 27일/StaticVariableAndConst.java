public class StaticVariableAndConst {
	public static void main(String[] args) {
		int i = 10;
		
		i++;				// i 값이 변하는 것이지 상수 값이 변하는게 아니다
		
		final int ASDF;
		ASDF = 10; // final int(상수) 또한 최초의 초기화는 compile에러가 안난다.
		ASDF = 15; // 하지만 두번째 초기화 부턴 compile에러가 난다.
		
		
		
		final int MY_NUMBER = 22; // final int(상수) 값은 값을 변화 시킬려 하면 컴파일 에러가 난다.
		//	MY_NUMBER++;			// final int(상수) 의 변수는 int와 구별하기 위해 대문자로 이름짓는다.
									// 여러 문자일때 두 문자의 구별을 위해 두번째 단어 첫글자를 소문자로 하는게 아닌 밑줄을 쓴다.
		
		final double PI = 3.14;
		System.out.println(5 * 5 * PI);	// final int(상수)가 변한게 아닌 정수들의 합을 출력한것이다.
	}
}