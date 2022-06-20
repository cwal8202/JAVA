import java.util.ArrayList;

public class Main2 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();	//generic 담길 타입을 정한다. 원시형 타입은 안담긴다. Object도 담긴다.
											// 왜냐면 ArrayList는 객체만 담을수 있기 때문이다.	반환 값도 Integer로 반환된다.
											// Double을 넣으면 int값을 만든것은 auto-boxing이 안된다.
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		// 	list.add("addf"); generic으로 Integer타입만 담는다고 했는데 문자열타입을 추가하면 오류가 난다.
		
		int sum = 0;
		for (int i = 0; i < list.size(); i++) {
			sum += list.get(i);
		}
		
		System.out.println(sum);
	}
}
