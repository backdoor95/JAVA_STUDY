package kosta.opp;

public class CheckingAccount extends Account {
	private String cardNo;

	public CheckingAccount() {
	}

	public CheckingAccount(String accountNumber, String ownerName, int balance, String cardNo) {
		super(accountNumber, ownerName, balance); // String, String, int  parameter를 가지는 부모생성자를 호출함.
		this.cardNo = cardNo;
	}

	public int pay(String cardNo, int amount) throws Exception {
		if (!cardNo.equals(this.cardNo) || getBalance() < amount) {
			throw new Exception("결재불능");
		}
		return withdraw(amount);
	}

}
