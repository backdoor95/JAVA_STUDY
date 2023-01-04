package kosta.video;

import java.util.Scanner;

public class VideoMain {

	static int count = 0;
	static int videoCount = 0;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		GeneralMember g1 = new GeneralMember("aaa", "홍길동", "동탄", 1, "트랜스포머3", "서봉수");
		SpecialMember s1 = new SpecialMember("bbb", "김철수", "서울", 2, "쿵푸팬더2", "지성민", 10);
		
		
		g1.show();
		System.out.println();
		s1.show();
		// int 값을 double 형으로 넣을때 묵시적 형 변환이 일어남.
		
		
		

//		GeneralMember[] GM = new GeneralMember[5];
//
//		while (true) {
//			System.out.println("1.정보입력, 2.출력");
//
//			String menu = sc.nextLine();
//
//			switch (menu) {
//
//			case "1":
//				try {
//					InputData(GM);
//				} catch (Exception e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//				count++;
//				break;
//
//			case "2":
//				InfoList(GM);
//				break;
//
//			default:
//				break;
//
//			}
//
//		}

	}

	public static void InputData(GeneralMember GM[]) throws Exception {
		System.out.print("id 입력  = ");
		String id = sc.nextLine();
		System.out.print("name 입력  = ");
		String name = sc.nextLine();
		System.out.print("address 입력  = ");
		String address = sc.nextLine();
		System.out.print("videoNumber 입력  = ");
		int videoNumber = Integer.parseInt(sc.nextLine());
		System.out.print("videoTitle 입력  = ");
		String videoTitle = sc.nextLine();
		System.out.print("video 주인공 입력  = ");
		String videoActor = sc.nextLine();

		if (count >= 5) {
			throw new Exception("Member배열 용량 초과");
		}

		GM[count] = new GeneralMember(id, name, address, videoNumber, videoTitle, videoActor);
//		GM[count].setId(id);
//		GM[count].setName(name);
//		GM[count].setAddress(address);
//		GM[count].setVideoInfo(videoNumber, videoTitle, videoActor);

	}

	public static void InfoList(GeneralMember GM[]) {

		for (int i = 0; i < count; i++) {
			GM[i].show();
		}
	}

}
