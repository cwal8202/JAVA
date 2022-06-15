// 도형
// x좌표
// y좌표

// 넓이 구할 수 있음.
// 추상 클래스는 인스턴스화가 안된다. 추상적이라 미완성적인 클래스기 때문이다.
public abstract class Shape {	// 추상메소드를 가진 기본 클래스는 인스턴스화가 안된다. 추상클래스가 되어야 한다.
	private int x;
	private int y;
	public Shape(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return "Shape [x=" + x + ", y=" + y + "]";
	}
	
	// 추상 메소드 - 동작에 대한 구체적X -> 메소드 Head만 존재. body가 없다.
	public abstract int getArea(); // 추상적이다   =  도형의 넓이는 추상적이다. 왜냐면  삼각형 사각형 원의 넓이는 다 다르기 때문이다.
}




