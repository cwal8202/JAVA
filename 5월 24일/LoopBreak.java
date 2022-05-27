public class LoopBreak {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if (i == 5){
				break; //반복이 멈춘다.
			}
			System.out.println(i);
		}
		
		for (int i = 10; i < 20; i++) {
			if (i % 10 == 5) {
				continue; // 현재 단계를 건너뛰게 함. continue가 되면 for의 증감식부터 다시 진행하게 된다.
			}
			System.out.println(i);
		} 
		
		int i = 20;
		while (i < 30) {
			// if (i == 25) {
				// continue;  // while을 만나면 if가 계속 흘러가는게 아닌 while의 조건식으로 다시 가게 된다. 
				// 그래서 멈춘것 처럼 보임
			// }
			if (i != 25) {
			System.out.println(i);
			}
			i++;
		}
		
		System.out.println("프로그램 종료");
	}
}