package kosta.api;

import java.util.Scanner;

public class RegularExam1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열 입력: ");
		String str = sc.nextLine();
		
		//abc 문자열이 포함여부를 체크
//		if(str.matches(".*abc.*")) {//[abc]-->선생님 방식
//			System.out.println("매칭");
//		}else {
//			System.out.println("비매칭");
//		}

		if(str.matches(".*[abc].*")) {//[abc]---> 내방식 이건 안된다. 왜 안되는지 고민할것
			System.out.println("매칭");
		}else {
			System.out.println("비매칭");
		}
		// 숫자 3자리 유무판단 =>
//		if(str.matches("[\\d]{3}")) {
//			System.out.println("매칭");
//		}else {
//			System.out.println("비매칭");
//		}
		
		//알파벳, 숫자만 5자리 이상
//		if (str.matches("[\\w]{5,}")) {
//			System.out.println("매칭");
//		} else {
//			System.out.println("비매칭");
//		}
		
		//한글 3~5자리
//		if (str.matches("^[가-힣]*${3,5}")) {// ^[가-힣]*$
//			System.out.println("매칭");
//		} else {
//			System.out.println("비매칭");
//		}
		
	}

}
