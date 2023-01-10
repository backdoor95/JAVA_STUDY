package kosta.api;

public class Person {
	private String name;
	private	int age;
	
	public Person() {}//default 생성자

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	

	@Override
	public boolean equals(Object obj) {
		Person p = (Person)obj; // 이건 p2
		if(name.equals(p.getName())&&age==p.getAge())// p1의 이름
			return true;
		else 
			return false;
			
	}
	


	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}
