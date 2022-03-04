class Account{
	String name;
	String type;
	long accno;
	String branch;
	double bal;
	int num;

	 String bankname="Kotak";

	public Account(String name,String type,long accno,String branch)  //Constructor
	{

		this.name= name;
		this.type=type;
		this.accno=accno;
		this.branch=branch;
	}

	public void showBankName(){
		String bankname="canara";
		System.out.println(this.bankname);
	}
	public void showAccountDetails(){
		System.out.println(name);
		System.out.println(type);
		System.out.println(accno);
		System.out.println(branch);
	}

	public void deposit(double amt){
		bal=bal+amt;
		System.out.println("Deposit : "+bal);
	}

	public void withdraw(double amt){
		
		System.out.println("Withdraw : "+amt);
	}

	public void balance(double amt){
		bal=bal-amt;
		System.out.println("Balance : "+bal);
	}

	public static void main(String[] args) {
		Account a1 = new Account ("Ramesh","Savings",560008,"Basavanagudi");
		a1.showBankName();
		a1.showAccountDetails();
		a1.deposit(1000);
		a1.withdraw(50);
		a1.balance(50);
		System.out.println("=============================");

		Account a2 = new Account("rsb","current",98374923,"bgk");
		a2.showBankName();
		a2.showAccountDetails();
		a2.deposit(1008);
		a2.withdraw(50);
		a2.balance(50);



	}
}