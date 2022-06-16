import java.util.Arrays;

// 동물원 관리

// 동물 - 종, 나이, 무게

// 사자		// 으르렁 운다, 육식
// 호랑이		// 어흥 운다, 육식
// 기린		// 초식
// 토끼		// 초식
// 말		//	이히힝 운다
// 개		//	멍멍운다
// 고양이		// 야옹운다

// 직원 - 역할(조련사, 경영 등등), 이름
// 조련사는 동물들을 담당합니다.

// 동물은 육식/ 초식으로 나누어서 관리됩니다.
// 주식으로 분류하여 동물 목록을 볼 수 있음.
// 조련사 담당에 따라 동물 목록을 볼 수 있음. ( 담당이 없는 동물도 볼 수 있어야 함)

//////////////////////////////////////////////

// 동물마다 종 나이 무게가 있다. 
// 직원마다 역할이 있다. 그중 조련사는 동물을 담당한다.
// 동물원을 관리하는데 육식과 초식으로 나뉜다
// 초식, 육식에 따라 동물 목록을 볼 수 있다.
// 조련사는 육식 조련사 초식 조련사가 있다.

class Animal {
	String genus;
	int age;
	double weight;
	public Animal(String genus, int age, double weight) {
		this.genus = genus;
		this.age = age;
		this.weight = weight;
	}
}

interface taste {
	void result();
}

interface meat extends taste {
	@Override
	default void result() {
		System.out.println("육식입니다.");
	}
}

interface vegetable extends taste {
	@Override
	default void result() {
		System.out.println("초식입니다.");
	}
}

class Tiger extends Animal implements meat{
	public Tiger(String genus, int age, double weight) {
		super(genus, age, weight);
	}
	public void result() {
		System.out.println("호랑이는 육식입니다.");
	}
	@Override
	public String toString() {
		return "Tiger [genus=" + genus + ", age=" + age + ", weight=" + weight + "]";
	}
}

class Lion extends Animal implements meat{
	public Lion(String genus, int age, double weight) {
		super(genus, age, weight);
	}
	public void result() {
		System.out.println("사자는 육식입니다.");
	}
	@Override
	public String toString() {
		return "Lion [genus=" + genus + ", age=" + age + ", weight=" + weight + "]";
	}
}

class Rabbit extends Animal implements vegetable{
	public Rabbit(String genus, int age, double weight) {
		super(genus, age, weight);
	}
	public void result() {
		System.out.println("토끼는 초식입니다.");
	}
	@Override
	public String toString() {
		return "Rabbit [genus=" + genus + ", age=" + age + ", weight=" + weight + "]";
	}
}

class Giraffe extends Animal implements vegetable{
	public Giraffe(String genus, int age, double weight) {
		super(genus, age, weight);
	}
	public void result() {
		System.out.println("기린은 초식입니다.");
	}
	@Override
	public String toString() {
		return "Giraffe [genus=" + genus + ", age=" + age + ", weight=" + weight + "]";
	}
}

class Employee {
	String name;
	String part;
	public String getName() {
		return name;
	}
	public String getPart() {
		return part;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPart(String part) {
		this.part = part;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", part=" + part + "]";
	}
	
	
}

class zookeeper 


public class Zoo {
	public static void main(String[] args) {
		Animal[] a = new Animal[4];
		a[0] = new Tiger("개과", 3, 100);
		a[1] = new Lion("개과", 3, 100);
		a[2] = new Rabbit("토끼과", 2, 40);
		a[3] = new Giraffe("기린과", 10, 120);
		
		for (Animal b : a) {		// 콜론을 기준으로 오른쪽은 배열 왼쪽은 배열의 값이 반복되서 되는것이다.
			System.out.println(b.toString());
		}
		

	}
}
