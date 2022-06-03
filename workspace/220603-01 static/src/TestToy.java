class Toy {
	private String model;
	private int price;
	
	public Toy(String model, int price) {
		this.model = model;
		this.price = price;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}



class ToyFactory {
	private String location;
	// 상태에 따라서 동작을 다르게 하기 위해서 객체를 만든다.
	// 그런데 기능만 사용하겠다 하면 static을 만들어서 사용하면 된다.
	public Toy makeToy() {
		return new Toy("처키인형", 10000);
	}
}

public class TestToy {
	public static void main(String[] args) {
		Toy toy1 = new Toy("새 장난감", 5000);
		
		ToyFactory fac = new ToyFactory();
		Toy chucky = fac.makeToy();
	}
}
