import java.util.ArrayList;
import java.util.List;

class Point2D {
	private int x;
	private int y;
	public Point2D(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	@Override
	public String toString() {
		return "Point2D [x=" + x + ", y=" + y + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Point2D))
			return false;
		Point2D other = (Point2D) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
	
	
	
}

public class Main {
	public static void main(String[] args) {
		List<Point2D> list = new ArrayList<>();
		// 0, 0
		list.add(new Point2D(0, 0));
		// 5, 5
		list.add(new Point2D(5, 5));
		
		Point2D p = list.get(0);
		System.out.println(p);

		Point2D p2 = list.get(1);
		System.out.println(p2);
		
		// 리스트에 0,0 좌표 객체가 있는지???
		// 리스트에 0,0 좌표 객체의 인댁스 몇번인지??
		
		// equals 는 왼쪽 참조 오른쪽 참조 같을때만 true를 반환한다.
		//list는 cointas로 equals 호출 하는데 우리가 만든 point2D같은 경우
		//기본 equals로 될 것이다
		//하지만 equals는 왼쪽 오른쪽 참조 같을때만 되기 때문에 Point2D로 다시 오버라이드(재정의) 해야한다.
		System.out.println(new Point2D(0, 0).equals(new Point2D(0, 0)));
		
		System.out.println(list.contains(new Point2D(0, 0)));		// equals를 기준으로 하는것이다 contains는
		System.out.println(list.indexOf(new Point2D(0, 0)));
		System.out.println(list);
		System.out.println(list.remove(new Point2D(5, 5)));
		
		System.out.println(list);
	}

}
