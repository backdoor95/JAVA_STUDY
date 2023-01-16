package kosta.ch19;

import java.net.InetAddress;

public class InetAddressExample {

	public static void main(String[] args) {
		try {
			InetAddress local = InetAddress.getLocalHost();
			System.out.println("my computer's ip address = "+ local.getHostAddress());
			InetAddress[] iaArr = InetAddress.getAllByName("www.naver.com");
			
			for(InetAddress remote: iaArr) {
				System.out.println("www.naver.com ip address = "+ remote.getHostAddress());
			}
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
