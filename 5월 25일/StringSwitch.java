public class StringSwitch {
	public static void main(String[] args) {
		String month = "february";
		
		int monthNumber;
		switch (month) {
			case "january":
				monthNumber = 1;
				break;
			case "february": // switch 안의 지역변수를 바깥에서 호출하면 적용이 안된다!
				System.out.println("asdf");
				int b = 10;
				monthNumber = 2;
				break;
			case "march":
				monthNumber = 3;
				break;
			default:
				monthNumber = 0;
				break;
			}
			System.out.println(monthNumber);
			// Sysetm.out.print(b);
	}
}