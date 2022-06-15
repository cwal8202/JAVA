import java.lang.reflect.Array;
import java.util.Arrays;

class Member implements Comparable<Member> {
	String name;
	double height;
	double weight;
	
	public Member(String name, double height, double weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}

	double bmi() {
		return weight / height * height ;
	}
	
	String bmiResult() {
		if (bmi() <= 35) {
			return  "결과 : 고도비만" + "현재 BMI : " + bmi() + "35이상";
			} else if (bmi() < 35 && bmi() >= 30) {
				return "결과 : 중도비만" + "현재 BMI : " + bmi() + "30 이상 ~ 35 미만";
			} else if (bmi() < 30 && bmi() >= 25) {
				return "결과 : 경도비만" + "현재 BMI : " + bmi() + "25 이상 ~ 30 미만";
			} else if (bmi() < 23 && bmi() >= 25) {
				return "결과 : 과체중" + "현재 BMI : " + bmi() + "23 이상 ~ 25 미만";
			} else if (bmi() < 18.5 && bmi() >= 23) {
				return "결과 : 정상" + "현재 BMI : " + bmi() + "18.5 이상 ~ 23 미만";
			} else if (bmi() < 18.5 && bmi() >= 0) {
				return "결과 : 저체중" + "현재 BMI : " + bmi() + "18.5 미만";
			}	else return "잘못된 입력입니다.";
	}
	
//	@Override
//	public int compareTo(Member m) {
//		if (height > m.height) {
//		return 1;
//		} else if (height == m.height) {
//			return 0;
//		} else return -1;
//	}
	
	@Override
	public int compareTo(Member m) {
		if (weight > m.weight) {
		return 1;
		} else if (weight == m.weight) {
			return 0;
		} else return -1;
	}

	public String getName() {
		return name;
	}

	public double getHeight() {
		return height;
	}

	public double getWeight() {
		return weight;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", height=" + height + ", weight=" + weight + "]";
	}
	
}



public class Compare {
	public static void main(String[] args) {
		Member[] all = new Member[4];
		all[0] = new Member("최장호", 1.8, 70);
		all[1] = new Member("장영빈", 1.7, 40);
		all[2] = new Member("장일빈", 1.6, 40);
		all[3] = new Member("장이빈", 1.6, 30);
		
		Arrays.sort(all);			// Arrays.sort는 static메소드 즉 정적인 메소드이다.
		for (Member m : all)
			System.out.println(m.toString());
		
	}

}
