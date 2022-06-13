public class Test {
	public static void main(String[] args) {
		SportsCar c = new SportsCar();
		c.color = "Red";
		c.speedUp(100);
		c.speedDown(30);
		c.setTurbo(true);
		
		
		// SportsCar쓰기전 Car클래스가 잘 작동하는지  확인하는게 좋다.
		Car normalCar = new Car();
		normalCar.color = "Green";
		normalCar.speedUp(30);
		normalCar.speedDown(20);
		// normalCar.setTurbo(true); 이건 안됨.
	}
}
