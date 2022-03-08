package com.Kotak.Account;

public class Account {
	private double bal;
	
	public double getBal() {
		return this.bal;
	}
	
	public void setBal(double bal) {
		if(bal>0) {
			this.bal=bal;
		}
		
	}
}
