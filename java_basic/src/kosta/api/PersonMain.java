package kosta.api;

public class PersonMain {

	public static void main(String[] args) {
		Person p1= new Person("홍길동", 20);
		Person p2= new Person("홍길동", 40);
		
		if(p1.equals(p2)) {// equals 메소드는 객체를 비교한다. 즉, 객체의 주소를 비교한다. 부모가 가지고 있는 메서드를 오버라이딩 해서 사용이 가능하다.
			System.out.println("같은 사람");
		}else {
			System.out.println("다른 사람");
		}

		System.out.println(p1);// sys안에 객체를 넣으면 자동으로 toString 메서드가 실행됨. 따로 오버라이딩 해주지 않으면 주소값이 출력이됨.
	}

}
