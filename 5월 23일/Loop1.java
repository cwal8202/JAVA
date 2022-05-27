// 1~ 1000까지 출력하세요.
public class Loop1 {
	public static void main(String[] args) {
		boolean con = true;
		
		int i = 0;
		while (i < 5) {
			System.out.println("반복됩니다.");
			i++;
		}
		
		//멈출려면 ctrl + c 눌리면 반복 멈춤.
		
		// Hello World 10번 출력하기
		int j = 0;
		while (j < 10) {
			System.out.println("Hello Wolrd");
			System.out.println("j의 값 : " + j);
			j++;
		} // 0~9 까지는 True 가 되고 10 은 False 가 된다.
		
		
		int k = 1;
		while (k <= 10) {
			System.out.println(k);
			k++;
		}
		
		// while (con) {
		// System.out.println("반복됩니다.");
		// i++;
		// }
		// System.out.println(1);
		// System.out.println(2);
		// System.out.println(3);
		// System.out.println(4);
		// System.out.println(5);
		// System.out.println(6);
		// System.out.println(7);
		// System.out.println(8);
		// System.out.println(9);
		// System.out.println(10);
		
	}
}