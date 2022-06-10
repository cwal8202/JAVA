import java.util.Arrays;
import java.util.Random;

public class Main3 {
	public static int[][] randomArray() {
		Random random = new Random();
		int[][] array = new int[5][5];
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = random.nextInt(10);
			}
		}
		
		return array;
	}
	
	// 합 구하는 메소드
	public static int sum(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return sum;
	}
	// 열의 합 구하는 
	public static int[] col(int[][] array, int col) {
		int[] columnArray = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			columnArray[i] = array[i][col];
		}
		return columnArray;
	}
	
	public static int count(int[][] array, int target) {
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] == target) {
					count++;
				}
			}
		}
		return count;
	}
	
	

	
		
		public static void main(String[] args) {
			int[][] randomArray = randomArray();
//			System.out.println(Arrays.deepToString(randomArray));
			print2D(randomArray);
//			System.out.println(sum(randomArray[0]));
			System.out.println(sum(col(randomArray, 0)));
		}
		
		
		
		
		
		
		
		
		
	
		
		
		//////////// 내가 한거
	/*	
	 * 	public static void main(String[] args) {
			int[][] randomArray = randomArray();
			System.out.println(Arrays.deepToString(randomArray));
			// 각 행의 합
			// 각 열의 합
			// 숫자 7의 개수
		
		int sum = 0;
		int sum0 = 0;
		for (int i = 0; i < randomArray.length; i++) {
			for (int x = 0; x < randomArray[i].length; x++) {
				sum += randomArray[x][i];
			}
			System.out.println((i+1) + "번째 행의 합" +  sum);
			sum = 0;
		}
		//길이는 index와 같다.
		for (int x = 0; x < randomArray[0].length; x++) {
			for (int i = 0; i < randomArray.length; i++) {
				sum0 += randomArray[i][x];
			}	
			System.out.println((x + 1) + "번째 열의 합" +  sum0);
			sum0 = 0;
		}
		int count = 0;
		for (int x = 0; x < randomArray[0].length; x++) {
			for (int i = 0; i < randomArray.length; i++) {
				if(randomArray[i][x] == 7) {
					count++;
				}
			}	
		}
		System.out.println(count + "개");*/
		
	}
}
