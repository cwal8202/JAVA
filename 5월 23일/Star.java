// 첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
public class Star {
	public static void main(String[] args) {
		String s = "☆";
		String sum = "";
		for (int b = 0; b < 5; b++) {
			sum += s;
			System.out.println(sum);
		}
	}
}
				