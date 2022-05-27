public class StringMethods {
	public static void main(String[] args) {
		String hello = "hello";
		
		int index = hello.indexOf("o");
		System.out.println(index);
		
		int notFound = hello.indexOf("a");
		System.out.println(notFound); // 값을 못찾으면 무조건 -1이 뜬다.
		
		int index2 = hello.indexOf("l");
		System.out.println(index2);
		
		//lastIndexOf 는 마지막부터 즉  오른쪽부터 진행됨
		int index3 = hello.lastIndexOf("l"); //방향이 왼쪽에서 진행되어서 
		System.out.println(index3);			 // 첫번째 찾을땐 2, 두번째 l 찾을땐 3이 떴다.
	}
}