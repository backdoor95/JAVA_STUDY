package kosta.oop5;

public class Reader extends Man implements Speakeable {

	public Reader() {};//default 생성자
	public Reader(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String speak() {
		
		System.out.println(this.getName()+" 자바화이팅");
		return null;
	}

}
