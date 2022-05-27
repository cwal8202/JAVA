import java.util.Scanner;
import java.util.Random;

public class LetterGame {
	public static void main(String[] args) {		
		Random random = new Random();
		int answer = random.nextInt(100); //nextInt는 메소드값을 호출함()는 범위를 설정하는 값
		int guess;
		int tries = 0;
		Scanner scan = new Scanner(System.in);
		// 반복 구조
		do {
			System.out.print("정답을추측하여보시오: ");
			guess = scan.nextInt();
			tries++;
			
			if (guess > answer)
				System.out.println("제시한정수가 높습니다.");
			if (guess < answer)
				System.out.println("제시한정수가 낮습니다.");
		} while (guess != answer);
		
		System.out.printf("축하합니다.시도횟수=%d\n", tries);
	}
}