package kosta.api;

import java.util.Calendar;

public class CalendarMission {

	public static void main(String[] args) {
		// 2023년 2월 달력 만들기
		// <2023년 2월>
		Calendar gc = Calendar.getInstance();// 객체 생성
		gc.set(2023, 1, 1);// 2월 1일 로 세팅
		int n = gc.getActualMaximum(Calendar.DATE);// 각 달 마다 최대 요일수 반환
		int start = gc.get(Calendar.DAY_OF_WEEK);// 요일의 숫자를 반환
		// System.out.println(start);
		System.out.println("\t\t\t<2023년 2월>");
		String week[] = { "일", "월", "화", "수", "목", "금", "토" };

		for (int i = 0; i < week.length; i++) {
			System.out.printf("\t%s", week[i]);
		}
		System.out.println();

		for (int i = 0; i < (start - 1); i++) {
			System.out.print("\t");
		}
		for (int i = 1; i <= n; i++) {
			System.out.printf("\t%2d", i);
			if ((i + start - 1) % 7 == 0)
				System.out.println();
		}

	}

}
