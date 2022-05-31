// 학급(반)
// 학생
// 학생
// 학생

// 1. 3명의 학생의 이름을 콘솔에 출력할 수 있음.
// 2. 학생 3명의 총 평균을 알려줄 수 있음.
// 3. 평균 점수가 가장 높은 학생(참조)을 알려줄 수 있음. => 동일점수 1 < 2< 3 return타입은 학생이어야 함.

class Class {
	public Student a;
	public Student b;
	public Student c;
	
	public Class(Student x, Student y, Student z) {
		a = x;
		b = y;
		c = z;
	}
		
	void printAll() {
		System.out.println(a.getName());
		System.out.println(b.getName());
		System.out.println(c.getName());
	}
	
	int printAvg() {
		int sum = a.getAverage() + c.getAverage()  + b.getAverage() ;
		return sum / 3;
	}
	
	public void best() {
		if(a.getAverage() >= b.getAverage() && a.getAverage() >= c.getAverage()) {
			System.out.println(a.getName());
		} else if(b.getAverage() >= a.getAverage() && b.getAverage() >= c.getAverage()) {
			System.out.println(b.getName());
		} else {
			System.out.println(c.getName());
		}
	}
	
}
	
	


public class TestClass {
	public static void main(String[] args) {
		Student student1 = new Student("최장호", 100, 90, 100);
		// Student student1 = new Student();
		// student1.name = "최장호";
		// student1.kor = 100;
		// student1.eng = 90;
		// student1.math = 100;
		Student student2 = new Student("장영빈", 100, 90, 100);
		Student student3 = new Student("장일빈", 100, 90, 100);

		Class test = new Class(student1, student2, student3);
		
		test.printAll();
		
		System.out.println(test.printAvg());
		
		test.best();
		
		
//		int avg1 = student1.getAverage();
//		int avg2 = student2.getAverage();
//		int avg3 = student3.getAverage();
//		
//		System.out.println((avg1+avg2+avg3) / 3);
		
	}
}