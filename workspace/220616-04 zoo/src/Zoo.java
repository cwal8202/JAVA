import java.util.Arrays;

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

	
	
	public class Zoo {
		static final String 육식 = "육식";
		static final String 초식 = "초식";
		
		
		public static void main(String[] args) {
//			Animal[][] x = new Animal[2][2];
//			x[0][0] = new Animal("호랑이", 3, 100, "육식");
//			x[0][1] = new Animal("사자", 3, 100, "육식");
//			
//			x[1][0] = new Animal("토끼", 2, 40, "초식");
//			x[1][1] = new Animal("기린", 10, 120, "초식");
					
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
			
			
			
			
		//	String z = "zookeeper"; 나중에 바꾸기
//			// 육식
//			for (int j = 0; j < x[0].length; j++) {
//				System.out.println(x[0][j].getGenus());
//			}
//			// 초식
//			for (int j = 0; j < x[1].length; j++) {
//				System.out.println(x[1][j].getGenus());
//			}
//			
//			
//			Employee first = new Employee("최장호", "zookeeper 1");
//			if (first.getPart().equals("zookeeper")) {
//				
//				for (int i = 0; i < x.length; i++) {
//					for (int j = 0; j < x[i].length; j++) {
//						System.out.println(x[i][j].toString());
//					}
//				}
//			}
//			// 육식은 0
//			if (first.getPart().equals("zookeeper 0")) {
//				for (int i = 0; i < x[0].length; i++) {
//					System.out.println(x[0][i].getGenus());
//				}
//			}
//			// 초식은 1
//			if (first.getPart().equals("zookeeper 1")) {
//				for (int i = 0; i < x[1].length; i++) {
//					System.out.println(x[1][i].getGenus());
//				}
//			}
			
			
			
			
			
		}
	}