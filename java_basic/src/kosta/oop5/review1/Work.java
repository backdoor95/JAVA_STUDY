package kosta.oop5.review1;

public class Work extends Man implements Speakable {

	public Work(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String speak() {
		// TODO Auto-generated method stub
		return getName()+" 열심히 일해야 한다.";
	}

}
