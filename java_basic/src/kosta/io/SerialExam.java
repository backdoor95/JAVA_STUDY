package kosta.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerialExam {
	private Member m;
	//객체 직렬화 -> 파일 밖으로 객체를 뽑아냄
	public void write() {
		//m = new Member("홍길동", 20);
		Video v = new Video("1","a","B");
		m = new Member("박길동", 30, v);
		
		ObjectOutputStream oos= null;
		
		try {
			oos = new ObjectOutputStream(new FileOutputStream("object.ser"));
			oos.writeObject(m);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				oos.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		
		
	}
	
	
	//객체 역직렬화 -> 파일에서 안으로 객체를 넣음.
	public void read() {
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(new FileInputStream("object.ser"));
			m =(Member)ois.readObject();// castring 을 꼭 해줘야한다.
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {// 예외가 발생하더라도 처리되는 코드를 넣음.
			try {
				ois.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
			
		}
	}

	public static void main(String[] args) {
		
		SerialExam se = new SerialExam();
		
		se.write();// 객체 직렬화
		se.m=null;
		se.read();// 객체 역직렬화
		
		System.out.println(se.m);
		
	}

}
