import java.util.Scanner;

// 컵라면
// 제조사
// 이름
// 가격

// 생성자, 게터세터

// Override
// toString
// equals - 제조사와 이름이 같으면

class Ramen {
	String madein;
	String name;
	int price;
	
	public Ramen(String madein, String name, int price) {
		this.madein = madein;
		this.name = name;
		this.price = price;
	}
	
	public Ramen() {
		
	}

	public String getMadein() {
		return madein;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public void setMadein(String madein) {
		this.madein = madein;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(int price) {
		this.price = price;
	}	
	
	@Override
	public String toString() {
		return "Ramen [madein=" + madein + ", name=" + name + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((madein == null) ? 0 : madein.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Ramen))
			return false;
		Ramen other = (Ramen) obj;
		if (madein == null) {
			if (other.madein != null)
				return false;
		} else if (!madein.equals(other.madein))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	

}


public class Main2 {
	public static void input(Ramen jang){
		System.out.println("제조사 이름 가격 넣으세요");
		Scanner scan = new Scanner(System.in);
		String madein = scan.nextLine();
		String name = scan.nextLine();
		int price = scan.nextInt();
		jang = new Ramen(madein, name, price);
	}
	
	public static Ramen input1(){
		Scanner scan = new Scanner(System.in);
		System.out.println("제조사 이름 가격 넣으세요");
		String madein = scan.nextLine();
		String name = scan.nextLine();
		int price = scan.nextInt();
		return new Ramen(madein, name, price);
	}
	
	
	public static void printEqual(boolean equal) {
		if (equal) {
			System.out.println("같습니다");
		} else {
			System.out.println("다릅니다");
		}
	}
	public static void main(String[] args) {
		Ramen jin = new Ramen("오뚜기", "진라면(매운맛)", 950);
	
		Ramen notjin = new Ramen("오뚜기", "진라면(순한맛)", 950);
		
//		Ramen jang = new Ramen();
//		input(jang);
		
		//input1();
		
		String a = "오뚜기";
		System.out.println(jin.toString());
		
		printEqual((jin.equals(input1())));
//		printEqual((jin.equals(jang)));
		
	}

}
