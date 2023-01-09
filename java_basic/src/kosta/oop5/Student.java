package kosta.oop5;

public class Student extends Man {
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public void speak() {
		System.out.println(this.getName()+" 공부나 열심히해");
	}
}
