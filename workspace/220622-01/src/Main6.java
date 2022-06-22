import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main6 {
	public static void main(String[] args) {
		// set을 출력할때 입력된 순서대로 알고 싶어서 LinkedHashSet을 했다 . 하지만 index를 포함하는것은 아니다.
		LinkedHashSet<String> set = new LinkedHashSet<>();	// LinkedHashSet도 index를 포함하지 않는다.
		set.add("banana");
		set.add("carrot");
		set.add("apple");
		set.add("apple");

		for (String s : set) {
			System.out.println(s);
		}
		
		Set<String> set2 = new HashSet<>(Arrays.asList("apple", "donut", "egg", "fanta"));

		// Set 타입을 LinkedHashSet에 넣으면 입력된 순서대로 출력을 할 수 있다. 
		set.addAll(set2);
		System.out.println(set);
//		
		// LinkedHashSet타입을 Set에 넣으면 순서가 다시 사라진다.
//		set2.addAll(set);
//		System.out.println(set2);
	}
}
