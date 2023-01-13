package kosta.thread2;

public class SharedArea {
	Account account1;
	Account account2;
	synchronized void transfer(int amount) {
		account1.withdraw(1000000);
		System.out.print("이몽룡 계좌 : 100만원 인출,");
		account2.deposit(1000000);
		System.out.println("성춘향 계좌 : 100만원 입금");
	}
	synchronized int getTotal() {
		return (account1.balance+account2.balance);
	}
}
