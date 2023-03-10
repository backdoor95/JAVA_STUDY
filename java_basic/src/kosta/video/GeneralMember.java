package kosta.video;

public class GeneralMember {

	private String id;
	private String name;
	private String address;
	private int videoCount;// 초기화 하지 않으면 0이다.
	// private Video videoInfo[];
	private Video videoInfo;

	public GeneralMember() {
	}// default 생성자는 항상 만드는 습관을 가지자

	public GeneralMember(String id, String name, String address, int videoNumber, String title, String actor) {// 생성자
																												// 오버로딩

		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.videoInfo = new Video(videoNumber, title, actor);
		// this.videoInfo = new Video[5];
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

//	public Video getVideoInfo() {
//		return videoInfo[videoCount];
//	}
//
//	public void setVideoInfo(int videoNumber, String title, String actor) {
//		this.videoInfo[videoCount].setVideoNumber(videoNumber);
//		this.videoInfo[videoCount].setTitle(title);
//		this.videoInfo[videoCount].setActor(actor);
//	}

	public Video getVideoInfo() {
		return videoInfo;
	}

	public void setVideoInfo(int videoNumber, String title, String actor) {
		this.videoInfo.setVideoNumber(videoNumber);
		this.videoInfo.setTitle(title);
		this.videoInfo.setActor(actor);
	}

	public void show() {
		System.out.println("회원의 아이디 : " + this.id);
		System.out.println("회원의 이름 : " + this.name);
		System.out.println("회원의 주소 : " + this.address);
//		System.out.println("회원님이 총 빌린 비디오는 " + videoCount + "개 입니다");
//		for (int i = 0; i < videoCount; i++) {
//			System.out.println("회원이 대여한 비디오 번호 : " + this.videoInfo[i].getVideoNumber());
//			System.out.println("회원이 대여한 비디오 제목 : " + this.videoInfo[i].getTitle());
//			System.out.println("회원이 대여한 비디오 주인공 : " + this.videoInfo[i].getActor());
//			//System.out.println();
//		}

		System.out.println("회원이 대여한 비디오 번호 : " + this.videoInfo.getVideoNumber());
		System.out.println("회원이 대여한 비디오 제목 : " + this.videoInfo.getTitle());
		System.out.println("회원이 대여한 비디오 주인공 : " + this.videoInfo.getActor());

	}

}
