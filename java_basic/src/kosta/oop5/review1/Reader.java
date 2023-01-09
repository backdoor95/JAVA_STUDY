package kosta.oop5.review1;

public class Reader extends Man implements Speakable {

	public Reader(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String speak() {
		
		return getName()+" 자바화이팅";
	}

}
