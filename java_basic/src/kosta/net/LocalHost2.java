package kosta.net;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class LocalHost2 {

  public static void main(String[] args) {
    try {
      InetAddress inetAddress = InetAddress.getByName("daum.net");
      System.out.println(inetAddress);
      
      InetAddress inetAddress1 = InetAddress.getByName("kakao.com");
      System.out.println(inetAddress1);
    } catch (UnknownHostException e) {
      e.printStackTrace();
    }
  }

}
