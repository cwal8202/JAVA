import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		// 배열은 고정적인 길이 값을 가지고 있고 그때그때 배열길이값을 조정하기 힘들다. 비슷한 구조를 가지지만 사용하기 편한 흐ㅕㅇ태로 클래스 제공하는게 ArrayList다.
		ArrayList list = new ArrayList();	//	 길이 정하지 않아도 되고 추가만 해주면 늘어난다.
		list.add("문자열 객체");
		list.add(new Object());
		list.add(Integer.valueOf(100));				// 기본형 타입의 value를 집어 넣을수 없다. 오로지 객체만 가능하다.
		list.add(Double.valueOf(55.55));			//	 객체를 추가시킬수 있는 것이다. 
		
		list.add(500);	// auto-boxing				// int는 객체로 사용할려면 Integer.valueOf로 boxing이 되어야 하는데 여기선 autoboxing이 일어나게 된다.
		list.add(123.123);	// auto-boxing이 일어남.
		
		int size = list.size();			// 몇개의 객체가 담겼는지 확인할때 쓴다. 		
//		System.out.println(list.size());
//		System.out.println(size);				// 차례대로 객체가 생성된다. index번호로 차례대로 생성된다.
//		
//		System.out.println(list.get(0));
//		System.out.println(list.get(2));
//		System.out.println(list.get(4));
//		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		for (int i = list.size() - 1; i >= 0; i--) {
			System.out.println(list.get(i));
		}
		
//		for (Objcet o : list) {	// for each 문도 쓸수 있다.
//			System.out.println(o);
//		}
	}
}
