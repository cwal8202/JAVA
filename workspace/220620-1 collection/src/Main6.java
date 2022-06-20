import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Main6 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(7, 3, 2, 8, 9, 1));
		List<String> list1 = new ArrayList<>(Arrays.asList("c", "d", "e"));
		int index1 = Collections.binarySearch(list1, "d");
		System.out.println("d의 인덱스 : " + index1);
		
		Collections.sort(list);
		System.out.println(list);
		
		int index = Collections.binarySearch(list, 8);		// 리시트의 숫자를 던져주면 해당 인덱스 번호를 알려준다.
		System.out.println("8의 인덱스 : " + index);
		
		Collections.reverse(list);
		System.out.println(list);
		
		Collections.shuffle(list);						// Random으로 섞을수 있다.
		System.out.println(list);
		
		System.out.println(Collections.max(list));
		System.out.println(Collections.min(list));
		
		Collections.fill(list, 33);		// 모든 값을 입력값으로 바꾼다.
		System.out.println(list);
		
		Collections.replaceAll(list, 33, 77);		// 해당값을 입력값으로 바꾼다.
		System.out.println(list);
		
		List<Integer> target = new ArrayList<>(Arrays.asList(90, 80, 70));		// 새로운 list를 만든다.
		Collections.copy(list, target);		// list를 입력하는 값으로 복사가능하다.
		
		System.out.println(list);
	}
}
