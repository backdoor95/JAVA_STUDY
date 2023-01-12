package kosta.data;

import java.util.Comparator;

public class Decending implements Comparator<Member> {
// 이렇게 직접만들어서 Collections.sort(list, ~~~);//1. (~~~) 부분에 Desendind 객체를 넣거나. MemmberMain에 있는 '정렬 기준을 변경할때'에 넣거나 
	@Override
	public int compare(Member o1, Member o2) {
		if (o1.getAge() > o2.getAge())
			return 1;
		else if (o1.getAge() < o2.getAge())
			return -1;
		return 0;
	}

}
