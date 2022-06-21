import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// 학생
// 이름
// 나이

// (학생의 이름과 나이가 같으면 동일 학생입니다)

// 홍길동 15
// 둘리 22
// 도우너 33

// 위의 학생을 원소로 가지는 리스트를 생성하고
// (도우너 33) 학생의 인덱스를 찾아보세요

class Student implements Comparable<Student> {
	private String name;
	private int age;
	private int score;
	
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public Student(String name, int age, int score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}

	public int getScore() {
		return score;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", score=" + score + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Student))
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public int compareTo(Student o) {
		return score - o.score;
	}
}

public class Mian2 {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student("홍길동", 15, 90));
		list.add(new Student("둘리", 22, 80));
		list.add(new Student("도우너", 33, 55));
		
		System.out.println(list);
		System.out.println("학생은 몇명일까요? : " + list.size());
		System.out.println("도우너는 이미 있는 학생인가요? : " + list.contains(new Student("도우너", 33, 90)));
		System.out.println("도우너의 인덱스 번호는? : " + list.indexOf(new Student("도우너", 33, 0)));
		
		// 정렬
		Collections.sort(list);			// 처음에 컴파일 에러가 났다. 왜냐면 학생은 비교가 안되기 때문이다. 그래서 Student를 'Comparable' 인터페이스를 구현하고 추상메소드인 compare to를 재정의 했다.
		System.out.println(list);
		
		Comparator<Student> comparator = new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o1.getAge() - o2.getAge();
			}
		};
		
		
//		Collections.sort(list, new Comparator<Student>() {
//			@Override
//			public int compare(Student o1, Student o2) {
//				return o1.getAge() - o2.getAge();
//			}
//		});			// comparator 이랑 같은 의미다.
		
		Collections.sort(list, comparator);
		System.out.println(list);
		
	}
}
