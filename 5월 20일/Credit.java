// 사용자의 학점
// 점수를 입력받아
// 90점 이상 ~ A
// 80점 이상 90점 미만 B
// 70점 이상 80점 미만 C
// 60점 이상 70점 미만 D
// 60점 미만 F
import java.util.Scanner;

public class Credit {
	public static void main(String[] args) {
		System.out.print("점수를 입력하세요 : ");
		Scanner scan = new Scanner(System.in);
		
		int score = scan.nextInt();
		
		char grade;
		if (score >= 90) {
			grade = 'A';
		} else if (score >= 80) {
			grade = 'B';
		} else if (score >= 70) {
			grade = 'C';
		} else if (score >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}

		System.out.print("학점은 " + grade);
	}
}