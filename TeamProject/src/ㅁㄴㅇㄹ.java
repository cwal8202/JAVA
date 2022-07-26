

public class ㅁㄴㅇㄹ {

	public static void main(String[] args) {
		String x = "aa1aa";
		String y = "b갂";
		System.out.println(y.matches(".*[가-힣]+.*"));
		System.out.println(x.matches(".*[a-z].*"));
		System.out.println(x.matches(".*[0-9].*"));
		System.out.println (x.matches(".*[a-z].*") && (x.matches(".*[0-9].*")) && (x.length() >= 5) && (x.length() <= 7)); 
	}

}
