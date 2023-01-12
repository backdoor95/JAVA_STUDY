package kosta.data;

import java.util.Comparator;
import java.util.Random;
import java.util.TreeSet;

public class SortExam {

	public static void main(String[] args) {
		// Arrays.sort(배열) -> 오름차순
		// List -> 입력순선 -> 정렬순서
		// Collections.sort(list);
		// 기본 정렬 조건 : Comparable -> compareTo() 오버라이딩
		// 정렬기준을 변경을 할때 : Comparator -> compare() 오버라이딩

		Random r = new Random();
		//TreeSet<Integer> set = new TreeSet<Integer>();// 기본적으로 오름차순
		//TreeSet<Integer> set = new TreeSet<Integer>(new Desending());//방법1
		TreeSet<Integer> set = new TreeSet<Integer>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return 0;
			}
		});//방법2- 익명내부클래스
		
		
	

	}

}
