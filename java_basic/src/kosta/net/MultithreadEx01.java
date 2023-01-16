package kosta.net;

public class MultithreadEx01 {

  public static void main(String[] args) {
    Thread thread = new DigitThread();
    thread.start();
    for(char ch= 'A'; ch<='Z' ;ch++) {
      System.out.print(ch);
    }
  }
}

//class DigitThread extends Thread{
//  public void run(){
//    try{
//      Thread.sleep(1000);
//      for(int i=1; i<=10 ;i++) {
//        System.out.print(i);
//      }
//    }catch(Exception e){
//        e.printStackTrace();
//    }
//  }
//}
