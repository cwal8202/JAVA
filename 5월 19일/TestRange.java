public class TestRange {
	public static void main(String[] args) {
		// 0 ~ 100 사이 ??
		
		// 숫자가 0 이상 '이고'(and연산자) 100이하인가?? , ~~이거나 (or연산자)
		int number = 33;
		
		// System.out.println(0 <= number );   관계 연산자이며 true, false로 값을 나타낼수 있다. boolean 논리연산자와는 다르다.
		// System.out.println(number <= 100); 자바언어는 하나에 하나씩 밖에 못물어본다.

		System.out.println(0 <= number && number <= 100);
							//true     and     true 라서 true가 나온것
	}
}