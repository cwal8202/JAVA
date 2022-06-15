public class Circle extends Shape {
	private int radius;

	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}

	@Override
	// Override 하는 부모의 메소드의 형태를 바꾸면 컴파일 에러가 난다. ex) int getArea 를  double getArea로 적는것은 에러가 난다.
	public int getArea() {
		return (int) (radius * radius * Math.PI);
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

}
