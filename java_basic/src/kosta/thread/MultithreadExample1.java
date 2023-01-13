package kosta.thread;

public class MultithreadExample1 {

	public static void main(String[] args) {
		Thread thread = new DigitThread();
		SmallLetters sl = new SmallLetters();
		Thread thread2 = new Thread(sl);
		thread2.start();
		thread.start();// runnable 상태 시작
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println(ch);
//			try {
//				Thread.sleep(1000);
//			} catch (Exception e) {
//				// TODO: handle exception
//				System.out.println(e.getMessage());
//			}
		}
	}

}
