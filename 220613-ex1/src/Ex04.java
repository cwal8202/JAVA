class Student {
	String name;
	int number;
	String major;
	int grade;
	int credit;

	public Student(String name, int number, String major, int grade, int credit) {
		this.name = name;
		this.number = number;
		this.major = major;
		this.grade = grade;
		this.credit = credit;
	}
	
	public Student() {
	}

	public String toString() {
		return "Student [name=" + name + ", number=" + number + ", major=" + major + ", grade=" + grade + ", credit="
				+ credit + "]";
	}

	
	
	
}

class UnderGraduate extends Student {
	String group;

	public UnderGraduate(String name, int number, String major, int grade, int credit, String group) {
		super(name, number, major, grade, credit);
		this.group = group;
	}
	
	public UnderGraduate() {
	}

	@Override
	public String toString() {
		return super.toString() + "UnderGraduate [group=" + group + "]";
	}
	
	public void printAll() {
		System.out.println(toString());
	}
	
}

class Graduate extends Student {
	String type;
	double ratio;
	public Graduate(String name, int number, String major, int grade, int credit, String type, double ratio) {
		super(name, number, major, grade, credit);
		this.type = type;
		this.ratio = ratio;
	}
	
	public Graduate() {
	}
	
	@Override
	public String toString() {
		return super.toString() + "Graduate [type=" + type + ", ratio=" + ratio + "]";
	}
	
	public void printAll() {
		System.out.println(toString());
	}
}


public class Ex04 {
	public static void main(String[] args) {
		Graduate g = new Graduate();
		g.printAll();
		UnderGraduate u = new UnderGraduate();
		u.printAll();
	}

}
