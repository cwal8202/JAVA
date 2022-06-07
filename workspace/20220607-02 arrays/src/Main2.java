public class Main2 {
	public static void main(String[] args) {
		// 길이가 5인 정수(int)형 배열을 선언 초기화 하고
		// 모든 원소(element)의 값을 100으로 설정해보세요.
		int[] myBox = new int[5];		// 왼쪽엔 type만 적는다. 
		
//		myBox[0] = 100;
//		myBox[1] = 100;
//		myBox[2] = 100;
//		myBox[3] = 100;
//		myBox[4] = 100;
		// 0~4까지 반복하는 동작이므로 for문 쓰면 더 편하겠지?!
		
		
		// 반복 하는 값 또한 length 라는 상수값과 똑같기 때문에 상수 값까지의 범위로 설정한다.
		for (int i = 0; i < myBox.length; i++) {
			myBox[i] = 100;
		}

		// myBox[5] = 100;		컴파일 오류는 안나고 실행할때 오류 난다. 왜냐면 5칸짜리는 0부터 시작이라 4까지이다.
		
//		System.out.println(myBox[0]);
//		System.out.println(myBox[1]);
//		System.out.println(myBox[2]);
//		System.out.println(myBox[3]);
//		System.out.println(myBox[4]);
		// 얘도 반복하네 계속??
		
		for (int i = 0; i < myBox.length; i++) {
			System.out.println( i + "번째 index의 원소값 : " + myBox[i]);
		}
	}

}
