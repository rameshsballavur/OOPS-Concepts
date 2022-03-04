class Employee{
	String name;
	String email;
	double salary;
	int experience;
	static String company="Amazon";

	public Employee(String name,String email,double salary,int experience){
		this.name=name;
		this.email=email;
		this.salary=salary;
		this.experience=experience;
	}
	public Employee(String name,String email,double salary){
		this.name=name;
		this.email=email;
		this.salary=salary;
	}
	public void showCompanyName(){
		System.out.println(company);
	}
	public void showEmployeeDetails(){
		System.out.println("Name : "+name);
		System.out.println("Email-id : "+email);
		System.out.println("salary : "+salary);
		System.out.println("Experience : "+experience);
	}
	public static void main(String[] args) {
		Employee e1 = new Employee("Ramesh","rameshsb7619@gmail.com",50000);
		e1.showCompanyName();
		e1.showEmployeeDetails();

		System.out.println("-------------------------------------------");

		Employee e2 = new Employee("xyz","xyz@gmail.com",45000,2);
		e2.showCompanyName();
		e2.showEmployeeDetails();	
	}
}
















