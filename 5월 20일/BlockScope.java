public class BlockScope {
	public static void main(String[] args) {
		int a = 10; // 지역변수
		{
			int b = 20; // 지역변수
			
			// int a = 99;
			System.out.println("가능한가?");
			System.out.println(a);
			System.out.println(b);
		}							
		// System.out.println(b); 초기화 시킨 범위 바깥에서 출력하면 컴파일 에러가 난다.
	}
}