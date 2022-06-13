public class Person {
	private String name;
	protected int age;	// protected 자식들이 접근 할 수 있게 만든 접근제한자.
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
}
