package kosta.net;

public class MultithreadEx02 {

	public static void main(String[] args) {
		Thread thread1 = new DigitThread();
		Thread thread2 = new DigitThread();
		Thread thread3 = new AlphabetThread();
		
		thread1.start();
		thread2.start();
		thread3.start();
	}

}
class AlphabetThread extends Thread{

	@Override
	public void run() {
		
		try {
			for(char i='A';i<='Z';i++)
				System.out.print(i);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	
}
class DigitThread extends Thread {

	@Override
	public void run() {
		
		try {
			for(int i=0;i<10;i++) {
				System.out.print(i);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}