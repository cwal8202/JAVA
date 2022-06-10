import java.math.BigDecimal;
import java.math.BigInteger;


public class Main {
	public static void main(String[] args) {
		System.out.println(Long.MAX_VALUE);
		
		BigInteger value1 = new BigInteger("9223372036854775808");		// 큰 수를 표현하기 위한 하나의 객체이다.
		System.out.println(value1.add(new BigInteger("10")));	// + - 같은 산수연산자는 인식이 안된다. 값이 변한게 아닌 새 BigInteger를  만들어서 반환한 것이다.
		
		System.out.println(value1);		//
		
//		BigInteger value1 = BigInteger.valueOf(Long.MAX_VALUE + Long.MAX_VALUE);
//		System.out.println(value1); 		// Long 최대의 두배를 넣어서 Long의 최대를 넘었기에 오류가 난다.
		
//		BigDecimal dec = new BigDecimal("0.123456789");
//		System.out.println(dec);
		
		BigDecimal d = new BigDecimal(0.1);			// 소수점의 최대 자리까지 표현할때 하는것이다.
		System.out.println(d);
		
	}

}