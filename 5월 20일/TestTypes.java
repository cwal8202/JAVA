public class TestTypes {
	public static void main(String[] args) {
		// char a = (char) 65;
		// System.out.println(a);
		
		
		// int num = (int) a;     // 자료형의 확장이 일어났다.
		// System.out.println(num);

		
		// double d = 123.456;
		// int i = (int) d; // 형변환, 손실을 감안해서라도 출력하고 싶어서 (int)를 썼다.
						 // // 실수 부분에서 정수만 얻고 싶을때 이런방법을 자주쓴다.
		// System.out.println(i);
		
		byte b = 10;
		
		short s = 100;
		int i = (int) 32323123123L; //값이 이상하게 나온다. int로 못담을 만큼 크지만
									// (int)를  입력해서 값은 출력되지만 이상하게 나옴.
		long l = 10000;
						 // 자료형의 확장은 자동으로 이루어진다. 작은통에 담았던것을
						 // 큰통에 담는것은 아무 문제가 없기 때문이다.
		int sum = b + s; // byte 와 short는 컴파일을 할때 int를 따라갈려한다.
		System.out.println(sum);
	}
}