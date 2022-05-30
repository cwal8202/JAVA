// 클래스 학생

// 이름
// 국어 점수
// 영어 점수
// 수학 점수

// 생성자 (필드 생성하는)
// getter / setter

// 자기 평균 점수를 알려줄 수 있음. 평균 물어보면 알려줄수 잇는 메소드가 있었으면 좋겠다.

class Student {
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	public Student (String n, int k, int e, int m) {
		name = n;
		kor = k;
		eng = e;
		math = m;
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public String getName() {
		return name;
	}
		
	
	
	public int avg(){
		return ((kor+eng+math)/3);
	}
}

public class MyScore {
	public static void main(String[] args) {
		Student my = new Student("최장호", 90, 80, 80);
		Student my1 = new Student("최장호", 90, 80, 80);
		
		
		my1.setName("나다");
		System.out.print(my1.getName());
	
		System.out.print(my.avg());

		
		
	}
}

// private 를 한 후 바로 값을 my.name으로 지정하고 컴파일을 하였더니 오류가 났다.
// 그 이유는 private 이기 때문에 다른 클래스에서 불러 올수 없다. 불러 올려면
// public한 값을 하나 설정해서 그 값을 불러와야 한다.