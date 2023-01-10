package kosta.api;

import java.util.Arrays;

public class StringExam {

	public static void main(String[] args) {

		// 1. String 클래스 생성방법
		String str = "ABC";// 원래는 new 로 해서 객체를 생성해야하나 String은 특권을 부여받음.
		String str2 = "ABC";
		String str3 = new String("ABC");// 이렇게 해도됨. 차이점이 있다. -> 항상 객체를 새로 생성함.

		if (str == str2)// == 은 주소를 비교함. ABC 의 주소는 같다. 따라서 결과는 '같다' 라고 뜸
		{
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}

		if (str == str3)// == 은 주소를 비교함. ---> 결과는 '다르다'
		{
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}

		// 2. String 객체의 특징 (불변성) => 그러나 이건 변할수 있다. ->StringBuffer, StringBuilder => 가변성
		str.concat("DEF");
		System.out.println(str);// ABC
		System.out.println(str.concat("DEF"));// ABCDEF
		String str4 = str.concat("DEF");// str뒤에 문자열을 붙여서 리턴해준다.
		System.out.println(str4);// ABCDEF

		// 동적쿼리문( + )연산자 ->변경가능=> 사용자에 따라서 쿼리문이 동적으로 변경이된다.
		String sql = "select * from board";
		int num1 = 10;
		if (num1 == 10)
			sql += "where num = 10";// '+' 연산자를 통해서 변경이 가능하다.
		System.out.println(sql);

//		StringBuffer sb = new StringBuffer("select* from board");
//		int num=10;
//		if(num==10)
//		{
//			sb.append(" where num =10");
//		}
//		System.out.println(sb);// StringBuffer 는 append로 하면 늘려서 변경이 가능하다.

		// 해당 문자열의 위치를 파악 => indexOf("문자열")=> 해당 문자열 인덱스, 없으면 -1
		System.out.println(sql.indexOf("*"));

		// 문자열의 길이
		System.out.println(sql.length());

		// charAt(인덱스):char => 인덱스에 해당하는 문자 1개 리턴
		for (int i = 0; i < sql.length(); i++) {
			System.out.print(sql.charAt(i));
		}
		System.out.println();
		// 문자열 부분 추출 : subString(5)// 6번째 문자열부터 마지막 까지
		// subString(5,10) // => 6번째 11번쨰 전까지
		String sql2 = "ABC DEF";
		System.out.println(sql2.substring(0, 2));// 인덱스 0, 1 출력
		System.out.println(sql2.substring(3));// 인덱스 3부터 마지막까지 출력

		// 퀴즈 > sql변수에서 "board" 문자열만 추출해서 출력을 해보자 (indexOf())
		System.out.println(sql.substring(sql.indexOf("board"), sql.indexOf("board") + 5));

		String fileName = "kosta.jpg";
		String head = "";
		String pattern = "";
		head += fileName.substring(0, fileName.indexOf("."));
		pattern += fileName.substring(fileName.indexOf(".") + 1);
		System.out.println(head + ":" + pattern);

		if (fileName.endsWith("jpg")) {// startsWith("문자열")
			System.out.println("이미지 파일");
		}
		///////////////////////////////////////////////////////////
		String id = "kosta";
		String m_id = "kosta";
		if (id.equals(m_id)) {// 소 대문자 구별
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		///////////////////////////////////////////////////
		String id2 = "kosta";
		String m_id2 = "Kosta";
		if (id2.equalsIgnoreCase(m_id2)) {// 소 대문자 구별안함
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		///////////////////////////////////////////////
		// trim -> 앞뒤에 있는 공백문자를 제거. 단, 중간에 있는 공백은 빼지 않는다.
		String id3 = "kosta ";
		String m_id3 = " Kosta";
		if (id3.trim().equalsIgnoreCase(m_id3)) {// 소 대문자 구별안함
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		System.out.println(id3);
		System.out.println(m_id3);
		///////////////////////////////////////////////
		// 문자열 -> String 배열 변환
		String fruits = "사과 /포도/수박/배";
		String arr[] = fruits.split("/");
		System.out.println(Arrays.toString(arr));

		///////////////////////////////////////////////
		int n = 10;
		String s = n + ""; // 이때 정수가 문자열로 변환이됨.
		System.out.println(s);

		// getBytes(); // 바이트 배열로 표현 ---> DB에 저장할때 한글로 저장하게된다면 원본이 훼손되는 경우가 있기 때문에,
		// 그때getBytes()로 사용한다.

		String inputStr = "Computercooler";
		String findStr = "c";
		String tmpinputStr = inputStr.toLowerCase();
		String tmpfindStr = findStr.toLowerCase();
		int count = 0;
		
		for (int i = 0; i < inputStr.length(); i++) {
			if (tmpinputStr.charAt(i) == tmpfindStr.charAt(0))
				count++;
		}
		System.out.println(count);
	}

}
