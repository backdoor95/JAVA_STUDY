package kosta.bank;

public class Account {
	private String ID;
	private long Balance;

	public Account() {// default 생성자

	}

	public Account(String accountID, long accountBalance) {// 생성자 오버로딩
		super();
		this.ID = accountID;
		this.Balance = accountBalance;
	}

	public String getID() {
		return ID;
	}

	public long getBalance() {
		return Balance;
	}

	public void deposit(long amt) {
		this.Balance += amt;
	}

	public boolean withdraw(long amt) {
		if (this.Balance - amt >= 0) {
			this.Balance-=amt;
			return true;
		}else
		{
			return false;
		}
	}

}
