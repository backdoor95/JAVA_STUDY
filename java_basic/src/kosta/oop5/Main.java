package kosta.oop5;

public class Main {

	public static void main(String[] args) {
		Object[] obj = { new Reader("둘리"), new Work("길동"), new Student("마이콜") };

//			for(Object ob: obj) {
//				
//				if( ob instanceof Reader|| ob instanceof Work) {
//					
//				}
//			}
		for (int i = 0; i < obj.length; i++) {
			if (obj[i] instanceof Speakeable) {// 형변환이 가능한지 아닌지 체크
				// obj[i].speak();// 자식클래스에만 있는 메서드 호출 불가능
				
				Speakeable speaker = (Speakeable) obj[i];
				speaker.speak();
				//System.out.println(speaker.speak());
				
			}
		}

	}

}
