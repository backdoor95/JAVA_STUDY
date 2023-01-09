package kosta.oop5.review1;

public class Student extends Man {

	public Student(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	public String speak() {
		return getName()+" 공부나 열심히 해";
	}
}
