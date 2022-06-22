import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

// 중국집 주문 가격 계산기

// 짜장면 : 2500
// 짬뽕 : 4000
// 볶음밥 : 4000
								// 음식 개수는 Map으로 하면 될꺼 같다.
// 메뉴를 '추가'!!			// 추가는 List

// 계산 결과 출력 가능

// 중국집은 음식이 있다.

class 중국집 {
	Map<String, Integer> chineseMenu = new HashMap<String, Integer>();

	public 중국집() {
		chineseMenu.put("짜장면", 2500);
		chineseMenu.put("짬뽕", 4000);
		chineseMenu.put("볶음밥", 4500);
	}

	@Override
	public String toString() {	
		return "중국집 [chineseMenu=" + chineseMenu + "]";
	}
	
}

class 사장님 {
	중국집 짬뽕관 = new 중국집();
	void 메뉴추가() {
		Scanner scan = new Scanner(System.in);
		System.out.println("메뉴를 추가 해주세요");
		System.out.println("메뉴 이름 입력");
		String menu = scan.nextLine();
		System.out.println("가격 설정");
		int price = scan.nextInt();
		짬뽕관.chineseMenu.put(menu, price);
		System.out.println(짬뽕관.chineseMenu.toString());	// 추가한 메뉴까지 전체 메뉴 보여주기
	}
	
}

class 종업원 {
	중국집 짬뽕관 = new 중국집();
	사장님 악덕업주 = new 사장님();

	public 종업원(사장님 악덕업주) {
		super();
		this.악덕업주 = 악덕업주;
	}
	
	// 음식 주문 할때 씀
	
//			int quantity = 0;
//			String menuName = "";
//			while(true) {
//				System.out.println("어떤거 주문 하시겠습니까? (메뉴 이름만 입력해주세요. 1개)");
//				scan.nextLine();
//				String input = scan.nextLine();
//				System.out.println("몇개 주문?");
//				int times = scan.nextInt();
//				quantity += chineseMenu.get(input) * times;
//				menuName += input+ " " + times + "개 ";
//				System.out.println("계속 주문 아무거나 종료 버튼 0입력");
//				int choice = scan.nextInt();
//				if(choice == 0) {
//					break;
//				}
//			}
//			System.out.println(menuName + "총 가격은" + quantity);
//	
//	주문받는다
//	계산한다
}
// 중국집은 메뉴가 있다
// 사장님은 메뉴를 추가 할 수 있다.
// 종업원은 주문을 받는다. 음식 종류와 총 수량 - 메소드 (중국집 관련)
// 종업원은 계산을 한다. - 메소드

// 이 시스템을 실행 하나로 만든다.

// 포스기 - 관리 프로그램
// 메뉴 
// 메뉴 추가
// 계산 + 영수증




public class Main3 {
	public static void main(String[] args) {
		Map<String, Integer> chineseMenu = new HashMap<String, Integer>();
		Scanner scan = new Scanner(System.in);
		
		chineseMenu.put("짜장면", 2500);
		chineseMenu.put("짬뽕", 4000);
		chineseMenu.put("볶음밥", 4500);
		
		System.out.println(chineseMenu.toString());
		
		// 음식 추가할때 씀.
		System.out.println("메뉴를 추가 해주세요");
		System.out.println("메뉴 이름 입력");
		String menu = scan.nextLine();
		System.out.println("가격 설정");
		int price = scan.nextInt();
		chineseMenu.put(menu, price);
		System.out.println(chineseMenu.toString());	// 추가한 메뉴까지 전체 메뉴 보여주기
		
		// 음식 주문 할때 씀
		int quantity = 0;
		String menuName = "";
		while(true) {
			System.out.println("어떤거 주문 하시겠습니까? (메뉴 이름만 입력해주세요. 1개)");
			scan.nextLine();
			String input = scan.nextLine();
			System.out.println("몇개 주문?");
			int times = scan.nextInt();
			quantity += chineseMenu.get(input) * times;
			menuName += input+ " " + times + "개 ";
			System.out.println("계속 주문 아무거나 종료 버튼 0입력");
			int choice = scan.nextInt();
			if(choice == 0) {
				break;
			}
		}
		System.out.println(menuName + "총 가격은" + quantity);
		
//		Map<String, Integer> m = new HashMap<String, Integer>();
//		
//		String[] sample = { "to", "be", "or", "not", "to", "be", "is", "a", "problem" };
//		// 문자열에 포함된 단어의 빈도를 계산한다.
//		for (String a : sample) {
//			Integer freq = m.get(a);
//			m.put(a, (freq == null) ? 1: freq + 1);
//		}

		
//		// enter키 한번만 치고 싶어서 이렇게 만들었다.
//		System.out.println("어떤거 주문 하시겠습니까? (메뉴 입력은 띄어쓰기로 구분해주세요)");
//		scan.nextLine();
//		String input = scan.nextLine();
//		
//		String[] split = input.split(" ");
//		System.out.println("음식이 총 몇개?" + (split.length));
//		
//		System.out.println("음식의 종류는 어떻게 있나 ? ");
//		
//		int result = 0;
//		for (int i = 0; i < split.length; i++) {
//			System.out.println(chineseMenu.get(split[i]));
//			result += chineseMenu.get(split[i]);
//		}
//		System.out.println("총 가격은" + result + "원 입니다.");
		

		
		System.out.println("시스템 종료");
	}
}
