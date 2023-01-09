package kosta.oop3;

public class MyThread implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<=10;i++) {
			try {
				Thread.sleep(1000);//1초 대기
			} catch (Exception e) {
				
			}
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		//run은 언제 실행이 되는거지?
		
		MyThread my = new MyThread();
		Thread t = new Thread(my);
		t.start();
		
		for(int i=11;i<=20;i++) {
			try {
				Thread.sleep(1000);//1초 대기
			} catch (Exception e) {
				
			}
			System.out.println(i);
		}
	}

}
