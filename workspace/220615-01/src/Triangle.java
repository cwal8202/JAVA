public class Triangle extends Shape {
	private int base;
	private int height;
	
	public Triangle(int x, int y, int base, int height) {
		super(x, y);
		this.base = base;
		this.height = height;
	}

	
	
	public int getBase() {
		return base;
	}



	public int getHeight() {
		return height;
	}



	public void setBase(int base) {
		this.base = base;
	}



	public void setHeight(int height) {
		this.height = height;
	}



	// 추상메소드를 Overrride하는 실제 동작 메소드를 만든다. 새롭게 재정의!
	// '부모가 가진 추상 메소드를 구현한다' 라고 말을 한다.
	@Override
	public int getArea() {
		return base * height / 2;
	}

	
}
