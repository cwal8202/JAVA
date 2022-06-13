public class Test {
	public static void main(String[] args) {
		ColorBox cb2 = new ColorBox();
		System.out.println(cb2.width); 		// 자식생성자의 기본 생성자는 부모의 기본생성자를 상속받은 값을 기본생성자에 자동으로 입력된다.
		// ColorBox() {
//			super();
//			this.color = null
			}
		
		/*
		 * Box box1 = new Box(10, 10, 10);
		 * 
		 * System.out.println(box1.getVolume());
		 * 
		 * ColorBox cb1 = new ColorBox(20, 20, 20, "Red");
		 * 
		 * System.out.println(cb1.getVolume()); System.out.println(cb1.getColor()));
		 */
	}
}
