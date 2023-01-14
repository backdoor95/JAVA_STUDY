package kosta.selfPractice;

import java.io.FileReader;
import java.util.Arrays;

public class io_FileReaderExam {

	public static void main(String[] args) {

		FileReader reader = null;
		char arr[] = new char[500];
		char arr2[] = new char[8];

		try {
			reader = new FileReader("poem.txt");

			while (true) {// 방법1
				Arrays.fill(arr2, ' ');
				int data = reader.read(arr2);// 용량이 작은 배열을 사용할때
				if (data == -1) {
					break;
				}
				System.out.print(arr2);
			}

			reader.read(arr);// 방법2 = 500자씩 읽기 배열에 저장
			System.out.println(arr);

			while (true) {// 방법3 = 한글자씩 출력
				int data = reader.read();
				if (data == -1)
					break;
				System.out.println((char) data);
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}

	}

}
