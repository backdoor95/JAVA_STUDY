package kosta.data;

import java.util.LinkedList;
import java.util.Scanner;

public class FoodOrderMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Food food[] = { new Food("짜장면", 7000), new Food("짬뽕", 8000), new Food("볶음밥", 6000), new Food("탕수육", 15000),
				new Food("멘보샤", 13000), new Food("동파육", 25000) };
		LinkedList<Order> q = new LinkedList<Order>();
		System.out.println("식당 주문관리 프로그램 시작");
		int totalAmount = 0;

		while (true) {
			System.out.println("1.주문요청, 2.주문처리, 3.매출액 총액, 4.종료");
			String menu = sc.nextLine();
			switch (menu) {

			case "1":
				System.out.println("주문할 음식의 번호를 선택해 주세요");
				System.out.println("1.짜장면, 2.짬뽕, 3.볶음밥, 4.탕수육, 5.멘보샤, 6.동파육");
				int num = Integer.parseInt(sc.nextLine());
				System.out.println("주문할 수량을 입력해주세요");
				int cnt = Integer.parseInt(sc.nextLine());
				q.offer(new Order(food[num - 1], cnt));
				break;
			case "2":
				if (q.isEmpty())
					System.out.println("들어온 주문이 없습니다.");

				while (!q.isEmpty()) {
					Order tmp = q.poll();
					System.out.println(tmp.getFoodName() + " " + tmp.getAmount() + "개 주문처리가 완료되었습니다.");
					totalAmount += (tmp.getAmount() * tmp.getPrice());
				}
				break;
			case "3":
				System.out.println("현재 총 매출은 = " + totalAmount);
				break;
			case "4":
				System.out.println("프로그램 종료");
				return;
			default:
				break;

			}

		}

	}

}
