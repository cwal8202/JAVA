
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Main2 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		
		map.put("둘리", 100);
		map.put("홍길동", 90);
		map.put("도우너", 150);
		map.put("도우너", 150);
		
		Map<Integer, String> map2 = new HashMap<>();
		map2.put(1, "둘리");
		map2.put(4, "홍길동");
		map2.put(3, "도우너");

		System.out.println(map.toString());
		System.out.println(map2.toString());
		
		//map.entrySet(); // key가 고유하니깐 짝꿍도 고유할 것이라 해서 짝꿍을 말한다. key와 value를 묶어서 entry라고 말한다.
		// 전체 원소를 순환할려고 entry에 관해서 배웠다. entry는 key와 value를 통틀어서 말하는 것이므로 한번에 entry로 순환할려고 배움. 
		System.out.println("entry");
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		for (Entry<String, Integer> e : entrySet) {
			System.out.println(e.getKey() + "=" + e.getValue());
		}
		
		// key 특징 중복이 안된다. '중복 안된다 = set' key들은 set을 가질수 있다. 고유한 key값들만 묶어서 set으로 묶을수 있따.
		// map은 key만 가져오면 value를 불러 올 수 있다.key값을 iterator한 것이다. 왜냐면 순환 가능하기 때문이다.
		
	
		
		Set<String> keyset = map.keySet();
		System.out.println("for each문");
		for (String key : keyset) {
			System.out.println(key + "=" + map.get(key));
		}
		
		
		Iterator<String> iter = keyset.iterator();
		while (iter.hasNext()) {
			String key = iter.next();
			Integer value = map.get(key);
			
			System.out.println(key + "=" + value);
		}
		
	}
}
