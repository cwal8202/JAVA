public class IntegerToString {
	public static void main(String[] args) {
		String strNum = String.valueOf(12345); //숫자등을 문자로 바꿀때 쓴다.
								// 특징으론 선언한게 아닌 클래스인 String 그대로 쓰는 특징.
		System.out.println(strNum);
		
		int i = 5055;
		String strNum2 = "" + i;
		
		System.out.println(i + 100);
		System.out.println(strNum2 + 100);
		
		
		
		
		
		// System.out.println(strNum2.charAt(0));
	}
}