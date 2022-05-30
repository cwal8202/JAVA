// p 203
class Point { // (public이나 private등을 아무것도 적지 않은) 디폴트 접근자는 한파일안에 있는 파일들을 불러올때 쓴다.
	private int x, y;
	//생성자
	public Point(int a, int b) {
		x = a;
		y = b;
	}
	
	public int getA() {
		return x;
	}
	public int getB() {
		return y;
	}
}

class Circle {
	private int radius = 0;
	private Point center; // has-a 관계 = 클래스를 필드로 가지는 클래스
						 //point 참조 변수가 필드로 선언 되어 있다
	
	//생성자
	public Circle(Point p, int r) {
		center = p;
		radius = r;
	}
	
	// 중심점을 getter로 알려줄수있다.
	public Point getPoint() {
		return center;
	}
	public void setPoint(Point p) {
		this.center = p; //this는 필드의 값을 나타낸다는것을 보여주기 위해 붙였다.
	}
}

public class CircleTest {
	public static void main(String args[]) {
		// Circle 객체를 생성하고 초기화한다.
		Point p = new Point(25, 78);
		Circle c = new Circle(p, 10);
		
		System.out.println(p.getA());  // 자기 자신을 문자열로 인식한다.
		System.out.println(c.getPoint());
	}
}

// Point 클래스는 점을 나타내는 클래스다
// Point center는 center 라는 참조형 변수의 점을 나타내는(x축과y축) 것이다.
// r 은 정수이며
// Circle c = new Circle(p, 10); 는 반지름 10이며 중심점 p인 원
//	Point p = new Point(25, 78); 이때 점의 위치는 x = 25 y = 78이다.