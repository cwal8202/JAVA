import java.util.Iterator;
import java.util.LinkedList;

public class Main {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();		// List를 implements한다. 구현한다.
		
		list.add("문자열1");
		list.add("문자열2");
		list.add("문자열3");
		list.add("문자열4");
		
		list.get(0);
		list.get(1);
		list.get(2);
		list.get(3);
		
		for (int i = 0; i < list.size(); i++) {
			list.get(i);
		}
		
		for (String s : list) {
			System.out.println(s);
		}
		
		Iterator<String> iter = list.iterator();
		while (iter.hasNext()) {
			iter.next();
		}
	}
}
