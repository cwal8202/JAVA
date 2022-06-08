import java.util.Scanner;

// p237 1번

// p237 2번

// 기존에 작성하였던 학생관리 프로그램을 고정된 3명이 아닌 

public class Main2 {
	final static int CHAIR = 10;
	static int[] copy = new int[CHAIR];

	public static void now(int input) {
			copy[input - 1] = 1;
			for (int i = 0; i < CHAIR; i++) {

				System.out.print(" " + copy[i]);
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] seat = new int[CHAIR];

		System.out.println("좌석을 예약하시겠습니까?(1 또는 0)");
		int reservation = scan.nextInt();

		if (reservation == 1) {
			System.out.println("현재의 예약 상태는 다음과 같습니다.");

			// 1~10까지 나열함.
			System.out.println("-----------------------");
			for (int i = 0; i < CHAIR; i++) {
				System.out.print(" " + (i + 1));
			}
			System.out.println();
			System.out.println("-----------------------");

			// 현황판 처음 출력
			for (int i = 0; i < 10; i++) {
				System.out.print(" " + copy[i]);
			}
			System.out.println();

			// 좌석 번호 입력하는 곳
			int reservationAnswer = 0;
			do {
				System.out.println("몇번째 좌석 예약할래 ? : ");
				int number = scan.nextInt();
				if (copy[number - 1] != 0) {
					System.out.println("이미 예약된 자리입니다.");
				}
				else {
					now(number);
					System.out.println();
				
					System.out.println("예약 하시겠습니까 ? : 1 or 0");
					reservationAnswer = scan.nextInt();
					System.out.println("예약되었습니다.");
				}
			} while (reservationAnswer == 1);
			System.out.println("시스템 종료");
		} else if (reservation == 0)
			System.out.println("시스템종료");
		else {
			System.out.println("1또는 0을 입력하세요");
		}
		;
	}
}
