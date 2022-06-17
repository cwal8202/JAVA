import java.util.StringJoiner;

public class Main2 {
	public static void main(String[] args) {
		//"[1, 2, 3]";
		StringJoiner sj = new StringJoiner(",", "[", "]");		// 문자들 사이에만 쉼표가 온다. (사이사이값 , 맨 처음, 마지막)
		sj.add("1");
		sj.add("2");
		sj.add("3");
		
		String result = sj.toString();
		
		System.out.println(result);
		
	}

}
