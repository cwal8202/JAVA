import java.util.Scanner;

public class CircleArea{
	public static void main(String args[]) {
		double radius; // double은 실수형 타입, 소수점 표현 가능! int는 정수형타입.
		double area;  // 정수형타입일때 실수를 넣으면 오류가 난다.
		Scanner input = new Scanner(System.in);
		System.out.print("반지름을 입력하시오: ");
		radius = input.nextDouble(); // 실수를 받을수 있는 메소드
		area = 3.14 * radius * radius;
		
		System.out.println(area);
	}
}