public class Main3 {
	public static void main(String[] args) {
		int number1 = 10;		//원시형으로 10을 나타냄
		int number2 = 20;
		
			// 행동을 하고 싶은, 다른말로 객체를 만들고 싶을때 boxing을 한다.
		Integer refNumber = Integer.valueOf(10);		// 객체 형태로 10을 나타냄. 많은 동작을 할수 있다.
		//  refNumber.				// 값들을 다른값으로 반환시켜주는 행동들도 할 수 있다.
		refNumber.compareTo(20); 		// 메소드로 바로 값을 비교할 수도 있게 된다.
			// List는 원시형 타입을 못다룬다. 그래서 무조건 boxing을 해줘야 한다.
		refNumber.max(100, 200);
		System.out.println(refNumber.max(100, 200));
		
	}

}
