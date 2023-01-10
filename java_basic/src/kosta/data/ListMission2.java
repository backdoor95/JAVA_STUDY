package kosta.data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class ListMission2 {

	public static void main(String[] args) {
		// 로또번호 1~45 중복되지 않는 정수 6개를 출력하
		// 1. 배열로 출력
//		int arr[] = new int[6];
//		for (int i = 0; i < arr.length; i++) {
//			int k = (int) (Math.random() * 45) + 1;
//			arr[i] = k;
//			for (int j = 0; j < i; j++) {
//				if (k == arr[j]) {
//					i--;
//					break;
//				}
//
//			}
//		}
//		for (int i = 0; i < 6; i++) {
//			System.out.print(arr[i] + " ");
//		}
		// 2. List 자료구조
//		//List<Integer> list = new LinkedList<Integer>();
//		List<Integer> list = new ArrayList<Integer>();
//		for (int i = 0; i < 6; i++) {
//			Integer num = (Integer) ((int) (Math.random() * 45) + 1); // boxing unboxing?
//			if (list.contains(num)) {
//				System.out.println("중복!");
//				i--;
//			} else {
//				list.add(num);
//			}
//		}
//		// 오름차순으로 정렬
//		list.sort(null);
//		//list.sort(Comparator.naturalOrder());// 위와 같다.
//
//		// 내림차순으로 정렬
//		//list.sort(Comparator.reverseOrder());
//		for (int i = 0; i < list.size(); i++) {
//			System.out.print(list.get(i) + " ");
//		}
		// 3. Set 자료구조 구현 => new TreeSet<Integer>(); => add();
		// System.out.println(set);

		TreeSet<Integer> s = new TreeSet<Integer>();
		int cnt = 0;
		while (true) {
			if (cnt == 6)
				break;

			if (s.add((Integer) ((int) (Math.random() * 45) + 1)))
				cnt++;
			else
				System.out.println("중복!");

		}
		//set은 자동 정렬되어서 저장되는것으로 추청
		// System.out.println(s);// 방법1
		//Iterator<Integer> iter = s.iterator();//방법2. 
		Iterator iter = s.iterator();//방법2. 
		while (iter.hasNext()) {
			System.out.print(iter.next() + " ");
		}

	}

}
