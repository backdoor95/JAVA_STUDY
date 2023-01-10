package kosta.api;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class CalendarExam2 {

	public static void main(String[] args) {
		String pattern = "yyyy/MM/dd";
		DateFormat df = new SimpleDateFormat(pattern);
		Scanner sc = new Scanner(System.in);
		System.out.println("날짜를 " + pattern + "형태로 입력하세요.(ex: 2023/01/01)");

		Date inDate = null;
		while (sc.hasNextLine()) {
			try {
				inDate = df.parse(sc.nextLine());
				break;
			} catch (Exception e) {
				System.out.println("다시 입력하세요");
			}
			
		}

		Calendar cal = Calendar.getInstance();
		cal.setTime(inDate);// 입사일로 이동
		Calendar today = Calendar.getInstance();// 오늘 날짜

		long day = (today.getTimeInMillis() - cal.getTimeInMillis()) / (24 * 60 * 60 * 1000);
		int m = (int) (day / 30);
		int year = m / 12;
		int month = m % 12;
		System.out.println("총근무 기간: "+year+"년"+month+"개월 근무");

	}

}
