package kosta.data;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExam {

	public static void main(String[] args) {
		// Map : (key, value) ,(key, value) = > HashMap map과 set은 순서가 없다. => 즉, 복주머니에서 뽑듯이
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("1", "SSG");
		map.put("2", "키움");// key value를 put 으로 넣어준다.
		map.put("3", "LG");
		
		
		System.out.println("요소의 사이즈: "+ map.size());
		if(map.containsValue("SSG")) {
			//map.remove("1","SSG");
			map.remove("1");
		}
		
		System.out.println("요소의 사이즈: "+ map.size());
		System.out.println(map.get("2"));// value 출력
		//if(map.containsKey(key))
		//Map 전체목록 출력 (key, value) 하는 법
		//Map => Set =>Iterator 이 방법만 전체목록을 출력할수있다. 1. Set set = map.entrySet(); 2. Iterator iter = set.iterator();
		//key => keySet() : 키값만 추출 - ex) map.keySet()
		//values(): => Collection : value 값만 추출 -ex) map.values();
		//System.out.println(map.keySet()); //출력 =  [김자바, 박자바, 최자바, 이자바, 정자바]
		//System.out.println(map.values()); //출력 =  [100, 80, 50, 90, 30]
		//entrySet(): (key, value) 모두 추출 ex) Set set = map.entrySet();
		//Iterator는 size가 없다. 따라서 set의 size를 써야한다. 또는 map.size()
		//
	
		Set set = map.entrySet();
		Iterator iter = set.iterator();// iterator는 반복자이다.
	
		while(iter.hasNext()) {
			// Entry는 한 쌍의 데이터를 뽑아내기 위한 내부 인터페이스
			Map.Entry<String, String>e=(Map.Entry<String, String>)iter.next();// 내부 인터페이스
			System.out.println("key = "+e.getKey()+", value = "+e.getValue());
		}

	}

}
