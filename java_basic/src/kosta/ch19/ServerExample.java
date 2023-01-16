package kosta.ch19;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;


public class ServerExample {

	private static ServerSocket serverSocket = null;

	public static void main(String[] args) {
		System.out.println("--------------------------------------");
		System.out.println("서버를 종료하려면 q또는 Q를 입력하고 Enter를 입력 하세요");
		System.out.println("--------------------------------------");

		startServer();
		Scanner sc = new Scanner(System.in);
		while (true) {
			String key = sc.nextLine();
			if (key.toLowerCase().equals("q")) {
				break;
			}
		}

		sc.close();

		stopServer();
	}

	public static void startServer() {
		Thread thread = new Thread() {

			@Override
			public void run() {
				
				try {
					//ServerSocket 생성 및 port 바인딩
					serverSocket = new ServerSocket(50001);
					System.out.println("[서버] 시작됨");
					while(true) {
						System.out.println("\n서버 연결 요청을 기다림\n");
						// 연결 수락
						Socket socket = serverSocket.accept();
						
						// 연결된 클라이언트 정보
						InetSocketAddress isa = (InetSocketAddress)socket.getRemoteSocketAddress();
						System.out.println("[서버] "+isa.getHostName()+"의 연결을 끊음");
						
					}
				} catch (IOException e) {
					// TODO: handle exception
					System.out.println("[서버] "+e.getMessage());
				
				}
			}
			
		};
		thread.start();
	}

	public static void stopServer() {
		try {
			serverSocket.close();
			System.out.println("서버 종룔됨");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
