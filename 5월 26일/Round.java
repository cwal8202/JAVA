// 1.원의 반지름을 실수형으로 전달받아 원넓이(실수형)를 반환하는 메소드 작성 후 
// 메인메소드에서 호출하여 출력을 통해 값을 확인해보세요.
import java.util.*;

public class Round {
	public static double circle(double r) {
		return r * r * 3.14;
	}
	


	public static void main(String[] args) {
		double input = 2;
		input = circle(input);
		System.out.print(input);
	}
}