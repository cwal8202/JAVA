import java.util.Arrays;

public class Main4 {
	static void printArray(char[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}	
	
	// 배열의 모든 원소를 문자열로 표현해서 반환하는 메소드
	
	static String printAll(char[] HelloString) {
		String str = "";
		for (int i = 0; i < HelloString.length; i++) {
			str += HelloString[i];
		}
		return str;
	}

// 캐릭터 배열에서 하나의 특정 문자의 인덱스를 찾아 변환하는 메소드
	static int whereIs(char[] target, char c) {
		for (int i = 0; i < target.length; i++) {
			if (target[i] == c) {
				return i;
			}
		}
		return -1; // char의 값을 아에 못찾았을때도  return이 되게 하기 위해서 -1을 썻다.
	}		// String 에서 indexOf 에서 값이 아니면 -1 나온것과 똑같은 개념이다.
	
	public static void main(String[] args) {
		char [] hello = { 'H', 'e', 'l', 'l', 'o' };
		String result = Arrays.toString(hello);
		System.out.println(result);
		
		// 한번에 모든 원소를 볼 수 있는 메소드가 만들어져 있다.
		
		
	//	printArray(hello);		//static이므로 객체를 안만들어도 되고 동일한 클래스이므로 클래스 이름도 안적으면 된다. 동일한 char 배열을 넣어주면 된다.
								// 원래는 Main4.printArray(hello);로 적어야 한다.
		
	//	String result = printAll(hello);
	//	System.out.println(result);
		
		
		
		
//		for (int i = 0; i < hello.length; i++) {
//			System.out.print(hello[i]);
//		}
		
		// 위의 문자 배열에 o 문자에 해당하는 인덱스를 찾아보세요~
//		for (int i = 0; i < hello.length; i++) {
//			if (hello[i] == 'o') {
//				System.out.println("찾았다 : " + i);
//			}
//		}
		
	}
}
