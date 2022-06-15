public interface IFlyable {	//	 인터페이스 = 추상적 메소드만 가지고 있는것.
	//public abstract 가 생략가능하다. 
	void fly();	
	
//	public void print() { 일반적 메소드 못가진다.
//		System.out.println("Hello");
//	}
}

class Animal {}
class Bird extends Animal {}
						// 상속표현 우측에 구현한다라는 implements를 쓴다.
class Eagle extends Bird implements IFlyable{
	@Override
	public void fly() {
		System.out.println("푸드득 푸드득");
	}
	
}
class Penguin extends Bird {}

class FlyingFish extends Animal implements IFlyable {
	@Override
	public void fly() {
		System.out.println("날치가 물위로 난다.");
	}
}

class Plane implements IFlyable {

	@Override
	public void fly() {
		System.out.println("하늘위로 비행기가 난다");
	}
	
}
