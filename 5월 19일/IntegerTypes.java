public class IntegerTypes {
	public static void main(String[] args) {
		byte b = 100;
		short s = 30000;
		int i = 10_000_000; // 쉼표로 자릿수 표현하면 
							//자바에서 컴파일에러 나서 _(밑줄)로 표기
		long l = 123456789L; // 롱타입의 숫자라는걸 나타내는 L을 썼다.

		//int sum = i + l; long이 int보다 큰 범위기때문에 작은범위인int에서 적용이 안된다.
		
		//System.out.println(i + l);
		
		// int bs = b+s;  // 정수형은 큰 범위로 따라간다. short라고선언했지만 int로 따라갈수 있다.
		//System.out.println(bs);
		
		// byte b2 = 100;
		
		// byte sum = b + b2; 
		// System.out.println(sum); byte의 용량이 작아서 계산이 안됨.
	}
}