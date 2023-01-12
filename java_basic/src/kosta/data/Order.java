package kosta.data;

public class Order extends Food{
	private int amount;
	public Order() {}

	public Order(Food food, int amount) {
		super(food.getFoodName(), food.getPrice());
		this.amount = amount;
	}

	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
}
