import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main4 {

	public static void main(String[] args) {
		Set<Integer> setA = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
		Set<Integer> setB = new HashSet<>(Arrays.asList(3, 4, 5, 6, 7));
		
		Set<Integer> setUnion = new HashSet<>();	
		setUnion.addAll(setA);
		setUnion.addAll(setB);			// set에 원소들을 한번에 넣을 수 있게 한다. 이렇게 중복된원소는 한번만 나오게 하는 합집합 형태로 나온다.
	
		System.out.println(setUnion);
		
		Set<Integer> setDuplicate = new HashSet<>();
		setDuplicate.addAll(setA);
		setDuplicate.retainAll(setB);		//retainAll 중복된 원소들만 남기고 지워준다. 즉 교집합 형태로 나온다.
		System.out.println(setDuplicate);
		
		Set<Integer> setLeftOuter = new HashSet<>();
		setLeftOuter.addAll(setA);
		setLeftOuter.removeAll(setB);		//	중복이 된 원소들을 지우는 차집합 형태, setA의 차집합 이다.
		System.out.println(setLeftOuter);
		
		Set<Integer> setSame = new HashSet<>(Arrays.asList(7, 6, 5, 4, 3, 2, 1));
		System.out.println(setSame.equals(setUnion));			// 원소가 같은 집합인지 확인하는것. 왜냐면 순서가 없기때문이다.
		
	}
}
