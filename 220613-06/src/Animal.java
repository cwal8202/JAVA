// 부모의 메소드를 출력값을 다르게 사용하기

public class Animal {
	public void sound() {
		System.out.println("동물은 제각각의 소리를 냅니다");
	}
}

class Dog extends Animal {
	@Override	// annotation	// override가 됐는지 검사할 수 있는 입력 - 하는 이유 =  부모 메소드와 똑같이 적었는지 확인할려고! 메소드 이름을 잘못적어도 흐름엔 문제가 없다.
	public void sound() {			// method override 부모 메소드의 값을 내가 원하는 값으로 덮어씌우는것
		System.out.println("멍멍");
	}
}

class Cat extends Animal {
	public void sound() {
		System.out.println("미야옹");
	}
}
