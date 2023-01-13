package kosta.thread2;

public class PrintThread extends Thread {
	SharedArea sharedArea;

	public PrintThread(SharedArea area) {
		super();
		this.sharedArea = area;
	}

	@Override
	public void run() {

		for (int cnt = 0; cnt < 3; cnt++) {
			//int sum = sharedArea.account1.balance + sharedArea.account2.balance;// 이렇게 하면 동기화가 안된다.
			int sum = sharedArea.getTotal();// 이렇게 해야 동기화가 된다.
			System.out.println("계좌 잔액 합계 : " + sum);
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO: handle exception
				System.out.println(e.getMessage());
			}
		}
	}

}
