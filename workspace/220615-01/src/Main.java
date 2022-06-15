// 삼각형// 중심점(x, y)// 밑변// 높이// 넓이를 구해서 알려줄 수 있음.

// 직사각형// 중심점(x, y)// 가로// 세로// 넓이를 구해서 알려줄 수 있음.

// 원// 중심점(x, y)// 반지름// 넓이를 구해서 알려줄 수 있음.




public class Main {

	public static void main(String[] args) {
//		Shape s1 =  Shape(10, 20);
//		// 추상클래스는 인스턴스화가 안된다. 구체적이지 않아서 도형은 도형이라는 클래스를 만들지 못한다.
//		Shape s2 = new Shape(10, 20);
		
		Shape r = new Rectangle(0, 0, 10, 10);
		System.out.println(r.getArea());
		
		Shape c = new Circle(0, 0, 5);
		System.out.println(c.getArea());
		
//		Triangle t = new Triangle(0, 0, 5, 5);
//		System.out.println(t.getArea());
//		
//		Shape s = t;
//		
//		// 부모클래스의 추상메소드를 참조하고 있어도 자식 메소드에서 오버라이드를 한 메소드는 추상메소드일지라도 값이 나온다.
//		System.out.println(s.getArea());
		
	}
}
