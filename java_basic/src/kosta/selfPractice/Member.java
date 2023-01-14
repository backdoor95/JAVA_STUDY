package kosta.selfPractice;

import java.io.Serializable;



public class Member implements Serializable {
	
	private String name;
	private int age;
	private Video video;
	
	public Member() {}

	public Member(String name, int age, Video v) {
		super();
		this.name = name;
		this.age = age;
		this.video = v;
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

	public Video getVideo() {
		return video;
	}

	public void setVideo(Video video) {
		this.video = video;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + ", video=" + video + "]";
	}
	
	
	
	
	
	
}