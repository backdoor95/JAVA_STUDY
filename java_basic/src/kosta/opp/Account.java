package kosta.opp; // object oriented programming 객체지향 프로그래밍

public class Account {
	// 계좌 객체를 생성하기 위한 목적
	// 데이터의 무결성
	// 상태(특성):계좌번호, 계좌주, 잔액 => 멤버변수(=필드)
	// 행동(기능):입금, 출금 => 멤버메서드
	private String accountNumber;
	private String ownerName;
	private int balance;// 잔액

	public Account() {// 기본 생성자
		System.out.println("생성자 호출");
	}

	

	public Account(String accountNumber, String ownerName, int balance) {
		super();
		this.accountNumber = accountNumber;
		this.ownerName = ownerName;
		this.balance = balance;
	}



	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void deposit(int amount) {// 입금
		balance += amount;
	}

	public int withdraw(int amount) throws Exception {// 출금

		if (balance < amount) {
			throw new Exception("잔액 부족!");
		}
		balance -= amount;

		return amount;
	}

	public void show() {
		System.out.println("계좌번호: " + accountNumber);
		System.out.println("계좌주: " + ownerName);
		System.out.println("잔액: " + balance);
		System.out.println();
	}
}
