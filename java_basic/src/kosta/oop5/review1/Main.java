package kosta.oop5.review1;

public class Main {

	public static void main(String[] args) {
		Object obj[]= {new Reader("둘리"),
					   new Work("길동"),
					   new Student("마이콜")};
		
		for(Object p : obj) {
			
			if(p instanceof Speakable) {
				
				//System.out.println(((Speakable) p).speak());
				Speakable s = (Speakable) p;
				System.out.println(s.speak());
			}
		}
		

	}

}
