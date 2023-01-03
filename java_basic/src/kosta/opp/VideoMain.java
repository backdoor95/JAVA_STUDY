package kosta.opp;

public class VideoMain {

	public static void main(String[] args) {
		Video a[] = new Video[5];
		a[0] = new Video();
		a[1] = new Video();
		a[2] = new Video();
		a[3] = new Video();
		a[4] = new Video();

		a[0].setNumber(111111);
		a[0].setTitle("아바타1");
		a[0].setActor("나비족");

		a[1].setNumber(222222);
		a[1].setTitle("아바타2");
		a[1].setActor("나비족2");

		a[2].setNumber(333333);
		a[2].setTitle("악인전");
		a[2].setActor("황정민");

		a[3].setNumber(444444);
		a[3].setTitle("부산행");
		a[3].setActor("공유");

		a[4].setNumber(555555);
		a[4].setTitle("범죄도시");
		a[4].setActor("마동석");

		for (int i = 0; i < 5; i++) {
			System.out.println("번호 = " + a[i].getNumber() + ", 제목 = " + a[i].getTitle() + ", 배우 = " + a[i].getActor());
		}

	}

}
