package com.Kotak.Account;

public class Transaction {
	public void deposit(Account a1,double amt) {
		if(amt>0) {
			double bal=a1.getBal();
			bal=bal+amt;
			a1.setBal(bal);
		}else {
			System.out.println("invalid transaction");
		}
		
	}
	
	public void withdraw(Account a1, double amt) {
		if(amt>0) {
			double bal=a1.getBal();
			bal=bal-amt;
			a1.setBal(bal);
		}else {
			System.out.println("invlalid transaction");
		}
	}
	
	public void showBalance(Account a1) {
		System.out.println(a1.getBal());
	}
}
