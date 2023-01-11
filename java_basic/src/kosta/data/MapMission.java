package kosta.data;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapMission {

	public static void main(String[] args) {
		// 이름, 점수를 한쌍으로 Map자료구조로 구현하자. => 김자바 : 80, 박자바 : 70
		// 1. 시험 응시자만 전체 출력
		// 2. 총점, 평균, 최고 점수, 최저점수 : Collection => max(), min()
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("김자바", 90);
		map.put("박자바", 50);
		map.put("정자바", 80);
		map.put("서자바", 20);
		map.put("한자바", 30);
		
		//map =>key 추출
		Set<String> set = map.keySet();
		// Set의 좋은 점은 안에 toString이 있기 때문에 그냥 set만으로 출력이 가능하다ㅣ
		System.out.println(set);//[김자바, 박자바, 한자바, 서자바, 정자바]
		
		//map => value 추출
		Collection<Integer> values = map.values();
		Iterator<Integer> iter = values.iterator();
		// list, set, Collection, (단. map제외)  에서 iterator로 변경가능
		
		int total =0;
		while(iter.hasNext()) {
			total+=iter.next();
		}
		System.out.println("총점 = "+total);
		System.out.println("평균 = "+total/map.size());
		System.out.println("최고 점수 = "+Collections.max(values));
		System.out.println("최저 점수 = "+Collections.min(values));
		
		// 내풀이
//		double avg = 0;
//		double sum = 0;
//		Map<String, Integer> map = new HashMap<String, Integer>();
//		map.put("최자바", 50);
//		map.put("김자바", 100);
//		map.put("이자바", 90);
//		map.put("박자바", 80);
//		map.put("정자바", 30);
//
//		Set set = map.entrySet();
//		Iterator iter = set.iterator();
//	
//		while (iter.hasNext()) {
//			Map.Entry<String, Integer> e = (Map.Entry<String, Integer>) iter.next();
//			System.out.println("key = " + e.getKey());// 출력이 될때 데이터를 넣은 순서대로 출력이 되는것이 아니라 랜덤으로 출력
//			sum += e.getValue();
//		}
//		System.out.println("총점 = " + sum);
//		avg = sum / set.size();
//		System.out.println("size = " + set.size());
//		System.out.println("평균 = " + avg);
//		System.out.println(map.keySet());
//		System.out.println(map.values());
//		// System.out.println("평균 점수 = "+ );
//		System.out.println("최고 점수 = " + Collections.max(map.values()));
//		System.out.println("최저 점수 = " + Collections.min(map.values()));

	}

}
