package kosta.order;

public class OrderMain {

	public static void main(String[] args) {

		String memberName = "홍길동";
		String memberAddress = "가산";
		String itemName = "갤럭시23";
		int itemPrice = 100;
		int orderQuantity = 10;

		Order o1 = new Order(memberName, memberAddress, itemName, itemPrice, orderQuantity);
		
		o1.getOrderMember().getMemberName();// ?
		
		//o1.orderShow();

//		Member m1 = new Member("홍길동", "가산");
//		Member m2 = new Member("박길동", "구로");
//		
//		Item item1 = new Item("갤럭시23", 100);
//		Item item2 = new Item("아이폰", 180);
//		
//		Order o1 = new Order("1", 3, m2, item2);
//		o1.orderShow();
//		
		
	}

}
