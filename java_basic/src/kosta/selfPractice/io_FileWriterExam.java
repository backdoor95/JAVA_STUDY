package kosta.selfPractice;

import java.io.FileWriter;
import java.util.Scanner;

public class io_FileWriterExam {

	public static void main(String[] args) {
		// 키보드로 부터 문자열을 입력받아 파일쓰기를 구현하자
		// 'q'를 입력하면 종료 => q를 입력하기 전까지의 문자열을 파일쓰기를 하자.
		// 입력 > 안녕
		// 입력 > 반갑다
		// 입력> q
		// FileWriter : write(문자열);
		// 파일명 : poem2.txt: 실존 x => 반드시 close() 를 해야 파일이 생성이 된다.
		// 변경된 파일을 확인 하려면 File -> refresh
		// 나는 먼저 파일을 만들고 코딩을 하였음
		Scanner sc = new Scanner(System.in);
		FileWriter writer = null;
		String str = null;

		// 내 코드
		try {
			writer = new FileWriter("poem2.txt");
			while (true) {
				System.out.print("입력> ");
				str = sc.nextLine();
				if (str.equals("q"))
					break;
				writer.write(str + "\n");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				writer.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}

		// 선생 코드
		System.out.print("입력  = ");
		String poem = "";
		while (!(str = sc.nextLine()).equals("q")) {
			System.out.print("입력 = ");
			poem += str;
			poem += "\n";
		}
		
		try {
			writer = new FileWriter("poem2.txt");
			writer.write(poem);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				writer.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}

	}

}
