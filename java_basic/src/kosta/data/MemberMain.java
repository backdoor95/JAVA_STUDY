package kosta.data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class MemberMain {

	public static void main(String[] args) {
		// List를 생성 후 Member 여러개를 추가후 전체를 출력하세요
		List<Member> list = new ArrayList<Member>();
		Scanner sc = new Scanner(System.in);
		String name, address;
		int age;
		list.add(new Member("하1",41,"서울"));
		list.add(new Member("김2",12,"부산"));
		list.add(new Member("나3",33,"인천"));
		
		
//		Collections.sort(list);// 나이로 정렬- 기본 정렬조건임 -1
//		Collections.sort(list, new Decending()); // 나이로 정렬
		Collections.sort(list, new Comparator<Member>() {// 정렬 기준을 변경할때-2, 이 부분은 이름순서 대로 정렬

			@Override
			public int compare(Member o1, Member o2) {
				// 이름을 기준으로 오름차순
				// compareTo
				// 0-> 서로 같다
				//음수 ->aa.compareTo(BB)\
				//양수 ->bb.compareTo(AA)
				if(o1.getName().compareTo(o2.getName())>0) {
					return 1;// 1를 리턴하면 자리를 바꿈
				}else if(o1.getName().compareTo(o2.getName())<0) {
					return -1;
				}
				return 0;
			}
		});
		
		// 1. 출력 방법 1
		for(int i=0;i<list.size();i++) {
			list.get(i).show();
		}
		// 2. 출력방법 2- 향상된 for문
		for (Member m : list) {
			m.show();
		}
		// 3. 출력방법 3. 이터레이터
		Iterator<Member> iter = list.iterator();
		while (iter.hasNext()) {
			Member m = iter.next();
			System.out.println(m.getName());
		}

		// 출력방법 4 . 람다식사용
		list.stream().forEach(member -> System.out.println(member.getName()));
		
		
		while (true) {

			System.out.println("1. 입력, 2. 출력 , 3. 종료");
			String menu = sc.nextLine();

			switch (menu) {

			case "1":
				System.out.println("이름을 입력하세요");
				name = sc.nextLine();
				System.out.println("나이를 입력하세요");
				age = Integer.parseInt(sc.nextLine());
				System.out.println("주소를 입력하세요");
				address = sc.nextLine();
				list.add(new Member(name, age, address));
				break;
			case "2":
				for (int i = 0; i < list.size(); i++) {
					list.get(i).show();
				}
				break;
			case"3":
				
			default:
				break;

			}

		}

	}

}
