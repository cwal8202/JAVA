interface PrintAll {
	void printAll();
}

class subPrintAll implements PrintAll {
	@Override
	public void printAll() {
		System.out.println("이렇게 클래스를 만들어서~");
	}
	
}

public class Main {
	public static void main(String[] args) {
		new PrintAll() {
			@Override
			public void printAll() {
				System.out.println("출력할 것이 없다.");
			}
		}.printAll();				// 인스턴스 하나가 바로 된다. Scanner scan = new Scanner(); 이러고 scan.nextLine(); 이 아닌
									// new Scanner().nextLine(); 이 가능하다~
		PrintAll a = new PrintAll() {
				@Override
				public void printAll() {
					System.out.println("출력할 것이 없다.");
				}
			};
			a.printAll(); 	// 위의 익명 클래스에 변수이름만 설정해준것이다.
		
		subPrintAll s = new subPrintAll();
		s.printAll();
		
		
	}
//		class Point implements PrintAll {
//			int x;
//			int y;
//			public Point(int x, int y) {
//				this.x = x;
//				this.y = y;
//			}
//		}
//		
//		Point p = new Point(10, 20);
//	}
}
