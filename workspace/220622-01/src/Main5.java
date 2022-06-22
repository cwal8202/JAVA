import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Main5 {
	public static void main(String[] args) {
		// 중복되지 않는 1 ~ 45사이의 정수 6개를 가지는 집합
		// set 객체를 만든다. 그리고 사이즈가 6이 될때까지 중복되지 않는 랜덤 수를 넣는다.
		Set<Integer> lotto = new HashSet<>();
		Random random = new Random();
		while (lotto.size() < 6) {
			lotto.add(random.nextInt(45) + 1);
		}
		System.out.println(lotto);
		
		// set원소들을 list에 담아서 정렬을 한 것이다.
		List<Integer> list = new ArrayList<>(lotto);
		
		Collections.sort(list);
		
		System.out.println(list);
		
	}

}
