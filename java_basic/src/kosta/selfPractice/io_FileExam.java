package kosta.selfPractice;

import java.io.File;

public class io_FileExam {

	public static void show(File file) {// 파일 이름 출력
		if (file.isDirectory()) {
			System.out.println("Dir = " + file.getName());
			File files[] = file.listFiles();
			for (int i = 0; i < files.length; i++) {
				System.out.println("file = " + files[i].getName());
			}
		} else {
			System.out.println("file = " + file.getName());
		}
	}

	public static void main(String[] args) {
		// static 함수안에는  static 메서드(필드함수) 또는 static 필드 변수만 사용가능
		System.out.println(System.getProperty("user.dir"));// 현재 유저가 사용하고 있는 주소 = D:\256\workspace\java_work\java_basic 출력이됨
		show(new File("."));
		System.out.println("======================");
		show(new File("./src/kosta/io"));
		System.out.println("======================");
		show(new File("D:\\256\\workspace\\java_work\\java_basic\\src\\kosta"));
		System.out.println("======================");
		show(new File("D:\\256\\workspace\\java_work\\java_basic\\src\\kosta\\io\\Video.java"));//1	
		System.out.println("======================");
		show(new File("D:\\256\\workspace\\java_work\\java_basic\\src\\kosta\\io", "Video.java"));//2 => 1의 결과와 같다 , 2번처럼 쓴 이유는 가끔 이렇게 쓸 상황이 올수 있기 때문이다.
	}

}
