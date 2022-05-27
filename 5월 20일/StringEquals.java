public class StringEquals {
	public static void main(String[] args) {
		String a = "Hello";
		String b = "Hello";
		String llo = "llo";
		
		
		System.out.println(a == b); // 값을 확인하는게 아닌 참조하는 대상이 같은지 확인하게 됨
		
		System.out.println(a == ("He" + llo)); // 분명 값은 같지만 참조하는 대상이 같지 않다. a는 Hello (예를 들어 1번박스)라는 대상을 가지고
												//"He" + llo 는 Hello(예를들어 2번박스)라는 대상을 가지기 때문에
												// 참조 대상은 다르기 때문에 false가 된다.
		
		System.out.println("---------문자열 값 동등 확인 ----------");
		System.out.println(a.equals("He" + llo)); //문자열 비교할땐 .equals를 쓴다. 참조형을 무시하고 값 하나하나를 비교하기 때문이다.
		
	}
}