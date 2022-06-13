public class Car {
	// 3개의 필드 선언
	int speed;
	int gear;
	public String color;
	
	public void speedUp(int increment ) {
		speed += increment;
	}
	public void speedDown (int decrement) {
		speed -= decrement;
	}
}

