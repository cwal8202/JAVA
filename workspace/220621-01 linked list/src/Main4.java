import java.util.Deque;
import java.util.LinkedList;

public class Main4 {
	public static void main(String[] args) {
		Deque<String> stack = new LinkedList<>();	// 먼저 넣은걸 맨 마지막에 넣을땐 Deque를 쓴다. 그냥 LinkedList쓰면 안되냐? 그러면 메소드가 너무 많아져서 복잡해진다.
		stack.push("10");		// 값 추가할때 add, offer과 똑같은 동작임.
		stack.push("20");
		stack.push("30");
		
		System.out.println(stack.pop());	// 값에서 가장 최근에 넣은 값을 보여준다.
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
	}
}
