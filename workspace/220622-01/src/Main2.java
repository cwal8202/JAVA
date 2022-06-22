import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main2 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("banana");
		set.add("carrot");
		set.add("apple");
		set.add("banana");
		
		System.out.println(set.size());
		
		// set은 입력한 순서를 신경쓰지 않는다. 입력을 먼저해도 출력은 랜덤하게 나온다.
		Iterator<String> iter = set.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		// 원소가 있는지 없는지 확인하는것에 집중되어있다.
		set.contains("banana");
		System.out.println(set.contains("donut"));
		
	}
}