package kosta.api;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarExam {

	public static void main(String[] args) {
		GregorianCalendar gc1 = new GregorianCalendar();
		Calendar gc2 = Calendar.getInstance();
		System.out.println(gc1);
		System.out.println(gc2);

		String now = gc1.get(Calendar.YEAR) + "년  " + (gc1.get(Calendar.MONTH) + 1) + "월 " + gc1.get(Calendar.DATE)
				+ "일 " + gc1.get(Calendar.HOUR) + "시 " + gc1.get(Calendar.MINUTE) + "분";
		System.out.println("현재시간: " + now);

		gc1.add(Calendar.DATE, 100);

		String future = gc1.get(Calendar.YEAR) + "년  " + (gc1.get(Calendar.MONTH) + 1) + "월 " + gc1.get(Calendar.DATE)
				+ "일 " + gc1.get(Calendar.HOUR) + "시 " + gc1.get(Calendar.MINUTE) + "분";
		System.out.println("현재시간: " + now);

		System.out.println("100일 후: " + future);

		gc1.set(2022, 11, 11);// 2022/12/11 MONTH는 0달 부터 시작

		gc1.add(Calendar.DATE, 100);

		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd hh:mm");

		String str = dateFormat.format(gc1.getTime());// Calendar => Date

		System.out.println(str);

		char week[] = { '일', '월', '화', '수', '목', '금', '토' };

		for (int i = 2023; i <= 2033; i++) {
			gc1.set(i, 0, 1);// 1월 1일
			char c = week[gc1.get(Calendar.DAY_OF_WEEK) - 1];
			System.out.println(i+"년도 새해 요일은 "+c+"요일 입니다.");
		}

	}

}
