public class Main {
	public static void main(String[] agrs) {
//		Flyable f = enw Flyable();		
		
//		Penguin penguin = new Penguin();
//		IFlyable test = penguin;		- 펭귄은 인터페이스로 upcasting이 안된다.
		
		
		
		Eagle e = new Eagle();
		Bird b = e;
		Animal a = e;
		IFlyable f = e;
		
//		Eagle downCasting = (Eagle) f; 
		
//		Eagle downCasting1 = (Eagle) f;
		
		
		f.fly();		// 결국 Animal이 독수리를 가르키고 있다.
		
		IFlyable p = new Plane();
		// instanceof 로 인스턴스를 확인 하고 실행하는게 안전하다.
//		Eagle test = (Eagle)p; 실행 오류난다.
		
		IFlyable fish = new FlyingFish();
		
		p.fly();
		fish.fly();
	}
}
