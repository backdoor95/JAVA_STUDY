package kosta.Phone;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import kosta.Phone.DataInput;

public class Manager {
	// 1. addPhoneInfo(){}
	// 2. listPhoneInfo(){}
	// PhoneInfo people[] = new PhoneInfo[10];
	// List 자료구조로 대체

	List<PhoneInfo> peopleList = new ArrayList<PhoneInfo>();

	// Scanner sc = new Scanner(System.in);
	int count = 0;

	public Manager() {// default 생성자

	}

	public void addPhoneInfo() throws Exception {

		if (count >= 10) {
			throw new Exception("용량 초과!");
		}
		System.out.println("유형 선택 = 1.일반, 2.동창 , 3.직장");
		String type = DataInput.sc.nextLine();

		System.out.println("이름을 입력해주세요");
		String name = DataInput.sc.nextLine();// DataInput.sc.nextLine(); 이런식으로 데이터를 입력받는다.
		System.out.println("전화번로를 입력해주세요");
		String phoneNo = DataInput.sc.nextLine();
		System.out.println("생년월일을 입력해주세요");
		String birth = DataInput.sc.nextLine();

		if (type.equals("1")) {
			// people[count++] = new PhoneInfo(name, phoneNo, birth);
			peopleList.add(new PhoneInfo(name, phoneNo, birth));
		} else if (type.equals("2")) {
			System.out.println("전공을 입력하세요");
			String major = DataInput.sc.nextLine();
			System.out.println("학번을 입력하세요");
			int year = Integer.parseInt(DataInput.sc.nextLine());
			// people[count++] = new Universe(name, phoneNo, birth, major, year);
			peopleList.add(new Universe(name, phoneNo, birth, major, year));
		} else if (type.equals("3")) {
			System.out.println("부서를 입력하세요");
			String dept = DataInput.sc.nextLine();
			System.out.println("직급을 입력하세요");
			String position = DataInput.sc.nextLine();
			// people[count++] = new Company(name, phoneNo, birth, dept, position);
			peopleList.add(new Company(name, phoneNo, birth, dept, position));
		}
	}

	public void listPhoneInfo() {// state로 함수를 만들면 안에 못쓴다. 멤버 변수를 못사용한다.
		for (int i = 0; i < peopleList.size(); i++) {
			// people[i].show();
			peopleList.get(i).show();
		}
	}

	public void searchPhoneInfo() {
		System.out.println("검색할 이름을 입력해 주세요");
		String name = DataInput.sc.nextLine();
		//int idx = -1;

		for (int i = 0; i < peopleList.size(); i++) {
//			if (people[i].getName().equals(name)) {
//				people[i].show();
//				idx = i;
//				break;
//			}
			if (peopleList.get(i).getName().equals(name)) {
				peopleList.get(i).show();
				return;
				
			}

		}
		
		System.out.println("전화번호가 존재하지 않습니다.");

	}

	public void updatePhoneInfo() {
		System.out.println("검색할 이름을 입력해 주세요");
		String name = DataInput.sc.nextLine();
//		int idx = -1;
		for (int i = 0; i < peopleList.size(); i++) {
//			if (people[i].getName().equals(name)) {
//				System.out.println("새로운 전화번호를 입력해주세요");
//				String phoneNo = DataInput.sc.nextLine();
//				people[i].setPhoneNo(phoneNo);
//				
//				System.out.println("전화번호가 수정되었습니다.");
//				idx = i;
//				break;
//			}
			if (peopleList.get(i).getName().equals(name)) {
				System.out.println("새로운 전화번호를 입력해주세요");
				String phoneNo = DataInput.sc.nextLine();
				peopleList.get(i).setPhoneNo(phoneNo);
				System.out.println("전화번호가 수정되었습니다.");
				return;
			}
		}
		
		System.out.println("전화번호가 존재하지 않습니다.");

	}

	public void deletePhoneInfo() {
		System.out.println("삭제할 이름을 입력해 주세요");
		String name = DataInput.sc.nextLine();
		int idx = -1;
		System.out.println("1");
		for (int i = 0; i < peopleList.size(); i++) {
//			if (people[i].getName().equals(name)) {
//				idx = i;
//				break;
//			}

			if(peopleList.get(i).getName().equals(name)) {
				peopleList.remove(i);
				System.out.println("제거 완료하였습니다.");
				return;
			}
		}
		
		System.out.println("제거할 전화번호가 존재하지 않습니다.");
//		if (idx == -1) {
//			System.out.println("전화번호가 존재하지 않습니다");
//		} else {
//			for (int i = idx; i < count; i++) {
//				if (i == people.length - 1)
//					people[i] = null;
//				else
//					people[i] = people[i + 1];
//			}
//
//			System.out.println("전화번호가 삭제되었습니다.");
//			count--;
//		}

	}

	public void sortPhoneInfo() {
		System.out.println("1.오름차순 정렬, 2.내림차순 정렬");
		String type = DataInput.sc.nextLine();
		switch (type) {
		case "1":
			Collections.sort(peopleList, new Comparator<PhoneInfo>() {

				@Override
				public int compare(PhoneInfo o1, PhoneInfo o2) {
					if(o1.getName().compareTo(o2.getName())>0) {
						return 1;
					}else if(o1.getName().compareTo(o2.getName())<0) {
						return -1;
					}
					return 0;
				}
			});
			System.out.println("이름 오름차순 정렬 완료");
			break;
		case "2":
			Collections.sort(peopleList,new Comparator<PhoneInfo>() {
				
				@Override
				public int compare(PhoneInfo o1, PhoneInfo o2) {
					if(o1.getName().compareTo(o2.getName())>0) {
						return -1;
					}else if(o1.getName().compareTo(o2.getName())<0) {
						return 1;
					}
					return 0;
				}
			});
			System.out.println("이름 내림차순 정렬 완료");
			break;
		default:
			break;

		}

	}
	
	public void savePhoneInfo() {
		System.out.println("정보를 저장합니다. 저장중....");
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(new FileOutputStream("PhoneInfo.txt"));
//			for(int i=0;i<peopleList.size();i++) {
//				oos.writeObject(peopleList[i]);
//			}
			oos.writeObject(peopleList);
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				oos.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		System.out.println("저장완료");
	}
	
	public void recallPhoneInfo() {
		System.out.println("파일을 불러오는 중 ...");
		ObjectInputStream ois = null;
		
		try {
			ois = new ObjectInputStream(new FileInputStream("PhoneInfo.txt"));
			peopleList = (List<PhoneInfo>)ois.readObject();
		} catch (Exception e) {
			e.printStackTrace();
			
		}finally {
			try {
				ois.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		System.out.println("파일 불러오기 완료");
		
	}

}
