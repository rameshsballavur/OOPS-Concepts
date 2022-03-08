package com.Kotak.Account;

public class Main {

	public static void main(String[] args) {
		Transaction t = new Transaction();
		Account ac = new Account();
		t.deposit(ac,500);
		t.showBalance(ac);
		t.withdraw(ac, 200);
		t.showBalance(ac);

	}

}
