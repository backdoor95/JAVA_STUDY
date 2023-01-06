package kosta.Phone;

public class Universe extends PhoneInfo {
	private String major;
	private int year;

	public Universe() {
	}// default 생성자

	public Universe(String name, String phoneNo, String birth, String major, int year) {
		super(name, phoneNo, birth);
		this.major = major;
		this.year = year;
	}

	@Override
	public void show() {
		super.show();
		System.out.println("전공 : " + this.getMajor());
		System.out.println("학번 : " + this.getYear());
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

}
