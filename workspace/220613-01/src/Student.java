public class Student extends Person {
	private int score;
	
	public Student(String name, int age, int score) {
		super(name, age);
		this.score = score;
	}
// super = 부모의 생성자를 불러온다.
// super은 제일 처음에 써야한다. 나중에 쓰면 오류 난다.
	
	
	public int getScore() {
		return score;
	}
}
