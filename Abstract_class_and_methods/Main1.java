abstract class User{

	public void login(){  // generalized concrete method
		System.out.println("email");
		System.out.println("Password");
	}

	public abstract void logout(); //generalized abstract method
}

class Customer extends User{

	@Override
	public void logout(){
		System.out.println("button for Customer logout");
	}
}

class Employee extends User{
	@Override
	public void logout(){
		System.out.println("thumb for Employee logout");
	}
}

class Main1{
	public static void main(String[] args) {
		Customer c = new Customer();
		c.login();
		c.logout();

		System.out.println("---------------------------");

		Employee e = new Employee();
		e.login();
		e.logout();
	}
}