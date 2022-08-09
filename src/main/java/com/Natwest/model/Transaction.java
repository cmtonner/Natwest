package com.Natwest.model;

public class Transaction {

	private int accountNumberSource = 0;
	private int accountNumberDestination = 0;
	private double amount = 0.00;

	public Transaction() {}
	
	public Transaction(int accountNumberSource, int accountNumberDestination, double amount) {
		this.accountNumberSource = accountNumberSource;
		this.accountNumberDestination = accountNumberDestination;
		this.amount = amount;
	}

	public int getAccountNumberSource() {
		return accountNumberSource;
	}

	public void setAccountNumberSource(int accountNumberSource) {
		this.accountNumberSource = accountNumberSource;
	}

	public int getAccountNumberDestination() {
		return accountNumberDestination;
	}

	public void setAccountNumberDestination(int accountNumberDestination) {
		this.accountNumberDestination = accountNumberDestination;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
}
