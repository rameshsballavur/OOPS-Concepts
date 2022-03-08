package com.Canara.Account;

public class Transaction {
	public void deposit(Account a1, double amt) {
		double bal = a1.getBal();
		bal = bal+amt;
		a1.setBal(bal);
	}
}
