package kosta.thread;

public class DigitThread extends Thread {

	@Override
	public void run() {

		// super.run();
		for (int cnt = 0; cnt < 10; cnt++) {
			System.out.println(cnt);
//			try {
//				Thread.sleep(1000);
//			} catch (Exception e) {
//				// TODO: handle exception
//				System.out.println(e.getMessage());
//			}
		}

	}

}
