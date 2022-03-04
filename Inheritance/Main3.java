               

class Account {           // Hierarchical Inheritance
	long accno;
	double bal;
	String owner;
	String type;

	// public Account(String owner,long accno,double bal,String type){
	// 	this.accno= accno;
	// 	this.bal=bal;
	// 	this.owner=owner;
	// 	this.type=type;
	// }

	public void showUserDetails(){
		System.out.println(type);
		System.out.println("Owner Name : "+owner);
		System.out.println("Account no : "+accno);
		System.out.println("BALANCE : "+bal);
		
	}
	public void deposit(int amt){
		bal=bal+amt;
		System.out.println("total balance : "+bal);
	}

	public void withdraw(int amt){
		bal = bal-amt;
		System.out.println("current balance : "+bal);
	}

} 

class Savings extends Account{
	// long accno;
	// double bal;
	// String owner;
	// String type;

	double roi = 1.02555;
	public Savings(String owner,long accno,double bal,String type){
		this.accno= accno;
		this.bal=bal;
		this.owner=owner;
		this.type=type;
	}

	public void calculateRoi(){
		bal = bal*roi;
		System.out.println("Rate Of Interest :"+bal);
	}

 
}

class Current extends Account{
	double min_bal = 2000.00;
	public Current(String owner,long accno,double bal,String type){
		this.accno= accno;
		this.bal=bal;
		this.owner=owner;
		this.type= type;
	}

	public void showMinBalance()
	{
		System.out.println("Minimum Balance : "+min_bal);
	}
}

class Main3{
	public static void main(String[] args) {
		Savings s1 = new Savings("abc",9792374l,2000000,"-------- SAVINGS Account-------");
		s1.showUserDetails();
		s1.deposit(80000);
		s1.withdraw(20000);
		s1.calculateRoi();
	    System.out.println("==========================================================");
	    Current c1 = new Current("xyz",45452l,3000000,"-------- CURRENT Account-------");
	    c1.showUserDetails();
	    c1.deposit(50000);
	    c1.withdraw(25000);
	    c1.showMinBalance();
	}
}