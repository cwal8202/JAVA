import java.lang.reflect.Array;
import java.util.Arrays;

public class Main5 {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30 };
		
		Arrays.fill(arr, 100);		// 모든 값을 같은값으로 넣는것.
		
		System.out.println(Arrays.toString(arr));
		
		
		
		
		
		
		
		
		
//		int[] arr = {10, 20, 30};
//		int[] arr2 = {11, 20, 30};
//		int[] copy = Arrays.copyOf(arr, arr.length);	// 배열 원소를 위치 그대로 복사 하고 길이도 설정할 수 있다.
//		
//		int[] another = Arrays.copyOfRange(arr, 2, arr.length);		// 원하는 배열의 몇번째 부터 볼수 있으며 길이를 어디까지 볼지 정함.
//		System.out.println(Arrays.toString(another));
//		
//		System.out.println(Arrays.toString(copy));
//		System.out.println(Arrays.equals(arr, copy));
//		System.out.println(Arrays.equals(arr, copy));	// 원소 값 같은지 다른지 알 수 있다! 원소의 값을 하나씩 비교해서 boolean 값으로 출력해준다.
	}
}
