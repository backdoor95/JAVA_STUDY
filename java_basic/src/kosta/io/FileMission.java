package kosta.io;

import java.io.File;

public class FileMission {

	public static void main(String[] args) {
		// 1. 바이트 스트림으로 이미지를 복사해보자
//		String source = "D:\\256\\ZooPearl.png";
//		String dest = "D:\\upload\\ZooPearl.png";
//
//		CopyUtil.copy(new File(source), new File(dest));
//		

		// 2. 디렉토리 전체 복사를 구현하자.
		// 재귀함수를 호출하는 형식으로 폴더안에 폴더가 있음 - 보류
		//
		// 쉬운거 다시
		//
		//

		// 내 코드
//		File Sourcedir = new File("D:\\220818backup\\2021\\2021-1\\bu");
//		File Destdir = new File("D:\\newBackUp\\bu");
//		// Destdir.mkdirs();
//		if (Destdir.mkdirs()) {
//
//			System.out.println("디렉토리 생성 성공");
//			try {
//				CopyUtil.copyDirectory(Sourcedir, Destdir);
//			} catch (Exception e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//
//		} else {
//
//			System.out.println("디렉토리 생성 실패");
//
//		}
		
		// 선생님 코드
//		String source = "djsdl";
//		String dest = "iiil";
//		try {
//			CopyUtil.copyDirectory(new File(source), new File(dest));
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		//3. 디렉토리 안에 디렉토리가 있을때
		
		File Sourcedir = new File("D:\\2022-2\\algorithm22_2");
		File Destdir = new File("D:\\newBackUp");
		// Destdir.mkdirs();
		if (Destdir.mkdirs()) {

			System.out.println("디렉토리 생성 성공");
			try {
				CopyUtil.copyDirectory(Sourcedir, Destdir);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} else {

			System.out.println("디렉토리 생성 실패");

		}
		
		
	}

}
