import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

public class practice {
	public static void main(String[] args) {
		List<String> a = new ArrayList<>(Arrays.asList("사과", "배", "포도", "자몽", "파인애플"));
		StringJoiner sjj = new StringJoiner("l");
		for (int i = 0; i < 5; i++) {
			sjj.add(a.get(i));
		}
		System.out.println(a);
	}
}
