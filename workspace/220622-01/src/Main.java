import java.util.HashSet;
import java.util.Iterator;

public class Main {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		boolean b1 = set.add("qwer");
		boolean b2 = set.add(Integer.valueOf(10));
		boolean b3 = set.add("qwer");	// boolean으로 비교해보니깐 false가 나왔다.
		// add에 이미 원소를 가지고 있는데 다시 add를 하면 값이 넣어지지 않는다. 그래서 size의 크기도 늘어나지 않는다
	
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(set.size());
		
		System.out.println(set.toString());
		
		// set은 list와 다르게 index를 가지고 있지 않다. 그래서 get이라는 메소드가 아에 없다. get은 index번호로 가지고 오는 메소드이다.
		// set.get(0);
		
//		for (int i = 0; i < set.size(); i++) {
//			set.get(i);  //는 당연히 안된다. get메소드 자체가 없기때문이다.
//		}
		
		// 값 하나하나를 보여주는 것은 foreach로는 가능하다.
		for (Object o : set) {
			System.out.println(o);
		}
		
		Iterator<Object> iter = set.iterator();
		while(iter.hasNext()) {
		System.out.println(iter.next());
		}
	}
}
