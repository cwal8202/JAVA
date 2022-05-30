public class Box {
	int width;
	int length;
	int height;
	
	//여러개의 생성자를 만들때 파라미터가 같으면 안된다. 
	public Box() { // 기본생성자를 쓰고 싶을때 이렇게 기본생성자를 따로 만들수 있다. 기본 생성자는 초기화 하는 값이 무조건 0 null false로 된다.
		width = 1;
		length = 1;
		height = 1;
	}
	
	//생성자는 클래스 이름 그대로 해야함. 생성자가 하나라도 있으면 기본 생성자는 인식이 안된다. 그렇기에 기본생성자 ();를 하면 컴파일 오류가 난다.
	public Box(int w, int l, int h) {
		width = w;
		length = l;
		height = h;
	}
	
	public static void main(String[] args) {
		
		Box b3 = new Box(); //컴파일 오류남 - 생성자를 설정했기에 기본생성자();는 인식이 안되고 생성자 int 타입으로 3개 작성해야한다.
		
		// Box b = new Box(50, 60, 70); // 생성자가 초기화 되어서 0 0 0이 나온다. 기본생성자.
		// b.width = 100;
		// b.length = 100;
		// b.height = 100;
		
		// System.out.println(b.width);
		// System.out.println(b.length);
		// System.out.println(b.height);
			
			
		// 박스 인스턴스화, 생성자를 호출해서 가로 90 새로 100 높이 110	
		// Box b2 = new Box(90, 100, 110);
		// System.out.println(b2.width + b2.length + b2.height);
	}
}