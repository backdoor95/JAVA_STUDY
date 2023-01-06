package kosta.Phone;

public class PhoneInfo {
	private String name;
	private String phoneNo;
	private String birth;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public PhoneInfo() {
			// 기본생성자는 항상 써두자!
	}

	public PhoneInfo(String name, String phoneNo, String birth) {// 생성자 오버로딩
		super();
		this.name = name;
		this.phoneNo = phoneNo;
		this.birth = birth;
	}

	public void show() {
		System.out.println("이름 : " + this.getName());
		System.out.println("전화번호 : " + this.getPhoneNo());
		System.out.println("생년월일 : " + this.getBirth());
		System.out.println();
	}

}