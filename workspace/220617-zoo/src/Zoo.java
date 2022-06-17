import java.util.Arrays;
import java.util.Scanner;

class Animal {
	String genus;
	int age;
	double weight;
	String taste;
	public Animal(String genus, int age, double weight, String taste) {
		this.genus = genus;
		this.age = age;
		this.weight = weight;
		this.taste = taste;
	}
	
	
	public String getGenus() {
		return genus;
	}

	public int getAge() {
		return age;
	}

	public String getTaste() {
		return taste;
	}

	public double getWeight() {
		return weight;
	}

	public void setGenus(String genus) {
		this.genus = genus;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public void setTaste(String taste) {
		this.taste = taste;
	}

	@Override
	public String toString() {
		return "Animal [genus=" + genus + ", age=" + age + ", weight=" + weight + ", taste=" + taste + "]";
	}
	
}

class Employee {
	String name;
	String part;
	
	public Employee(String name, String part) {
		this.name = name;
		this.part = part;
	}
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

class ZooKeeper extends Employee {
	Animal[] myAnimal = new Animal[2];
	String result = "";
	
	public ZooKeeper(String name, String part) {
		super(name, part);
	}

	public Animal[] getMyAnimal() {
		return myAnimal;
	}

	public void setMyAnimal(Animal[] myAnimal) {
		this.myAnimal = myAnimal;
	}

	// 사육사가 가진 동물 목록 보는 메소드
	public void printMyAnimal(Animal[] a) {
		for (int i = 0; i < a.length; i++) {
			result += a[i].genus + "\n";
		}
		System.out.println(getName() + "가 가진 동물 목록" + "\n" + result);
	}
	
}

// 종류 무게 이름을 가진 동물들이 있다.
// 이름과 직업을 가지는 직원이 있다.
class Remote {
	Animal[] all = new Animal[5];
	Animal[] input = new Animal[100];
	
}

public class Zoo {
	static final String 육식 = "육식";
	static final String 초식 = "초식";
		
		
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
					
		Animal[] x = new Animal[5];
		x[0] = new Animal("호랑이", 3, 100, "육식");
		x[1] = new Animal("사자", 3, 100, "육식");			
		x[2] = new Animal("토끼", 2, 40, "초식");
		x[3] = new Animal("기린", 10, 120, "초식");
		x[4] = new Animal("뱀", 10, 10, "육식");
			
//			for (Animal b : a) {		// 콜론을 기준으로 오른쪽은 배열 왼쪽은 배열의 값이 반복되서 되는것이다.
//				System.out.println(b.toString());
//			}
			
			// 육식 구별
		String meat = "";
		String vegetable = "";
		for (int i = 0; i < x.length; i++) {
			if (x[i].getTaste().equals(육식)) {
				meat += x[i].toString() + "\n";
			}	
		}
			
			// 초식 구별
		String result = "";
		for (int i = 0; i < x.length; i++) {
			if (x[i].getTaste().equals(초식)) {
				vegetable += x[i].toString() + "\n";
				}
			}
			System.out.println("< 육식 >" + "\n" + meat + "\n" + "< 초식 >" + "\n" + vegetable);
			
			
		ZooKeeper k = new ZooKeeper("최장호", "사육사");
		Animal[] my = new Animal[2];
		my[0] = x[0];
		my[1] = x[2];

		k.printMyAnimal(my);
			
		ZooKeeper m = new ZooKeeper("장영빈", "사육사");	
		Animal[] you = new Animal[2];
		you[0] = x[1];
		you[1] = x[3];

		m.printMyAnimal(you);
			
		ZooKeeper non = new ZooKeeper("아무도 선택하지 않은", "사육사");
		Animal[] no = new Animal[x.length - (my.length + you.length)];
		for (int j = 0; j < x.length; j++) {
			for (int i = 0; i < no.length; i++) {
				if (!(x[j].genus.equals(my[i].genus)) && !(x[j].genus.equals(you[i].genus))) { 
					no[i] = x[j];
				}
			}
		}
		non.printMyAnimal(no);
			
	}
}