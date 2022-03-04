class User{
	int uid = 123;
	String name="Ramesh";
	String email = "abc@yahoo.com";
	String password= "ram123";
	long mob=987654321;

	static String country= "India";

	public static void showUserCountry(){
		System.out.println(country);
	}

	public void updateUserEmail(String NewEmail){
		email=NewEmail;
	}

	public void userDetails(){
		System.out.println("User-id  : "+uid);
		System.out.println("Name     : "+name);
		System.out.println("Email-id : "+email);
		System.out.println("Password : "+password);
		System.out.println("Mobile   : "+mob);
		System.out.println("Country  : "+country);

	}
}

class MainClass3{
	public static void main(String[] args) {    //Function-member
		User.showUserCountry();     //static-function-member-User
		
		User ref1;     //reference-variable

		ref1=new User(); // create the object & store the address in ref1 variable

		ref1.userDetails();  //no-static-fm-user

		System.out.println("ref1 : "+ref1);

		ref1.updateUserEmail("rameshsb7619@gmail.com");

		ref1.userDetails();  //non-static-fm-user
		
	}
}