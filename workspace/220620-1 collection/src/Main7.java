import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Main7 {
	public static void main(String[] args) {
		// 2의 배수를 5개 가지는 정수형 리스트 생성 및 초기화 해보기
		List<Integer> list = new ArrayList<>();
		for (int i = 1; i <= 5; i++) {
			list.add(i * 2);
		}
		Collections.shuffle(list);
		System.out.println(list);
		
		// 7의 배수를 5개 가지는 정수형 리스트 생성 및 초기화 해보기
		List<Integer> list2 = new ArrayList<>(Arrays.asList(7, 14, 21, 28, 35));
		Collections.shuffle(list2);
		System.out.println(list2);
		// 3. 위의 리스트의 원소들을 모두 가지는 리스트
		
		// 3번의 리스트를 오름차순으로 정렬된 원소를 가지는 리스트
		
		List<Integer> list3 = new ArrayList<>();
		list3 = list;					// 값을 가져올때 제일 처음에는 이렇게도 할 수 있고
		list3.addAll(list2);			// 나중에는 이렇게도 할수 있다. Collections.copy(list3, list);는 제일 처음 길이가 다르면 복사 불가능하다.  
		Collections.sort(list3);
		System.out.println(list3);
		
		//List<Integer> list = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10));
		
		// (Random 객체를 사용하여) 0 ~ 10 사이의 난수 (정수형)를 6개 가지는 리스트 ( 각 숫자값은 중복되지 않아야 함)
		List<Integer> randomList = new ArrayList<>();	
		Random random = new Random();
		while(randomList.size() < 6) {
			int result = random.nextInt(11);
			if (!randomList.contains(result)) {
			randomList.add(result);
			}
		}
		System.out.println(randomList);

//		random.add(random.nextInt(10) + 1);
//		random.add(random.nextInt(10) + 1);
//		random.add(random.nextInt(10) + 1);
//		random.add(random.nextInt(10) + 1);
//		random.add(random.nextInt(10) + 1);
//		random.add(random.nextInt(10) + 1);
//		
//		Iterator<Integer> iterator = random.iterator();	// 리스트의 원소 하나하나를 볼 수 있게 해주는 '객체'
//		System.out.println(iterator.next());			// StirngTokenizer 처럼 길이보다 더 많이 출력하면 예외가 발생.
//		while(iterator.hasNext()) {
////			System.out.println(iterator.next());
//			int one = iterator.next();				// 순환해서 사용할려면 iterator가 필수!
//			int two = iterator.next();
//				if (b == 5) {
//					iterator.remove();
//				}
//			}
//		
	}
}
