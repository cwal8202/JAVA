// p 184
class Car {
	// 필드 선언
	private int speed;		//속도
	// 중복 메소드 : 정수 버전
	public void setSpeed(int s) {
		speed = s;
		System.out.println("정수 버전 호출");
	}
	
	// 중복 메소드 : 실수 버전
	public void setSpeed(double s) {
		speed = (int)s;
		System.out.println("실수 버전 호출");
	}
}

public class CarTest {
	public static void main(String[] args) {
		Car myCar = new Car();		// 첫 번째 객체 생성
		myCar.setSpeed(100);		// 정수 버전 메소드 호출
		myCar.setSpeed(79.2);		// 실수 버전 메소드 호출
		
		myCar.setSpeed(1000L); 			// long타입은 int보단 크지만 double안에 있을수 잇기때문에  실수 버전 호출이 된다.
		
		myCar.setSpeed('A');		// 아스키코드로 인식되어 정수 즉 65일 것이다.
	//	myCar.setSpeed("A");		// 
		
	}

}
