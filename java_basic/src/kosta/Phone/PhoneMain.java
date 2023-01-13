package kosta.Phone;

import java.io.File;
import java.util.GregorianCalendar;

import kosta.Phone.DataInput;

public class PhoneMain {

// 패키지는 소문자로 시작해야 한다.

	public static void main(String[] args) {

		Manager Mg = new Manager();
		// Scanner sc = new Scanner(System.in);
		String menu; // 1. 정보입력 , 2. 출력
		int count = 0;

		File file = new File(".");
		File arr[] = file.listFiles();
		for (int i = 0; i < arr.length; i++) {
			String name = arr[i].getName();
			if(arr[i].isFile()) {
				System.out.printf("%-25s %7d", name, arr[i].length());
			}else {
				System.out.printf("%-25s    <DIR> ", name);// '-'가 오른쪽 빈자리 공백으로 채우라는 명령어
			}
			long time = arr[i].lastModified();
			GregorianCalendar calendar = new GregorianCalendar();
			calendar.setTimeInMillis(time);
			System.out.printf("%1$tF %1$tT %n", calendar);
		}

		while (true) {
			System.out.println("메뉴를 입력해주세요 : 1.정보입력 , 2.출력, 3.검색, 4.수정, 5.삭제, 6.정렬, 7.저장, 8.불러오기, 9.종료");
			menu = DataInput.sc.nextLine();/// 내가 틀린 부분!!!!!!!!!!!!!!!!!!!!!!!!!! 이렇게 쓰면됨.
			switch (menu) {
			case "1":
				try {
					Mg.addPhoneInfo();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				count++;
				break;
			case "2":
				Mg.listPhoneInfo();
				break;
			case "3":
				Mg.searchPhoneInfo();
				break;
			case "4":
				Mg.updatePhoneInfo();
				break;
			case "5":
				Mg.deletePhoneInfo();
				break;
			case "6":
				Mg.sortPhoneInfo();
				break;
			case "7":
				Mg.savePhoneInfo();
				break;
			case "8":
				Mg.recallPhoneInfo();
				break;
			case "9":
				System.out.println("프로그램을 종료합니다. ");
				return;// 프로그램 종료하는법. 그냥 return; 을 해서 프로그램을 종료시킬수 있다.
			default:
				break;

			}
		}
	}

//	public static void InsertInfo(PhoneInfo arr[], int count) throws Exception {
//		Scanner sc = new Scanner(System.in);
//
//		if (count >= N) {
//			throw new Exception("용량 초과!");
//		}
//
//		System.out.println("이름을 입력해주세요");
//		String name = sc.nextLine();
//		System.out.println("전화번로를 입력해주세요");
//		String phoneNo = sc.nextLine();
//		System.out.println("생년월일을 입력해주세요");
//		String birth = sc.nextLine();
//		arr[count] = new PhoneInfo(name, phoneNo, birth);
//	}

//	public static void showAllInfo(PhoneInfo arr[], int count) {
//		for (int i = 0; i < count; i++) {
//			arr[i].show();
//		}
//	}

}
