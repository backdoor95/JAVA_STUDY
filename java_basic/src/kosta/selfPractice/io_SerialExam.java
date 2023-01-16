package kosta.selfPractice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class io_SerialExam {
	// 객체 직렬화 => 파일 밖으로 객체를 뽑아냄
	private Member m;
	public void write() {
		Video v= new Video("1","a", "B");
		m = new Member("박깅동", 30, v);
		
		ObjectOutputStream oos = null;
		
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
				e2.printStackTrace();
			}
		}
	}
	
	//객체 역직렬화 -> 파일에서 안으로 객체를 넣음
	
	public void read() {
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(new FileInputStream("object.ser"));
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				ois.close();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		io_SerialExam se = new io_SerialExam();
		
		se.write();
		se.m=null;
		se.read();
		System.out.println(se.m);
	}

}
