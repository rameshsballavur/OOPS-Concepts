package com.Canara.Account;

public class Main {
	
	
	public static void main(String[] args) {
		Account a1 = new Account();
		Transaction t = new Transaction();
		t.deposit(a1, 2500);
		System.out.println(a1.getBal());
	}
}
