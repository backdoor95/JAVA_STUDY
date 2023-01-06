package kosta.oop2;

public class Main {

	public static void main(String[] args) {
		Study study = new Study();
		Work work = new Work();
		Person person1 = new Person("홍길동", study);
		Person person2 = new Person("문준호", work);
		person1.doIt();
		person2.doIt();

	}

}
