import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main8 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(3, 23, 35, 11, 23, 57, 79));
		// 합, 평균
		int result = 0;
		for (int i = 0; i < list.size(); i++) {
			result += list.get(i);
		}
		System.out.println("합 = " + result);
		System.out.println("평균 = " + result / list.size());
		// 정수 57이 리스트에 있는지? 있으면 몇 번째 index에 위치하는지?
		
		if (list.contains(57)) {
			int index = Collections.binarySearch(list, 57);
			System.out.printf("57은 index %d번에 있습니다.", index);
			System.out.println();
		}
		
		if (list.contains(57)) {
			System.out.println("다른방법" + list.indexOf(57));
		}
		
		// 정수 23의 개수
		int count = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) == 23) {
				count++;
			}
		}
		System.out.println("23의 개수는 " + count);
		
		// 중복 되는 23을 '하나' 삭제하기
		int index = list.lastIndexOf(23);		// last 붙이면 역숙!
		list.remove(index);
		System.out.println(list);
		
		// 다른 방법
		list.remove(Integer.valueOf(23)); 		// 왼쪽 기준으로 지워진다.
		System.out.println(list);
		
//		// 바이너리는 조건이 하나 붙는다. 정렬을 해야하는!
//			if (list.contains(23)) {
//				int re = Collections.binarySearch(list, 23);
//				list.remove(re);
//			}
//		System.out.println(list);

//		// 중복 되는 23을 전부 삭제하기
//		while(list.contains(23)) {
//			if (list.contains(23)) {
//				int re = Collections.binarySearch(list, 23);
//				list.remove(re);
////				System.out.println(re);
//			}
//		}
//		System.out.println(list);
		
		
	}
}	
