package com.cd.bankproject;

public class BankAccount {
	private String name;
	private String  Address;
	private String Type;
	private float Balance;
	private int no_of_transaction;
	private String account_number;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	public float getBalance() {
		return Balance;
	}
	public void setBalance(float balance) {
		Balance = balance;
	}
	public int getNo_of_transaction() {
		return no_of_transaction;
	}
	public void setNo_of_transaction(int no_of_transaction) {
		this.no_of_transaction = no_of_transaction;
	}
	public String getAccount_number() {
		return account_number;
	}
	public void setAccount_number(String account_number) {
		this.account_number = account_number;
	}
	@Override
	public String toString() {
		return "BankAccount [name=" + name + ", Address=" + Address + ", Type=" + Type + ", Balance=" + Balance
				+ ", no_of_transaction=" + no_of_transaction + ", account_number=" + account_number + "]";
	}
	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	


}
