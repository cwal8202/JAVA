import java.util.HashMap;

public class Main {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("일", 1);		//왼쪽은 key 오른쪽은 value를 넣는다.
		map.put("이", 2);
		map.put("삼", 3);
		map.put("사", 4);
		
		System.out.println(map.size());
		
		System.out.println(map.get("이"));
		System.out.println(map.get("삼"));
		System.out.println(map.get("오"));
		
		// "이" 라는 값이 없을때만 값을 집어 넣어라는 행동이다.
		if (!map.containsKey("이")) {
			map.put("이", 22222);	
		}
		System.out.println(map.get("이"));
	}
}
