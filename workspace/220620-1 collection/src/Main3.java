import java.util.List;
import java.util.ArrayList;

public class Main3 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();		//generic 적을때 왼쪽<>에 넣었다면 오른쪽은 <>로 가능하다.
													// 부모는 interface형태로 list를 상속한다.
		for (int i = 1; i <= 4; i++) {
			list.add(i*10);	
		}
	
		System.out.println(list.toString());
		list.set(0, 15);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + "번재 인덱스" + list.get(i));
		}
		
		System.out.println(list.contains(20)); 		// 내가 입력한 값이 list안에 있는지 없는지 물어볼때
		System.out.println(list.indexOf(50));	 	// indexOf 는 참이면 index의 값 거짓이면 -1
		
		list.remove(2);								// 해당 index의 배열을 제거한다. 길이도 줄어들고  index도 한칸씩 줄어든다.
		System.out.println(list);
		
		list.add(0, 0);								// (index , 추가할 값) 원하는 칸에 값을 추가한다. 대신 그만큼 길이도 늘어나고 입력값 이후의 index순서도 한칸씩 늘어난다.
		System.out.println(list);
		
		list.clear();								// list의 모든 값을 다없앤다.
		System.out.println(list);
		System.out.println(list.size() == 0);		// 생성된 값이 하나도 없는지 확인하는 중
		System.out.println(list.isEmpty()); 		// 값들이 다 지워졌는지 확인할때 쓰는것.
	}
}
