package kosta.selfPractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

import kosta.io.CopyUtil;

public class io_CopyUtil {

	public static void copyFile(File source, File dest) {// 내 코드 1번 && 선생 코드1번

//		InputStream in = null;
//		OutputStream out = null;
		FileInputStream in = null;
		FileOutputStream out = null;

		byte arr[] = new byte[500];
		int data = 0;

		try {
			in = new FileInputStream(source);
			out = new FileOutputStream(dest);

			while ((data = in.read(arr)) != -1) {
				out.write(arr);
				Arrays.fill(arr, (byte) 0);
			}
			System.out.println("file copy success");
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
	}

//	public static void copyDirectory(File source, File dest) {// 내 코드 2번
//		//source, dest는 디렉토리임.
//		// createNewFile() - file create
//		// mkdir(); - dir create
//		File SourceDirfiles[] = source.listFiles();
//		for(int i=0;i<SourceDirfiles.length;i++) {
//			if(SourceDirfiles[i].isFile()) {
//				File file = new File(dest,SourceDirfiles[i].getName());
//				CopyUtil.copyFile(SourceDirfiles[i], file);
//			}
//		}
//	}

//	public static void copyDirectory(File source, File dest) {// 내 코드 3번
//		if (source.isDirectory()) {
//			dest.mkdirs();
//			File fileList[] = source.listFiles();
//
//			for (int i = 0; i < fileList.length; i++) {
//				File sourceFile = fileList[i];
//				if(sourceFile.isDirectory())
//					copyDirectory(sourceFile, new File(dest, sourceFile.getName()));
//				else {
//					copyFile(sourceFile, new File(dest, sourceFile.getName()));
//				}
//			}
//		}
//		return;
//	}

	public static void copyDirectory(File source, File dest) {// 2번 선생코드
		if(source.isDirectory()) {
			dest.mkdirs();
			File fileList[]= source.listFiles();
			for(int i=0;i<fileList.length;i++) {
				File sourceFile = fileList[i];
				File s_dest = new File(dest, sourceFile.getName());
				copyFile(sourceFile, s_dest);
			}
		}
	}
	
	//3번 선생 코드는 없음
	
	
}
