public class Main3 {
	public static void main(String[] args) {
		// 실수 1.02, 0.03, 4.0
		double d1 = 1.02;
		double d2 = 0.03;
		double d3 = 4.0;
		
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
				
		//
		
		
//		double[] myArr = new double[3];
//		myArr[0] = 1.02;
//		myArr[1] = 0.03;
//		myArr[2] = 4.0;
		// 이걸 좀 더 편하게 할려면 ~
		
		double[] myArr = new double[] { 1.02, 0.03, 4.0 };	// []안에 길이값을 안적고 중괄호 안에 원하는 값들을 넣는다. 길이값을 입력하면 오류가 난다.
		
		// System.out.println(myArr); // double형의 값이 안나온다. 이상한 값이 나온다. 객체의 공통적인 특징이다. 원소값을 확인할려면 순환을 통해서 접근을 해야한다.
		
		for (int i = 0; i < myArr.length; i++) {
			System.out.println(myArr[i]);
		}
		
	}

}
