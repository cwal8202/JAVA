import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Main4 {
	public static void main(String [] args) {
		List<String> list = new ArrayList<>();			// List의 특징 = iterable(반복 가능한)	ArrayList는 List를 구현하고 있다.
	
		list.add("apple");
		list.add("banana");
		list.add("carrot");
		list.add("donut");
		
		Iterator<String> iterator = list.iterator();	// 리스트의 원소 하나하나를 볼 수 있게 해주는 '객체'
		System.out.println(iterator.next());			// StirngTokenizer 처럼 길이보다 더 많이 출력하면 예외가 발생.
		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
			String str = iterator.next();				// 순환해서 사용할려면 iterator가 필수!
				if (str.length() == 5) {
					iterator.remove();
				}
			}

		
//		System.out.println(list.contains(new String("banana")));		// contain은 원소값을 비교하는 것이다. 분명 참조가 다르지만 true가 나온것은 원소값이 비교되기 때문이다.
//		list.remove("banana");		// 입력값과 원소값이 같은지를 비교 하고 값을 지워준다.
//		
//		System.out.println(list);
		
		// 위의 리스트에서 5글자 문자열만 찾아서 지우기
		
//		for (String s : list) {
//			if (s.length() == 5) {
//				list.remove(s);
//			}
//		}
//		System.out.println(list);
	}
}
