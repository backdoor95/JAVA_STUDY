package kosta.selfPractice;

import java.io.FileReader;
import java.io.FileWriter;

public class io_CopyExam {

	public static void main(String[] args) {
		// poem2.txt => poem3.txt: 복사해 보자.

		// 내 전략
		// 1. reader로 파일을 읽어온다
		// 2. 그 다음에 writer로 poem3에 복사를 한다.

		FileReader reader = null;
		FileWriter writer = null;

		try {
			reader = new FileReader("poem2.txt");
			writer = new FileWriter("poem3.txt");
			System.out.println("3");
			while (true) {
				int data = reader.read();
				if (data == -1)
					break;
				writer.write((char) data + "");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				reader.close();
				writer.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}

	}

}
