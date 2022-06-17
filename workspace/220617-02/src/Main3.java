import java.util.StringTokenizer;

public class Main3 {
	public static void main(String[] args) {
		String longLine = "apple banana carrot donut";
		
		// split은 문자 하나하나를 배열에 넣은것이다.
		String[] split = longLine.split(" ");
		System.out.println(split[2]);
		
		
		StringTokenizer st = new StringTokenizer(longLine, " ");	// 왼쪽은 자르는 대상,  오른쪽은 잘라내야 하는 것  오른쪽 문자열에 "asd" 이렇게 넣으면 a s d 하나라도 있으면 나눠진다.
//		st.hasMoreElements();						// boolean값을 반환한다. 나누는 값이 있냐를 확인해서 true와false를 반환해준다. 만약 토큰이 3개뿐인데 4개를 출력하라하면 출력메소드는 작동이 된다. 하지만 토큰은 3개뿐이라 예외상황이 발생한다
		String a = st.nextToken();
		st.nextToken();
		System.out.println(a);										// 차례대로 Token 대상을 출력하는데 출력할 값이 더이상 없으면 예외 상황이 되어서 실행 오류가 난다.
		
//		String result = st.nextToken();					// 토큰값 입력 안하면 처음값이 입력된다.
//		System.out.println(result);
//		result = st.nextToken();
//		System.out.println(result);
//		System.out.println(result);
//		System.out.println(result);
		
//		int i = 1;
//		while(st.hasMoreElements()) {		// hasMoreElements는 그 값을 가지고 있냐를 boolean 값으로 반환한다.
//			i++;
//			String result = st.nextToken();
//			if ( i == 3) {
//			System.out.println(st.nextToken());
//			}
//		}																	// 원하는 토큰의 순서만 입력하면 원하는 토큰만 나오게도 된다.

		
		
		//	내가 생각해보는 것 - carrot만 나오게 할수 잇는 방법	
//		char[] x = new char[longLine.length()];
//		char[] y = new char[longLine.length()];
//		
//		for (int i = 0; i < longLine.length(); i++ ) {
//			x[i] = longLine.charAt(i);
//		}
//		
//		if (x[반복] == ' ') {
//			x[반복] = x[반복 - 1];
//		}
		
	}

}
