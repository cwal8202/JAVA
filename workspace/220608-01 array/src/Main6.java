public class Main6 {
	// 정수 2개를 전달받아 합ㅇ르 구해서 반환하는 메소드
	public static int sum(int... numbers) {	//	int 값을 넣어도 배열로 인식이 된다.
		int sum = 0;						
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		int result = sum(10, 20, 30, 40, 50, 60, 70, 80);
		System.out.println(result);
	}
//  int[] numbers로 했을경우  sum(new int[] a{10, 20, 30, 40, 50, 60, 70, 80};
	// 으로 값을 넣어야 한다.
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	public static void someMethod(int... arr) {		// "..." 배열전달가능함. 파라미터가 여러개 있으면 제일 마지막에 위치해야한다.
//		for (int number : arr) {
//			System.out.println(number);
//		}
//	}
//	
//	public static void main(String[] args) {	
//		int[] arr = { 10, 20, 30, 40, 50 };
//		
//		
//		someMethod(40, 50, 60, 70, 80);		// 파라미터에 바로 입력 가능하게 값을 넣으면 ...이 알아서 배열의 값으로 변형해서 배열 안의 값으로 입력된다.
//		
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		someMethod(arr);
//		someMethod(new int[] { 20, 30, 40, 50, 60 });
//		System.out.println("---");
//		someMethod(new int[] { 4, 5, 6});
//		System.out.println("종료");
//		
//		int[] arr = { 10, 20, 30, 40, 50 };
//		
//			// for each문은 값을 확인할때만 사용한다. 값을 바꿀때는 적용이 안된다.
//		for (int number : arr) {		// 한번 반복할때마다 배열 안에 있는것을 순서대로 값설정 한다.
//										// 무조건 왼쪽에서 오른쪽으로만 가능하다. 값은 연속되게 하나씩 나온다.
//
//			System.out.println(number);
//		}
	//}
}
