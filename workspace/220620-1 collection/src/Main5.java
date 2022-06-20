import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main5 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList(Arrays.asList(10, 20, 30, 40, 50));		// 값을 add로 하나씩 추가하지 않고 바로 값 넣을때 사용.
		System.out.println(list);
		
//		List<Integer> test = Arrays.asList(10, 20, 30, 40, 50);
//		test.add(60);
		
		list.addAll(Arrays.asList(60, 70, 80));		//	 값을 추가할수 있다.
		System.out.println(list);
		
		list.removeAll(Arrays.asList(10, 60, 80));		// 원하는 값만 제거 할 수 있다.
		System.out.println(list);
		
		System.out.println(list.containsAll(Arrays.asList(10, 20)));	//	 해당 여러 값'들'이 있는지 확인 할 수 있다. 단 하나라도 없으면 false다.
		
		List<Integer> sub = list.subList(0, 3);
		System.out.println(sub);								// sub 클래스로 따로 뺄 수도 있다.
		System.out.println(list);
	}
}
