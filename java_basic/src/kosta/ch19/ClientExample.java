package kosta.ch19;

import java.net.Socket;

public class ClientExample {

	public static void main(String[] args) {

		try {
			Socket socket = new Socket("localhost", 50001);// 예외가 발생함. localhost = 
			System.out.println("[클라이언트]연결 성공");
			socket.close();
			System.out.println("[클라이언트] 연결 끊음");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}
	}

}
