package ExceptionCustom;

public class Account {

	private long balance; // 인스턴스 변수.
	
	// 생성자
	public Account() {
		
	}
	// 입금하기
	public void deposit(int money) {
		
	}
	//출금하기
	public void withdraw(int money) {
		if(this.balance < money) {
			throw new Sujung_giyomi_Exception("잔액이 부족해요");
		}
		this.balance -= money;
	}
}
