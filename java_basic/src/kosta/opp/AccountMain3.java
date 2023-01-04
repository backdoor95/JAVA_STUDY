package kosta.opp;

public class AccountMain3 {

	public static void main(String[] args) {
//		CheckingAccount ch = new CheckingAccount("111-111", "홍길동", 50000, "111-111");
//		ch.show();
		
		MinusAccount ma = new MinusAccount("111-111", "박길동", 1000, 3000);
		Object Ob1 = ma;
		Account a1= ma;
		
		try {
			ma.withdraw(2000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ma.show();
	}

}
