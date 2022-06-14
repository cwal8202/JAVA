public class Main {
	public static void main(String[] args) {
		String a = new String("a");
		String b = "a";
		
		System.out.println(a == b);	
		System.out.println(a.equals(b));	// String은 참조값이므로 참조 하는게 같은지 확인하는것.
	}

}
