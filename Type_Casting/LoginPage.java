class User{

}

class Customer extends User{
	public void buyProduct(){
		System.out.println("Customer can buy the  product");
	}

	public void cancelProduct(){
		System.out.println("customer can cancel the product");
	}
}

class Admin extends User{
	public void addProduct(){
		System.out.println("admin can add the product");
	}

	public void removeProduct(){
		System.out.println("admin cam remove the product");
	}
}

class LoginPage{	

	public void login(User obj)   // obj= new Customer(); // obj = new Admin(); -> cupcasting
	{
		// Customer c = new Customer();
		//Object obj = c;

		if(obj instanceof Customer){
			Customer c1 = new Customer(); //--> Customer c1= (Customer)obj; ->downcasting
			c1.buyProduct();
			c1.cancelProduct();
		}
		else{
			Admin a1 = new Admin();  //--> Admin a1 = (Admin)obj; -> downcasting
			a1.addProduct();
			a1.removeProduct();
		}
	}
	public static void main(String[] args) {
		LoginPage l1 = new LoginPage();
		 Admin a = new Admin();
		 l1.login(a);
		 System.out.println("===============================");
		 Customer c  = new Customer();
		 l1.login(c);

	}
}