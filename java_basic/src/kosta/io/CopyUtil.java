package kosta.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

public class CopyUtil {

	public static void copyDirectory(File source, File dest) throws Exception {// 내코드-- 3번 미션
		if (source.isDirectory()) {
			dest.mkdirs();

			File fileList[] = source.listFiles();
			for (int i = 0; i < fileList.length; i++) {
				// sourceFile----------과제\\forExam\\forexam1.java
				// dest ------------과제2\\\\forExam\\forexam1.java
				File sourceFile = fileList[i];
				if (sourceFile.isDirectory())
					copyDirectory(sourceFile, new File(dest,sourceFile.getName()));
				else {
					File s_dest = new File(dest, sourceFile.getName());
					copyFile(sourceFile, s_dest);
				}
			}

		}
		return;
	}

//	public static void copyDirectory(File source, File dest) {// 내 코드 - 2번 미션
//		
//		// source, dest는 디렉토리임.
//		// createNewFile() - file create
//		// mkdir(); - dir create
//		File SourceDirfiles[] = source.listFiles();
//		for (int i = 0; i < SourceDirfiles.length; i++) {
//			//System.out.println("dest.getName()=" + dest.getName());
//			//System.out.println("SourceDirfiles[i].getName()=" + SourceDirfiles[i].getName());
//			if (SourceDirfiles[i].isFile()) {
//				File file = new File(dest, SourceDirfiles[i].getName());// 파일 객체 생성할때 파라미터가 2개 들어감. - 약점
//				System.out.println("file.getName()= " + file.getName());
//				CopyUtil.copyFile(SourceDirfiles[i], file);
//			}
//		}
//
//	}

//	public static void copyDirectory(File source, File dest)throws Exception{// 선생코드-- 2번 미션
//		if(source.isDirectory()) {
//			dest.mkdirs();
//			
//			File fileList[]= source.listFiles();
//			for(int i=0;i<fileList.length;i++) {
//				//sourceFile----------과제\\forExam\\forexam1.java
//				//dest ------------과제2\\\\forExam\\forexam1.java
//				File sourceFile = fileList[i];
//				File s_dest = new File(dest, sourceFile.getName());
//				copyFile(sourceFile, s_dest);
//			}
//			
//		}
//	}

	public static void copyFile(File source, File dest) {// 선생코드 -1번 미션

		FileInputStream in = null;
		FileOutputStream out = null;
		byte arr[] = new byte[500];// 약점
		int data = 0;

		try {
			in = new FileInputStream(source);
			out = new FileOutputStream(dest);

			while ((data = in.read(arr)) != -1) {// read 안에 arr를 써야함.약점
				out.write(arr);
				Arrays.fill(arr, (byte) 0);
			}
			System.out.println("파일 복사 성공");

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				if (out != null) {
					out.close();
				}
				if (in != null) {
					in.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}

//		File fileSource = new File(Source);// 내 코드 -1번 미션
//		File fileDest = new File(Dest);
//		
//		
//		
//		
//		InputStream is = null;
//		OutputStream os = null;
//		
//		try {
//			is = new FileInputStream(Source);
//			os = new FileOutputStream(Dest);
//			
//			
//			
//			
//			
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}finally {
//			try {
//				os.close();
//				is.close();
//				
//			} catch (Exception e2) {
//				// TODO: handle exception
//				e2.printStackTrace();
//			}
//		}
	}
}
