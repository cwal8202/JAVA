class Car {
	private String color;
	private int speed;
	private int gear;
	// 자동차의 시리얼 번호
	private int id;
	// 실체화된 Car 객체의 개수를 위한 정적 변수
	private static int numberOfCars = 0;	// static 이 없으면 값은 따로따로 1씩 나올 것이다. static을 붙였기 때문에 1에 1이 더해져 2가 된것이다. static은 객체 밖에 있는것이다.
	// 공유를 하고 싶은 하나의 변수 or 값이 있다면 static한 상수를 만들면 값을 공유할때 좋은 수단이 된다.
	// 하지만 어느곳에서나 변경이 가능하고 누가 변경한지 모르게 되는 값이 될수 있을땐 나중을 위해 private을 쓰는게 좋다.
	public Car(String c, int s, int g) {
		color = c;
		speed = s;
		gear = g;
		// 자동차의 개수를 증가하고 id 번호를 할당한다.
		
		
		// numberOfCars++;
		// id = numberOfCars;  밑에것과 똑같은 의미
		id = ++numberOfCars;
	}
	
	//public static void printColor() {
	//	System.out.println(color);		// 오류가 난다. 왜냐면 color은 인스턴스화 이후에 생성되는 필드 값인데 static은 객체 밖에 있는 경우라서 밖에는 color라는 게
	//}									// 없는데 밖에서 color를 불러 올려고 하기 때문이다.
	
//	public void printStaticNumber() {
//		System.out.println(numberOfCars);
//	}	객체의 행동인 메소드로 만들면 이 값을 부를려면 인스턴스화 한 후 메소드를 불러와야 한다.
	
	
	// 정적 메소드
	public static int getNumberOfCars() {
		return numberOfCars;	// OK!
	}
}
public class CarTest3 {
	public static void main(String[] args) {
		Car c1 = new Car("blue", 100, 1);	// 첫 번째 생성자 호출
		Car c2 = new Car("white", 0, 1);	// 두 번째 생성자 호출
		int n = Car.getNumberOfCars();		// 정적 메소드 호출
		System.out.println("지금까지 생성된 자동차 수 = " + n);
	}

}
