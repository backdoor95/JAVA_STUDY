package kosta.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;

public class BufferExam {

	public static void main(String[] args) {
		// Scanner => 키보드 입력
		// 보조 스트림 연결
		// System.in => InputStream => 바이트값을 문자로 변환해 줄수 있는 스트림 => InputStreamReader => BufferedReader// 이 부분 졸았음.
//		InputStream in = System.in;
//		InputStreamReader isr = new InputStreamReader(in);
//		BufferedReader br = new BufferedReader(isr);
		
		
		
		
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try {
			br =new BufferedReader(new InputStreamReader(System.in));
			bw = new BufferedWriter(new FileWriter("output.txt"));
			
			System.out.println("입력: ");
			String str ="";
			while((str=br.readLine())!=null) {// ctrl + z 눌르면 나가진다.
				str+="\n";
				bw.write(str);
			}
			System.out.println("쓰기 완료");
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				bw.close();
				br.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}

	}

}
