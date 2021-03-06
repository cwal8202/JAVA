import java.util.Arrays;

public class Main {
	public static void insertionSort(int[] arr) {
		for (int index = 1; index < arr.length; index++) {
			int temp = arr[index];
			int aux = index - 1;

			while ((aux >= 0) && (arr[aux] > temp)) {

				arr[aux + 1] = arr[aux];
				aux--;
			}
			arr[aux + 1] = temp;
		}
	}
	
	public static void main(String[] args) {
		int[] arr = { 50, 30, 20, 60, 10 };
		
		insertionSort(arr);
		
		Arrays.sort(arr);
		// int 값으로 정렬 해주는 메소드형태이다.
		
		int index = Arrays.binarySearch(arr, 20);		// 오른쪽 값의 인덱스를 알려주는 메소드이다.
		System.out.println("20의 인덱스 : " + index);
		
		System.out.println(Arrays.toString(arr));
	}
}
