import java.util.Scanner;

// 회원 = member 클래스로 만들었다.
// 이름
// 키
// 몸무게


//BMI 지수 = bmi머신을 만들었다
//BMI = 몸무게(kg) / 키^2(m)
//고도 비만 : 35 이상
//중(重)도 비만 (2단계 비만) : 30 이상 - 35 미만
//경도 비만 (1단계 비만) : 25 이상 - 30 미만
//과체중 : 23 이상 - 25 미만
//정상 : 18.5 이상 - 23 미만
//저체중 : 18.5 미만

// ********************** 한거

// 회원 관리 프로그램
// 회원을 콘솔입력으로 등록할 수 있게. 최대 10명 - 배열로 만들자  -  ***배열 member[] members 메소드로 만들었다***
// 중복 등록이 되면 안 됨 (이름, 키, 몸무게가 동일하면 중복입니다) - equals 메소드를 override해서 만들자
// 기준에 따라 집계를 해서 목록을 보여줘야합니다.	// 집계는 bmi 결과 if문 돌려서 count를 하자.


class Member {
	protected String name;
	protected double height;
	protected double weight;
	
	public Member() {
	}
	
	public Member(String name, double height, double weight) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
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

class BmiMachine extends Member {
	public BmiMachine(Member[] input) {
		for (int i = 0; i < input.length; i++) {
			if(input[i].name.equals(null)) {
				System.out.println("BMI 끝");
				break;
			}
			name = input[i].name;
			height = input[i].height;
			weight = input[i].weight;
			System.out.println(bmiResult());
		}
	}
	// 생성자
//	public BmiMachine(String name, double heigth, double weigth) {
//		super(name, heigth, weigth);
//	}

	// bmi 구하는 메소드
	public double bmi() {
		// 키를 183 이렇게 적는 사람이 있을까봐 만든 if문!!!
		if (height > 10) {
			height = height/100;
		} 
		return (weight/(height*height));
	}
	
	// bmi 지수 따른 분류 메소드
	public String bmiResult() {
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
	
	public void printBmi() {
		System.out.println(bmiResult());
	}
}

class MemberManagement {
	Scanner scan = new Scanner(System.in);
	// 사용자가 정보 입력하면 회원이 만들어지는 메소드
	public Member input(){
		System.out.println("이름을 입력하세요");
		String name = scan.nextLine();
		
		System.out.println("키를 입력하세요(M)");
		double height = scan.nextDouble();
		
		// 키를 183 이렇게 적는 사람이 있을까봐 만든 if문!!!
		if (height > 10) {
			height = height/100;
		}
		System.out.println("몸무게를 입력하세요(kg)");
		double weight = scan.nextDouble();
		Member input = new Member(name, height, weight);
		return input;
	}
	
	public Member[]	members() {
		Member[] members = new Member[10];
		for (int i = 0; i < members.length; i++) {
			//members[i] = new Member();
			members[i] = input();
			System.out.println("입력완료 \n 그만하실래요?(1) 아니면 아무거나");
			int select = scan.nextInt();
			if (select == 1) {
				System.out.println("입력종료");
				break;
			} else{
				// scan.nextLine();을 안하면 enter로 인해 자동으로 이름 입력 단계가 넘어간다.
				scan.nextLine();
			}
		}
		return members;		// return 하는 값은 배열의 값이다.
	}
	
	
}



public class Main {
	
//	public static Member input(){
//		Scanner scan = new Scanner(System.in);
//		System.out.println("이름을 입력하세요");
//		String name = scan.nextLine();
//		System.out.println("키를 입력하세요(M)");
//		double height = scan.nextDouble();
//		// 키를 183 이렇게 적는 사람이 있을까봐 만든 if문!!!
//		if (height > 10) {
//			height = height/100;
//		}
//		System.out.println("몸무게를 입력하세요(kg)");
//		double weight = scan.nextDouble();
//		return new Member(name, height, weight);
//	}

	
	
	public static void main(String[] args) {
		MemberManagement x = new MemberManagement();
		//x.members();
		BmiMachine m = new BmiMachine(x.members());
	}
}
