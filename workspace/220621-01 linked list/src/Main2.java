import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main2 {
	public static void main(String[] args) {
		List<String> list = new LinkedList<>(Arrays.asList("A", "B", "C", "D"));	// 추가 삭제시 칸이 옮겨지는게 아닌 줄을 끊는것이다. 모든 원소에 빨리 접근할때는 Arrays.list가 훨씬 좋다
		
		list.remove(0);
		
		list.remove("C");
		
		System.out.println(list);
		
	}
}
