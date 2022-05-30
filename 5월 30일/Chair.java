// 의자 클래스
// 제조사
// 생산일자
// 가격
// 모델명

// 초기화 할 수 있는 생성자

// main -> 작성한 생성자를 통해 원하는 필드값으로 초기화 해보세요,
 class Chair {
	String madein;
	int year;
	int price;
	String model;
	
	public Chair(String m, int y,int p, String mo) { // 기본생성자
		madein = m;
		year = y;
		price = p;
		model = mo;
	}

	void print() {
		System.out.printf("%s, %d, %d, %s", madein, year, price, model);
	}

	public static void main(String[] args) {
		Chair c = new Chair("삼성", 2022, 10000, "cjh");
		c.print();
	}
}