class Student {
	String name;
	int age;
}

interface ISalutable {
	void salute();
}

interface KoreanSalutable extends ISalutable {
		void kimchi();
}

class KoreanStudent extends Student implements ISalutable {

	@Override
	public void salute() {
		System.out.println("안녕");
	}
	
}

class KoreanMiddleStudent extends Student implements KoreanSalutable {

	@Override
	public void salute() {
		System.out.println("안녕");
	}

	@Override
	public void kimchi() {
		System.out.println("한국의 전통 김치");
	}
}

class BritshStudent extends Student implements ISalutable {

	@Override
	public void salute() {
		System.out.println("Hello");
	}
	
}

class American implements ISalutable {

	@Override
	public void salute() {
		System.out.println("Wassup");
	}
	
}

public class Main2 {
	public static void main(String[] args) {
		KoreanStudent kim = new KoreanStudent();
		BritshStudent leo = new BritshStudent();
		American jason = new American();
		
//		kim.salute();
//		leo.salute();
//		jason.salute();
//		
//		Student k = kim;
//		Student l = leo;
//		ISalutable an = kim;
//		ISalutable he = leo;
		
//		ISalutable wa = jason;
//		
//		Object[] arr = new Object[3];
//		arr[0] = kim;
//		arr[1] = leo;
//		arr[2] = jason;
//		
//		for (int i = 0; i < arr.length; i++) {
//			// arr[1].salute(); arr[1] 은  object이므로 모든 object는 인사를 하는게 아니라서 안된다.
//		}
		
		ISalutable[] arr1 = new ISalutable[3];
		arr1[0] = kim;
		arr1[1] = leo;
		arr1[2] = jason;
		
		for (int i = 0; i < arr1.length; i++) {
			 arr1[i].salute();
		}
		
		
		
	}

}
