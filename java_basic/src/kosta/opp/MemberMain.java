package kosta.opp;

public class MemberMain {

	public static void main(String[] args) {
		// 정보은닉(캡슐화) : 필드를 private로 선언했을때 접근할수있는 방법 => private 필드 => setter/getter 메서드를 사용한다.
		
		Member m = new Member();
//		m.name  = "홍길동";
//		m.age =20;
		
		m.setName("홍길동");
		m.setAge(10);
		
		System.out.println("이름: "+ m.getName());
		System.out.println("나이: "+ m.getAge());

	}

}
