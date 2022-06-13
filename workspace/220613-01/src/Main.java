public class Main {
	public static void main(String[] args) {
		Person p = new Person("사람이름", 22);
		
		Student s = new Student("학생이름", 17, 90);	// 흐름은 학생의 생성자에 값이 대입된 후 Person의 name과 age 즉
													// super(부모)생성자를 불러온 후 score 값이 넣어진다.
		System.out.println(s.getName());
		System.out.println(s.getScore());
		System.out.println(s.getAge());
		// p.getScore(); 사람은 Score가 없다.
		
		Author a = new Author("작가이름", 30, "반지의길");
		System.out.println(a.getName());
		System.out.println(a.getBookList());
		System.out.println(s.getAge());
	}
}
