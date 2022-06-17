public class Main3 {
	public static void main(String[] args) {
		try {
			System.out.println("try 불록 안");
			
			System.out.println("문장 1");
			Object o = new Object();
			Object s = (String) o;
			
			System.out.println("문장 2");
			
			System.out.println("문장 3");
		} catch (Exception e) {
			System.out.println("catch 블록 안");
		} finally {
			System.out.println("finally 블록 안");		// 예외가 실행 되던지 안되던지 무조건  실행되는 문장들은 finally 안에 있다.
		}
		
		System.out.println("정상 종료");
	}
}
