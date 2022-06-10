import java.util.Arrays;

public class Main2 {
	public static void main(String[] args) {
		// 2 ~ 5의 제곱수들을 각 원소로 가지는 2차원 배열 선언 초기화 후에 모든 원소 출력해보기
		// 2 4 8 16 32.......
		// 3 9 27....
		
//		int[][] arr2 = new int[5][5];
//		for (int x = 0; x < arr2.length; x++) {
//			int result = x + 2;
//			for (int i = 0; i < arr2[x].length; i++) {
//				arr2[x][i] = result;
//				System.out.println(arr2[x][i]);
//				result* x+2
//			}
//			System.out.println();
//		}
		
		int[][] arr = { {2,4,8,16,32}
		, {3, 9,  27,  81,  243}
		, {4, 16, 64,  256, 1024}
		, {5, 25, 125, 625, 3125} };
		
		int[][] arr2 = new int[4][5];
		for (int i = 0; i < arr2.length; i++) {
			int n = 1;
			for (int j = 0; j < arr2[i].length; j++) {
				n *= 2 + i;
				arr2[i][j] = n;
			}
		}
		
		System.out.println(Arrays.deepToString(arr));
		System.out.println(Arrays.deepToString(arr2));
		
		System.out.println(arr == arr2);
		System.out.println(Arrays.equals(arr, arr2));			// equals 는 왼쪽과 오른쪽의 배열의 값이 같은지 확인한다.
		System.out.println(Arrays.deepEquals(arr, arr2));		// deepEquals 는 왼쪽과 오른쪽의 참조 값이 같은지 확인한다.

	}
}
