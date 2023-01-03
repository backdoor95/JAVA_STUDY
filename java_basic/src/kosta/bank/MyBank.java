package kosta.bank;

public class MyBank {
	private Customer customers[];
	private int customersNum;

	public MyBank() {
		customers = new Customer[100];// 최대 100명의 사람 저장가능
	}// default 생성자

	public Customer getCustomer(String id) {

//		int idx=0;
//		for(int i=0;i<customersNum;i++)// 내 풀이
//		{
//			if(customers[i].getId().equals(id))// ==가 아니라 equal로 해야한다.
//			{
//				idx=i;
//				break;
//			}
//			
//		}
//		return customers[idx];
		Customer cust = null; // 강사님 풀이
		for (int i = 0; i < customersNum; i++) {
			if (customers[i].getId().equals(id)) {
				cust = customers[i];
				break;
			}
		}

		return cust;
	}

//	public Customer[] getAllCustomers() {
//		return customers;
//	}

	public Customer[] getAllCustomers() {
		Customer newCustomers[] = new Customer[customersNum];
//		for (int i = 0; i < customersNum; i++) {
//			newCustomers[i] = customers[i];
//		}
		System.arraycopy(customers, 0, newCustomers, 0, customersNum);// API 를 사용해서 for문을 이용해서 배열을 복사할수있다.

		return newCustomers;
	}

	public void setCustomers(Customer[] customers) {
		this.customers = customers;
	}

	public int getCustomersNum() {
		return customersNum;
	}

	public void setCustomersNum(int customersNum) {
		this.customersNum = customersNum;
	}

	public void addCustomer(String ID, String name, long balance) {
		customers[customersNum++] = new Customer(ID, name, balance);

	}

}
