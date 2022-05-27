public class IncDec {
	public static void main(String[] agrs) {
		int a = 55;
		
		a = 78;
		
		// a = a + 5;
		a += 5;
		
		System.out.println(a);
		
		a -= 3;
		a *= 2;
		a /= 4;
		a %= 2;
		System.out.println(a); // 진행방향 밑으로 계속 값이 계산된다.
	}
}