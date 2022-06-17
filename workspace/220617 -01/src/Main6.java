// 은행 계좌
// 필드 : 잔고 (int)
// 메소드 : 입금 (int) : void > 출금액이 보유잔고 이상일 때
					// 예외를 발생시켜서 throws...
//		    출금 (int) : void
//		getter() : int

class MoneyException extends RuntimeException{
	public MoneyException(String message) {
		super(message);
	}
}



class Bank {
	private int money;
	void input(int input) {
		money = money + input;
	}
	// 출금할때만 예외가 생기게 함. 마치 boolean에서 맞으면 true 틀리면 false값을 return하는것 처럼.
	void print(int input) throws MoneyException {
		if (money >= input) {
			money = money - input;
		} else {
			throw new MoneyException((input - getMoney()) + "만큼 잔고 부족합니다.");
		}
		
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	
	
}


public class Main6 {
	public static void main(String[] args) {
		
			Bank busan = new Bank();
			busan.setMoney(10000);
			busan.input(20000);
			System.out.println(busan.getMoney());
			try {
				busan.print(40000);
				System.out.println(busan.getMoney());
			} catch(MoneyException e) {
				System.out.println(e.getMessage());		// 클래스의 getter를 한 것이다.
			}
		// 은행 걔좌 객체 생성
		// 입금 / 출금, 게어에ㅓㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇ
		// 출금 // 예외 처
		
	}
}
