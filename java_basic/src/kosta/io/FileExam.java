package kosta.io;

import java.io.File;

public class FileExam {

	public static void show(File file) {
		if(file.isDirectory()) {// 여기서 file은 디렉토리임
			// 디렉토리는 파일로 취급한다.
			System.out.println("Dir: "+file.getName());
			File files[]= file.listFiles();
			for(int i=0;i<files.length;i++) {
				System.out.println("file: "+files[i].getName());
			}
		}else {//디렉토리가 아닐때
			System.out.println("file: "+ file.getName());
			
		}
	}
	
	public static void main(String[] args) {
		//System.out.println(System.getProperty("user.dir"));
		//show(new File("."));// "." = 현재위치한 디렉토리를 뜻함.
		//show(new File("./src/kosta/io"));
		//show(new File("D:\\256\\workspace\\java_work\\java_basic\\src\\kosta"));
		show(new File("D:\\256\\workspace\\java_work\\java_basic\\src\\kosta\\io\\Video.java"));//1
		show(new File("D:\\256\\workspace\\java_work\\java_basic\\src\\kosta\\io", "Video.java"));//2 => 1의 결과와 같다 , 2번처럼 쓴 이유는 가끔 이렇게 쓸 상황이 올수 있기 때문이다.
	}

}
