import java.util.Set;
import java.util.TreeSet;

public class Main7 {
	public static void main(String[] args) {
		Set<Integer> set = new TreeSet<>();		// 대소 비교를 할 수 있는 원소를 집어넣으면 정렬된 순서처럼 원소를 가질수 있다.
												// 인덱스가 없지만 크기 순으로 보여진다.
		set.add(50);
		set.add(17);
		set.add(2);
		set.add(50);
		set.add(22);
		set.add(17);
		set.add(30);
		set.add(22);
		
		for (int i : set) {
			System.out.println(i);
		}
		
	}
}
