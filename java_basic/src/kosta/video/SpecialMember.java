package kosta.video;

public class SpecialMember extends GeneralMember {

	private int bonusPoint;

	public SpecialMember() {
	}// default 생성자

	public SpecialMember(String id, String name, String address, int videoNumber, String title, String actor,
			int bonusPoint) {
		super(id, name, address, videoNumber, title, actor);
		this.bonusPoint = bonusPoint;
	}

	@Override
	public void show() {
		
		super.show();// 부모의 메서드를 호출하기 위한 용도 --> 꼭 안써도되고 써도됨. 
		System.out.println("회원의 보너스 포인터 적립 : " + this.bonusPoint);
	}

//	public void SpecialMemberShow() {
//		this.show();
//		System.out.println("회원의 보너스 포인터 적립 : " + this.bonusPoint);
//	}
	

}
