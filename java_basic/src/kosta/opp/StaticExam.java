package kosta.opp;

public class StaticExam {
	int total; // 필드 : new 객체생성 -> 메모리 생성
	static int grandTotal; // 정적요소(정적필드) -> 객체들끼리 공유함.
	final int num = 10; // final로 선언된 변수는 static의 성격을 가짐.
	final static int UPPER_LIMIT=10000000;//final로 선언된 변수는 static의 성격을 가짐. 값의 변경을 불허(상수)=> 대문자로 선언

	public void add() {// static 이 없을때면 객체가 생성이 되어야 메모리에 올라감. static 메소드 안에는 오직 static 필드만 사용이 가능하다.
		total += 10;
		grandTotal += 10;
	}

	public void print() {// 이건 객체의 멤버이다. 멤버 메서드
		System.out.println("메서드 호출");
	}

//	public static void print() {// 이건 객체의 멤버이다. 멤버 메서드
//		System.out.println("메서드 호출");
//	}

	public static void main(String[] args) {
		StaticExam se = new StaticExam();
		se.print();// 객체를 생성하고 메서드를 호출해야함.
		// print();// 이건 에러가 뜸 이렇게 호출하고 싶으면 public static void print() 이렇게 메소드를 수정해줘야한다.
		// 이렇게햐면 객체를 생성하지 않고도 print()써서 사용이 가능하다.
		// StaticExam.print(); //클래스이름으로 호출을함.
		StaticExam se2 = new StaticExam();

		se.add();
		se2.add();

		//se.num=1000;// final로 선언해버렸기 때문에 변경하지 못함.
		System.out.println("total: " + se.total);//
//		System.out.println("grandTotal: "+se.grandTotal);
		System.out.println("grandTotal: " + StaticExam.grandTotal); // static 변수를 사용할때는 이렇게 사용하기로 약속함. 위에 코드와 동일 즉,
																	// 클래스이름으로 호출을함.
		System.out.println("----------------------------");
		System.out.println("total: " + se2.total);
//		System.out.println("grandTotal: "+se2.grandTotal);
		System.out.println("grandTotal: " + StaticExam.grandTotal);// static 변수를 사용할때는 이렇게 사용하기로 약속함. 위에 코드와 동일 즉,
																	// 클래스이름으로 호출을함.
	}

}
