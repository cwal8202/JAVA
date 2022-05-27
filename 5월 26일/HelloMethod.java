// 2. 전달받은 정수만큼 "안녕" 이라는 문자열을 출력하는 메소드. (반환없음 return type : void)
// 출력을 메인 아닌곳에서 출력

public class HelloMethod {
	public static void hi(int number) {
		for (int i = 1; i <= number; i++) {
			System.out.println("안녕");
		}
	}
	
	public static void main(String[] args) {
		int input = 5;
		hi(input);
	}
}