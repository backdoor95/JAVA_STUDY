package kosta.data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExam {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();//ArrayList 생성 -> 데이터를 넣을수 있는 자료구조 생성
		list.add("사과");
		list.add("포도");
		list.add("수박");// data를 넣을때
		
//		for(int i=0;i<list.size();i++)
//		{
//			System.out.println(list.get(i));// data를 얻을때
//		}
		//Iterator(List, Map, Set) ====> 호환이 될수잇는 데이터 타입 , 서로의 합집합
		Iterator<String> iter = list.iterator();
		while(iter.hasNext()) {// Iterator는 while문을 이용하여 사용된다. 이런 방식으로 이용됨.
			System.out.println(iter.next());
		}
		
		
	}

}
