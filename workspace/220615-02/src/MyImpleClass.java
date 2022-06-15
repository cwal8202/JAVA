// class Test extends MyImpleClass {}

public final class MyImpleClass extends MySubClass {
	@Override
	public void myMethod() {
		System.out.println("새롭게 재정의를 하였습니다.");
	}
	
//	@Override
//	public void myMethod2() {
//		System.out.println("마이메소드 2 오버라이드 구현");
//	}
	
	public static void main(String[] args) {
		MyClass m = new MyImpleClass();
		m.myMethod();
	
	//	m.myMethod2(); MyClass 는 myMethod2가 없다.
	
		MySubClass sub = (MySubClass) m;
		sub.myMethod();
		
		sub.myMethod2();
		
	}
	
}
