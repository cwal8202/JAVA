public class TestBox {
	public static void main(String[] args) {
		// Box none = null; // null 참조가 없다는 뜻
		// none.width = 10; // 컴파일 에러남
		
	
	
		Box box1;
		box1 = new Box();
		
		box1.width = 3; // .width는 참조형 변수 안을 입력하는게 아닌 인스턴스 안에 있는것을 가르킨다.
		box1.length = 3;
		box1.height = 3;
		
	//	System.out.println(box1.color); // box클래스안에 color는 없다. 컴파일 오류남.
		
		Box box2 = new Box();
		
		box2.width = 10;
		box2.length = 10;
		box2.height = 10;
		
		System.out.println("부피" + box1.getVolume());
		System.out.println("부피" + box2.getVolume());
		
		box1.printAllState();
		box2.printAllState();
		
		
		// System.out.println(box1.width);
		// System.out.println(box2.width);
		
		// box1.width = 5;
		// System.out.println(box1.width);
	}
}