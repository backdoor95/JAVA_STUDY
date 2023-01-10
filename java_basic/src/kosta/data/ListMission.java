package kosta.data;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListMission {

	public static void main(String[] args) {
		// List 자료구조를 활용하여 키보드로 부터 입력받은 문자열을 처리
		// 1. 데이터 추가, 2. 데이터 삭제 3. 전체 출력
		Scanner sc = new Scanner(System.in);
		List<String> list = new ArrayList<String>();

		while (true) {
			System.out.println("1. 데이터 추가, 2. 데이터 삭제 3. 전체 출력");
			int menu = Integer.parseInt(sc.nextLine());
			switch (menu) {

			case 1:
				String s = sc.nextLine();
				list.add(s);
				System.out.println("데이터 추가 완료");
				break;
			case 2:
				String find = sc.nextLine();
				int idx = list.indexOf(find);
				if (idx != -1) {
					list.remove(idx);
					System.out.println("제거완료");
				} else {
					System.out.println("제거할 문자열을 찾지 못하였습니다.");
				}
				break;
			case 3:

				for (int i = 0; i < list.size(); i++) {
					System.out.print(list.get(i) + " ");
				}
				System.out.println();
				break;
			}

		}
	}

}
