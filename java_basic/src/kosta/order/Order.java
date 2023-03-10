package kosta.order;

public class Order {
	private Member orderMember;
	private Item orderItem;
	private int orderQuantity;
	private int orderPrice;

	public Order() {// default 생성자

	}

	public Order(String memberName, String memberAddress, String itemName, int itemPrice, int orderQuantity) {

		// this.orderMember = new Member(memberName, memberAddress);
		// this.orderItem = new Item(itemName, itemPrice);
		this.orderMember = new Member();
		this.orderMember.setMemberName(memberName);
		this.orderMember.setMemberAddress(memberAddress);
		this.orderItem = new Item();
		this.orderItem.setItemName(itemName);
		this.orderItem.setItemPrice(itemPrice);

		this.orderQuantity = orderQuantity;
		this.orderPrice = itemPrice * orderQuantity;
	}

	public Member getOrderMember() {
		return orderMember;
	}

	public void setOrderMember(Member orderMember) {
		this.orderMember = orderMember;
	}

	public Item getOrderItem() {
		return orderItem;
	}

	public void setOrderItem(Item orderItem) {
		this.orderItem = orderItem;
	}

	public int getOrderQuantity() {
		return orderQuantity;
	}

	public void setOrderQuantity(int orderQuantity) {
		this.orderQuantity = orderQuantity;
	}

	public int getOrderPrice() {
		return orderPrice;
	}

	public void setOrderPrice(int orderPrice) {
		this.orderPrice = orderPrice;
	}

	public void orderShow() {
//		System.out.println("회원 이름 : " + this.getOrderMember().getMemberName());
//		System.out.println("회원 주소 : " + this.getOrderMember().getMemberAddress());
//		System.out.println("주문한 상품 모델명 : " + this.getOrderItem().getItemName());
//		System.out.println("주문한 상품 가격 : " + this.getOrderItem().getItemPrice() + "원");
//		System.out.println("주문수량 : " + this.getOrderQuantity() + "개");
//		System.out.println("주문금액 : " + this.getOrderPrice() + "원");

		System.out.println("회원 이름 : " + orderMember.getMemberName());
		System.out.println("회원 주소 : " + orderMember.getMemberAddress());
		System.out.println("주문한 상품 모델명 : " + orderItem.getItemName());
		System.out.println("주문한 상품 가격 : " + orderItem.getItemPrice() + "원");
		System.out.println("주문수량 : " + orderQuantity + "개");
		System.out.println("주문금액 : " + orderPrice + "원");

	}

}
