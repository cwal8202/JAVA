import java.lang.reflect.Array;

public class Main {
	public static void main(String[] args) {
		int[] arr1 = { 2, 4, 6, 8, 10 };
		int[] arr2 = { 3, 6, 9, 12, 15 };
		int[] arr3 = { 4, 8, 12, 16, 20 };
									// 오른쪽 값은 안넣어도 된다. 그렇게 되면 3칸의 배열이 만들어 지고 1칸마다 null을 참조한다. 오른쪽에 5를 넣으면 5칸의 int[]을 참조하는것이다.
		int[][] arr2d = new int[3][5];		// int 원소를 가진 배열의 배열 앞에 있는 [3]이 길이값이다. 1번째는 몇줄 2번째는 몇칸 을 나타낸다.
		arr2d[0] = arr1;
		arr2d[1] = arr2;
		arr2d[2] = arr3;
		
		for (int j = 0; j < arr2d.length; j++) {	// arr2d.length = 줄(세로방향) 수를 알고싶을때
			for (int i = 0; i < arr2d[j].length; i++) {		
				System.out.println(arr2d[j][i]);			
			}
		}
		
//		int[][] arrAnother = { { 2 , 4, 6 }, { 3, 6, 9 }, { 4, 8, 12 } };
//		for (int i = 0; i < arrAnother[0].length; i++) {
//			System.out.println(arrAnother[0][i]);
//		}
		
		//arr2d.toString(); 이거 뭐지...?
	}
}