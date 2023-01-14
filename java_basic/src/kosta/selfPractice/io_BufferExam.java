package kosta.selfPractice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class io_BufferExam {
	
	public static void main(String[] args) {
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try {
			
			br = new BufferedReader(new InputStreamReader(System.in));
			bw = new BufferedWriter(new FileWriter("output.txt"));
			
			System.out.println("입력: ");
			String str= "";
			while((str = br.readLine())!=null) {
				str+="\n";
				bw.write(str);
			}
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
