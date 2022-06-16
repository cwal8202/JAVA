interface Days {
	//interface의  public static final int num = 10;
	double x = 10;
	// 인터페이스를 상수를 정의하고 사용하는 용도로 쓸 수도 있다.
	// 인터페이스는 무조건 퍼블릭하고 스태틱한 상수를 가진다. 라고 생각하면 되나.. 클래스 필드같지만 아니다!
	int NUM = 10;
}

interface MyInterface {
	default void printHello() {
		System.out.println("Hello");
		// default는 추상메소드의 기본값 기본형태이다.
		// 인터페이스를 좀더 쉽게 쓸려고 만든것이다. default로 만들면  오버라이드 해야했던 형태를 override하지않고 쓸수 있다. 
	}
	
	// static 메소드도 올 수 있다.
	public static void myStaticMethod() {
		
	}
	// private 한 메소드는 쓸수 없다.
	//private 
	static int sum(int a, int b) {
		return a + b;
	}
}

public class Main {
	public static void main(String[] args) {
		System.out.println(Days.NUM);		// static 이고 상수이다.
	}
}
