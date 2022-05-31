public class TestStudent {
	public static void main(String[] args) {
		Student student1 = new Student("체장허", 100, 100, 10);
		int avg1 = student1.getAverage();
		System.out.println(avg1);
	
		Student student2 = new Student("장영빈", 0, 10, 2);
		Student student3 = new Student("장일빈");
	
		int avg2 = student2.getAverage();
		int avg3 = student3.getAverage();
	
		int sum = avg1 + avg2 + avg3;
		int totalAvg = sum / 3;
	
		System.out.println(totalAvg);
	}
}
