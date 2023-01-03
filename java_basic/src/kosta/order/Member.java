package kosta.order;

public class Member {
	private String memberName;
	private String memberAddress;

	public Member() {

	}// default 생성자

	public Member(String name, String address) {// 생성자 오버로딩
		this.memberName = name;
		this.memberAddress = address;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getMemberAddress() {
		return memberAddress;
	}

	public void setMemberAddress(String memberAddress) {
		this.memberAddress = memberAddress;
	}

}
