import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main3 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("가", "나", "다", "라", "다", "라"));
		
		Set<String> set = new HashSet<>(list);	// set또한 ArryList생성자에 collection을 다 넣을수 있어서 list를 넣은것처럼 
												// HashSet 생성자에 list를 넣을수 있고 넣으면 자동으로 중복된 원소들을 제거하는 역할을 한다. 
		
//		for (int i = 0; i < list.size(); i++) {
//			set.add(list.get(i));
//		}
		
		System.out.println(set);
		
		
	}
}
