package kosta.lamda;

public class LamdaMain {

	public static void main(String[] args) {
		// MyType => 익명 내부클래스 구현
		MyType my1 = new MyType() {

			@Override
			public void hello() {
				// TODO Auto-generated method stub
				System.out.println("익명클래스 형식입니다.");
			}
		};
		my1.hello();

		// 람다식으로 구현
		MyType my2 = () -> {
			System.out.println("람다식 형식 입니다.");
		};
		my2.hello();

		// 향상된 람다식 표현
		MyType my3 = () -> System.out.println("람다식 형식 2 입니다.");
		my3.hello();

		//
		YourType you = (String message) -> {// 파라미터가 1개거나 없으면 생량이 가능함.
			System.out.println("메시지: " + message);
		};
		you.talk("hello1");

		//
		YourType you2 = message -> System.out.println("메시지: " + message);
		you2.talk("hello2");

		// MyNumber 추상메서드 구현(람다식)
		MyNumber mn1 = (int n1, int n2) -> {
			if (n1 > n2)
				return n1;
			else
				return n2;
		};
		MyNumber my =(x, y)->(x>y)?x:y;
		System.out.println("최대값은 : " + mn1.getMax(10, 20));
		System.out.println("최대값은 : " + my.getMax(70, 20));
	}

}
