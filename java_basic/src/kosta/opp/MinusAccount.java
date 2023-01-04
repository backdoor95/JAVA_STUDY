package kosta.opp;

public class MinusAccount extends Account {
	
	private int creditLine;// 마이너스
	
	public MinusAccount() {}

	public MinusAccount(String accountNumber, String ownerName, int balance, int creditLine) {
		super(accountNumber, ownerName, balance);
		this.creditLine = creditLine;
	}

	@Override// annotation 이건 system 이 override를 했다는 것을 인식하기 위한 annotation
	public int withdraw(int amount) throws Exception {
		if(getBalance()+creditLine<amount)
			throw new Exception("잔액부족");
		
		setBalance(getBalance()-amount);
		
		return amount;
	}
	
}
