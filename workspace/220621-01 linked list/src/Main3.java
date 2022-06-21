import java.util.LinkedList;
import java.util.Queue;

public class Main3 {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<>();		//linked인스턴스를 추상적인 형태인 Queue로 쓰겠다고 한 것이다.
		
		// new LinkedList<>(). 을 하면 사용할 메소드 즉, 버튼이 너무 많아진다. 그러면 사용자들이 쓰기 어렵다.
		
		queue.add("원소1");
		queue.offer("원소2");		// queue의 추상 메소드이다. linked메소드에 queue가 있는 것이다. 많은 추상적 특징들 중에 Queue만 쓰겠다고 하면 LinkedList를 Queue로 한다.LinkedList는 Queue를 implements하고 있다.
		
		System.out.println(queue);
		
		String elem1 = queue.poll();		// poll은 맨 앞에꺼 가져 온다.	원소가 없으면 null을 반환한다.
		String elem2 = queue.remove();		// remove도 맨 앞에꺼 가져온다. 원소가 없으면 예외를 반환한다.
		
		System.out.println(elem1);
		System.out.println(elem2);
		
		System.out.println(queue.size());
	}
}
