import org.omg.CORBA.ORB;

public class Main2 {
	public static void main(String[] args) {
		int number = 22;
		// Wrapper class
//		Byte
//		Short
//		Integer
//		Long
//		Float
//		Double
//		Character
//		Boolean
		Integer i = new Integer(10);	// java9버전부턴 deprecated, 즉 나중버전으로 가면 없어질 예정이라는것을 알려준다.
		Integer i2 = Integer.valueOf(500);	// 객체를 int(정수)로 바꾼는 과정을 boxing이라고 한다.
		int primitiveInt = i2.intValue();	// intValue() 메소드는 int형으로 바뀌게 된다.자동적으로 포장이 벗겨짐.  unboxing
		
		//System.out.println(primitiveInt);		// primitiveInt는 값이 500이 된다. 참조하는게 아니다.
												// Integer 는 값을 참조한다. 값이 되는게 아니다.
		
		Integer auto = 100;		// auto-boxing
		int un = auto;		// 값이 벗겨진다.
		
		Integer value = Integer.valueOf("5123");		// 문자열에 있는 숫자를 Integer로 변형해준다.
		int result = Integer.valueOf("1234");
		
		Integer.parseInt("123"); // valueOf와 기능은 같지만 반환값이 Integer가 아닌 int(원시형)으로 바로 반환된다. 
	}
}
