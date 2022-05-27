public class TypeConversion {
	public static void main(String[] args) {
		int i;
		double f;
		
		f = 5 / 4; // 숫자는 기본적으로 int값이다. int값으로 계산이 된 후 실수변형이됨.
		System.out.println(f);
		
		f = (double) 5 / 4; // (double) 5 가 먼저 적용되어 실수가 된다.
		System.out.println(f);
		
		f = 5/ (double) 4; // (double) 4 가 먼저 적용되어 실수가 된다.
		System.out.println(f);
		
		f = (double) 5 / (double) 4;
		System.out.println(f);
		
		i = (int) 1.3 + (int) 1.8;
		System.out.println(i);
		
		i = (int) (1.3 + 1.8);
		System.out.println(i);
	}
}