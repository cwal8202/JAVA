class Food {
	int kcal;
	int price;
	int weight;
	
	public Food(int kcal, int price, int weight) {
		kcal = kcal;
		this.price = price;
		this.weight = weight;
	}
	
	public int getKcal() {
		return kcal;
	}
	public int getPrice() {
		return price;
	}
	public int getWeight() {
		return weight;
	}
	public void setKcal(int kcal) {
		kcal = kcal;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public String toString() {
		return "칼로리 : " + kcal + "\n가격 : " + price + "\n중량 : " + weight;
	}
}

class Melon extends Food {
	String where;

	public Melon(int kcal, int price, int weight, String where) {
		super(kcal, price, weight);
		this.where = where;
	}

	public String getWhere() {
		return where;
	}

	public void setWhere(String where) {
		this.where = where;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\n어디서 : " + where;
	}
	
	public void printAll() {
		System.out.println(toString());
	}
}





public class Ex02 {
	public static void main(String[] args) {
		Melon m = new Melon(100, 3000, 50, "부산");
		m.printAll();
	}
}
