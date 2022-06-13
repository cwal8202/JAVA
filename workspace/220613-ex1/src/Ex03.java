class Phone {
	String madein;
	int price;
	String type;
	
	public Phone() {
	}
	
	public Phone(String madein, int price, String type) {
		this.madein = madein;
		this.price = price;
		this.type = type;
	}	
	
	public String toString() {
		return "madein" + madein + "\nprice" + price + "\ntype" + type;
	}
}

class SmartPhone extends Phone {
	String osType;
	int osVersion;
	int memorySize;
	boolean camera;
	boolean bluetooth;
	public SmartPhone(String madein, int price, String type, String osType, int osVersion, int memorySize,
			boolean camera, boolean bluetooth) {
		super(madein, price, type);
		this.osType = osType;
		this.osVersion = osVersion;
		this.memorySize = memorySize;
		this.camera = camera;
		this.bluetooth = bluetooth;
	}	
	public SmartPhone() {
	}
	
	public String toString() {
		return super.toString() + "\nosType" + osType +
		"\nosVersion" + osVersion +
		"\nmemorySize" + memorySize +
		"\ncamera" + camera +
		"\nbluetooth" + bluetooth;
	}
	
	public void printAll() {
		System.out.println(toString());
	}
	
}

public class Ex03 {
	public static void main(String[] args) {
		SmartPhone g = new SmartPhone();
		g.printAll();
	}
}
