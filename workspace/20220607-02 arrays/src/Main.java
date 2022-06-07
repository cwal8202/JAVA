public class Main {
	public static void main(String[] args) {
		int[] aBox;		// 정수형 배열 변수 선언.
		//aBox = 10;		//	 aBox는 정수를 여러개 담을수 있는 타입이다. 정수를 담는 타입이 아니다!!!
		aBox = new int[4];		// 길이가 4인 배열 초기화
		
		System.out.println("배열의 길이값 : " + aBox.length);
		// aBox.length = 10; //배열은 초기화 할때 정해둔 길이 값을 변경할 수 없다. 왜냐?? length는 final 즉 '상수' 이기 때문이다!!
		
		aBox[0]	= 56;	// 0번째 칸에 접근할때 이렇게 쓴다. 0번째 칸은 56이라는 값을 가진다.
		aBox[1] = 57;
		aBox[2] = 58;
		aBox[3] = 59;
		
		System.out.println(aBox[0]);
		System.out.println(aBox[1]);
		System.out.println(aBox[2]);
		System.out.println(aBox[3]);
	}
}
