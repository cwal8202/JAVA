public class MethodsRefParam {
	public static String concat(String left, String right) {
		return left + right;
	}


	public static void main(String[] args) {
		String h = "Hello"; // 참조형은 h가 가지고 있는 값이 복사가 되어 left의 값이 된다.  w또한 right의 값이 된다.
		String w = "World";	
		String result = concat(h, w);

		System.out.println(result);
	}
}