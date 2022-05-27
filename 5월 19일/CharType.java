public class CharType {
	public static void main(String[] args) {
		char a = 'a'; // char타입에서 ''은 문자 1개만 사용가능하다. 2문자 이상은 컴파일오류가 난다.
		char b = 'b';
		char ga = '가';
		char num1 = '1';
		
		char what = 10; // char 연산은 숫자로 값이 나오는게 아닌 연산 후 숫자의 문자 값으로 나온다.
		
		System.out.println(what); 
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(ga);
		System.out.println(num1);
		System.out.println(a+b);
	}
}