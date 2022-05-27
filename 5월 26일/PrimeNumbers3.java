public class PrimeNumbers3 {

	public static boolean isPrime(int i) {
		int count = 0;
		for (int j = 1; j <= i; j++) {
			if (i % j == 0) {
				count++;
			}
		}
		if (count == 2) {
			return true;
		} else {
			return false; // return false로 출력이 된다.
		}
	}
	
	public static void main(String[] args) {
		for (int i = 2; i < 10000; i++) { // 2 ~ 10000
			boolean result = isPrime(10); // 소순지 알아볼거다. 참 or 거짓
			if (result) { // if (true) 가 되면 중괄호의 값이 출력되기 때문에 result가 true면 값이 출력된다.
				System.out.println(i); // 출력
			}
		}
	}
}

// 이 흐름은 소수기계에 i값을 입력받아 소수가 되면 true를 출력해서 if문에 true면 값이 출력된다.