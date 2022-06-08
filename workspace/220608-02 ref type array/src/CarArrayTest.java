class Car {
	public int speed;
	public int gear;
	public String color;
	
	public Car() {
		speed = 0;		// 속도
		gear = 1;		// 기어
		color = "red";	// 색상
	}
	
	public void speedup() {		// 속도 증가 메소드
		speed += 10;
	}
	
	public String toString() {		// 객체의 상태를 문자열로 반환하는 메소드  toString() 으로 해야지만 값이 String으로 반환된다.
		return "속도 : " + speed + " 기어 : " + gear + "색상 : " + color;
	}
}


public class CarArrayTest {
	public static void main(String[] args) {
		final int NUM_CARS = 5;
		Car[] cars  = new Car[NUM_CARS];		
		// 배열 객체 생성
		for (int i = 0; i < cars.length; i++)		// 배열의 각원소에 Car 객체를 생성하여 대입한다.
		cars[i] = new Car();
	
		for (Car c : cars) {
			c.speedup();
		}
		//for (int i = 0; i < cars.length; i++)
		//cars[i].speedup();
	
		
		for (Car c : cars) {
			System.out.println(c);
		}
		

//		for (int i = 0; i < cars.length; i++)
//			System.out.println(cars[i]);		// 객체를 문자열처럼 다루고자 할때 toString 이라는 메소드가 호출되는데 toString을 return 형태로 반환하기 때문에
	}

}
