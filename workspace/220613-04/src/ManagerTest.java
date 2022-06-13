class Employee {
	public String name;
	String address;
	protected int salary;
	private int RRN;
	
	public Employee() {
		
	}
	
	public Employee(String name, String address, int salary, int rRN) {
		this.name = name;
		this.address = address;
		this.salary = salary;
		RRN = rRN;
	}



	public String toString() {
		return name + ", " + address + ", " + salary;
	}
}

class Manager extends Employee {
	private int bonus;
	
	public Manager (String name, String address, int salary, int rRN, int bonus) {
		super(name, address, salary, rRN);
		this.bonus = bonus;
	}
	
	public Manager() {
		super();
		this.bonus = 0;
	}
	
	public void printSalary() {
		System.out.println(name + "(" + address + "):" + (salary + bonus));
	}
	
	public void printRRN() {
		System.out.println(RRN);		// private는 subclass에서 접근 못한다.
	}
}

public class ManagerTest {
	public static void main(String[] args) {
		Manager m = new Manager();
		
		m.printRRN();
		
	}
}
