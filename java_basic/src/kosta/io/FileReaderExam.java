package kosta.io;

import java.io.FileReader;
import java.util.Arrays;

public class FileReaderExam {

	public static void main(String[] args) {
		// 파일에 있는 문자 데이터를 일기
		FileReader reader = null;// 변수의 scope 범위 때문에 try 밖에 선언을 한다.
		char arr[]= new char[500];
		char arr2[] = new char[8];// 만약에 크기가 작은 배열로 읽게 된다면 뒷 부분에 찌꺼기가 남아서 이상한 값이 출력이 될수가 있다.
		
		try {
			reader = new FileReader("poem.txt");// 객체를 호출 할때 예외 발생
			

			
			while (true) {//방법-3
				Arrays.fill(arr2, ' ');// 이걸 안쓰면 쓰레기 값이 출력이 된다.
				int data = reader.read(arr2);// 아스키 코드값을 저장
				if (data == -1)
					break;// 더이상 읽을 파일을
				System.out.print(arr2);
			}
			
			
//			reader.read(arr);// 500자씩 읽기--방법-2
//			System.out.println(arr);
			
//			while(true) {//방법-1
//				int data = reader.read();// 아스키 코드값을 저장
//				if(data==-1) break;
//				System.out.print((char)data);
//			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {// 예외가 발생하더라도 반드시 이분은 실행이 됨
			try {
				reader.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}
