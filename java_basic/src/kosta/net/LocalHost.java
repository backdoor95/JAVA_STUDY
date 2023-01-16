package kosta.net;

import java.net.InetAddress;
import java.util.Scanner;

public class LocalHost {

	public static void main(String[] args) {
		try {
//			InetAddress inetAddress= InetAddress.getLocalHost();
//			System.out.println(inetAddress);
//			System.out.println(inetAddress.getHostName());
//			System.out.println(inetAddress.getHostAddress());
////			System.out.println(inetAddress.getAddress());
//			
//			inetAddress = InetAddress.getByName("www.naver.com");
//			System.out.println(inetAddress);
//			
//			InetAddress sl[]= InetAddress.getAllByName("www.naver.com");
//			// 살짝 누워있는 것은 클래스의 메서들 라는 듯이다.
//			for(InetAddress s: sl) {
//				System.out.println(s);
//			}

			// 실습 NSLookup 구현
			while (true) {
				Scanner sc = new Scanner(System.in);
				System.out.print(">");
				String address = sc.nextLine();
				if (address.equals("exit"))
					break;
				InetAddress sl[] = InetAddress.getAllByName(address);// try catch 문으로 익셉션을 고려해야함.
				// 살짝 누워있는 것은 클래스의 메서들 라는 듯이다.
				for (InetAddress s : sl) {
					System.out.println(s);
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
