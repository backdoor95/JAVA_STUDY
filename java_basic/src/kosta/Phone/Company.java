package kosta.Phone;

public class Company extends PhoneInfo{
	private String dept;
	private String position;
	
	public Company() {}// 기본생성자

	public Company(String name, String phoneNo, String birth, String dept, String position) {
		super(name, phoneNo, birth);
		this.dept = dept;
		this.position = position;
	}

	
	@Override
	public void show() {
		// TODO Auto-generated method stub
		super.show();
		System.out.println("부서 : "+ this.getDept());
		System.out.println("직급 : "+ this.getPosition());
	}

	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	
}
