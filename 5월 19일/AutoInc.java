public class AutoInc {
	public static void main(String[] args) {
		int a = 10; 
		
		System.out.println(a);;
		a++; // 보통 a++으로쓴다
		System.out.println(a);; // 전후 흐름을 신경써서 위아래 문장 표현하는게 더 좋다.
		
		
		// System.out.println(a++); // 증감 연산자는 순서에 따라 값이 달라진다. ++a는 ++이 먼저 적용된 값이 나오며
		// System.out.println(a); // a++은 적용은 되지만 뒤에 오는 다음값에서 적용되게 나온다.
		
		
		// 복합 대입 연산자 += -= ...
		// a += 1; // 11
		// a -= 1; // 10
		
		// 증감 연산자
		// a++;
		// a++;
		// a++;
		
		// a--;
		// System.out.println(a);
	}
}