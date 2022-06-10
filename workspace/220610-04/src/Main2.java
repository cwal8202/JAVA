import java.util.Scanner;

class Can {
	private String name;

	
	
	public Can(String name) {
		this.name = name;
	}
	
	public String toString() {
		return name;
	}
	
}

public class Main2 {
	public final int COLA = 1;
	public final int SPRITE = 2;
	public final int FANTA = 3;
	Scanner scan = new Scanner(System.in);
	
	Can coke;
	Can sprit;
	
	public Main2(Can c, Can s) {
		coke = c;
		sprit = s;
	}
	
	public Can input(Scanner input) {
		return coke;
		
	}
	
	
	
	public Can result(int input) {
		if (input == COLA) {
			System.out.println(coke.toString());
			return coke;
		}	else if (input == SPRITE) {
			System.out.println(sprit.toString());
			return sprit;
		}	else {
			System.out.println("1 또는 2 입력하세요.");
			return null;
		}
	}
	
	public Can result(String input) {
		if (input.equals("Cola")) {
			System.out.println(coke.toString());
			return coke;
		}	else if (input.equals("Sprite")) {
			System.out.println(sprit.toString());
			return sprit;
		}	else {
			System.out.println("1 또는 2 입력하세요.");
			return null;
		}
	}
	
	
	// 자판기 메소드
	// 정수형 -> 반환 Type : Can
	// 1 -> field "콜라"
	// 2 -> field "사이다"
	
	// 문자열 -> 반환 Type : Can
	// "Cola" -> field "콜라"

	public static void main(String[] args) {
		Can cola = new Can("콜라");
		Can sprite = new Can("사이다");
		
		Main2 machine = new Main2(cola, sprite);
		
		machine.result("Sprite");
		
		
	}
}
