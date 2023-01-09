package kosta.oop5;

public class Work extends Man implements Speakeable {

	//public Work() {}//default 생성자
	
	@Override
	public String speak() {
		System.out.println(this.getName()+" 열심히 일해야 한다.");
		return null;
	}

	public Work() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Work(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

}
