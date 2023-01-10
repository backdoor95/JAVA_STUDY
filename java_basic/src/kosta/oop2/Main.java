package kosta.oop2;

public class Main {

	public static void main(String[] args) {
		Study study = new Study();
		Work work = new Work();
		
		Role role = new Role() {// 익명 내부
			
			@Override
			public void doing() {
				// TODO Auto-generated method stub
				System.out.println("Driver role");
			}
		};

		Person person1 = new Person("홍길동", role);
//		Person person1 = new Person("홍길동", new Role() {// 이런 방식도 가능하다.
//			
//			@Override
//			public void doing() {
//				// TODO Auto-generated method stub
//				System.out.println("Driver role");
//			}
//		});
		Person person2 = new Person("문준호", work);
		person1.doIt();
		person2.doIt();

	}

}
