package kosta.data;

public class Member implements Comparable<Member> {// 최초의 정렬기준=comparable을 세우기 위함.
	private String name;
	private int age;
	private String address;

	public Member() {
	}

	public Member(String name, int age, String address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void show() {
		System.out.println("이름 : " + name + " 나이 : " + age + " 주소 : " + address);
	}


	// 왼쪽 메뉴 상단 = source-> Generate toString 
	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + ", address=" + address + "]";
	}

	@Override
	public int compareTo(Member o) {
		if(age<o.age) {// 
			return -1;
		}else if(age>o.age) {
			return 1;
		}
		return 0;
		
		// return age - o.age;
	}

	

}
