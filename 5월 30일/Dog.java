// 강아지 Dog 클래스
// name : 이름
// breed : 종
// age : 나이

// 강아지 3개의 모든 필드를 초기화 할 수 있는
// 생성자

// 강아지 이름, 종을 전달받은 값으로 초기화 하고
// 나이는 1살로 초기화 할 수 있는 생성자

// 모든 필드를 private 접근 제한자로 정보은닉(캡슐화)하고
// 각 필드의 public 한 getter/setter를 작성해보세요

public class Dog {
	private String name;
	private String breed;
	private int age;
	// 기본생성자로 초기화하였다.
	
	public Dog(String n, String b, int a) {
		name = n;
		breed = b;
		age = a;
	}

	// public Dog(String name, String breed, int age) {
		// this.name = name;
		// this.breed = breed;
		// this.age = age;
	// }	이렇게 되면 name;은 파라미터의 name;을 불러오는 것이다
	// 결국 필드에 있는 name을 불러온게 아니므로 아무것도 없는 값인 null이 되게 된다.
	// 이걸 방지할려면 필드 값을 불러온다는 this 참조형을 쓰면 된다.
	
	
	public Dog(String n, String b) {
		this(n, b, 1); 	//  첫번째 생성자가 이미 설정 되어있기때문에 끌어 올수 있다.
						//  == name = n;
						// breed = b;
						// age = 1;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String n) {
		name = n;
	}

/////////////////////

	public void setName(String n, String b) {
		breed = b;
		name = n;
	}





	public String getBreed() {
		return breed;
	}
	
	public void setBreed(String b) {
		breed = b;
	}
	public int getAge() {
		return age;
	}
	
	public void setAge(int a) {
		age = a;
	}	
	
	public void printAll(){
		System.out.printf("%s,%s,%d", name, breed, age);
	}
}
	
	
	
	//생성자와 파라미터 변수 이름은 같아도 된다.
	// 변수 호출은 가장 가까운 값을 불러온다.
	// 