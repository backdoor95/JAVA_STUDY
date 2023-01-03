package kosta.Phone;
import kosta.Phone.DataInput;
public class Manager {
	// 1. addPhoneInfo(){}
	// 2. listPhoneInfo(){}
	PhoneInfo people[] = new PhoneInfo[10];
	
	//Scanner sc = new Scanner(System.in);
	int count = 0;

	public Manager() {// default 생성자

	}

	public void addPhoneInfo() throws Exception {

		if (count >= 10) {
			throw new Exception("용량 초과!");
		}

		System.out.println("이름을 입력해주세요");
		String name = DataInput.sc.nextLine();
		System.out.println("전화번로를 입력해주세요");
		String phoneNo = DataInput.sc.nextLine();
		System.out.println("생년월일을 입력해주세요");
		String birth = DataInput.sc.nextLine();
		people[count++] = new PhoneInfo(name, phoneNo, birth);
	}

	public void listPhoneInfo() {// state로 함수를 만들면 안에 못쓴다. 멤버 변수를 못사용한다.
		for (int i = 0; i < count; i++) {
			people[i].show();
		}
	}

	public void searchPhoneInfo() {
		System.out.println("검색할 이름을 입력해 주세요");
		String name = DataInput.sc.nextLine();
		int idx = -1;
		for (int i = 0; i < count; i++) {
			if (people[i].getName().equals(name)) {
				people[i].show();
				idx = i;
				break;
			}
		}
		if (idx == -1)
			System.out.println("전화번호가 존재하지 않습니다.");

	}

	public void updatePhoneInfo() {
		System.out.println("검색할 이름을 입력해 주세요");
		String name = DataInput.sc.nextLine();
		int idx = -1;
		for (int i = 0; i < count; i++) {
			if (people[i].getName().equals(name)) {
				System.out.println("새로운 전화번호를 입력해주세요");
				String phoneNo = DataInput.sc.nextLine();
				people[i].setPhoneNo(phoneNo);;
				System.out.println("전화번호가 수정되었습니다.");
				idx = i;
				break;
			}
		}
		if (idx == -1)
			System.out.println("전화번호가 존재하지 않습니다.");

	}

	public void deletePhonInfo() {
		System.out.println("삭제할 이름을 입력해 주세요");
		String name = DataInput.sc.nextLine();
		int idx = -1;
		for (int i = 0; i < count; i++) {
			if (people[i].getName().equals(name)) {
				idx = i;
				break;
			}
		}

		if (idx == -1) {
			System.out.println("전화번호가 존재하지 않습니다");
		} else {
			for (int i = idx; i < count; i++) {
				if (i == people.length - 1)
					people[i] = null;
				else
					people[i] = people[i + 1];
			}

			System.out.println("전화번호가 삭제되었습니다.");
			count--;
		}

	}

}
