package restaurant;

public class Restaurant {
	private int resId;
	private String name;
	private String phoneNumber;
	private String address;
	
	public Restaurant(String name, String phoneNumber, String address) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}
	public Restaurant(int resId, String name, String phoneNumber, String address) {
		super();
		this.resId = resId;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}
	public int getResId() {
		return resId;
	}
	public void setResId(int resId) {
		this.resId = resId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "restaurant [resId=" + resId + ", name=" + name + ", phoneNumber=" + phoneNumber + ", address=" + address
				+ "]";
	}
}
