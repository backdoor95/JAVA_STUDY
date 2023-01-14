package kosta.selfPractice;

import java.io.File;

public class io_FileMission {

	public static void main(String[] args) {
		//1.바이트 스트림으로 이미지를 복사해보자
		String source = "D:\\256\\ZooPearl.png";
		String dest = "D:\\upload\\ZooPearl.png";
		
		io_CopyUtil.copyFile(new File(source), new File(dest));
		
		
		
	}

}
