class User{
	int uid;
	String name;
	String email;
	String password;
	long mob;

	static String country = "INDIA";

	public static void showUserCountry(){
		System.out.println(country);
	}

	public void updateUserEmail(String NewEmail){
		email = NewEmail;
	}

	public void userDetails(){
		System.out.println("User ID : "+uid);
		System.out.println("Name : "+name);
		System.out.println("Email-id : "+email);
		System.out.println("Password : "+password);
		System.out.println("Mobile : "+mob);
		System.out.println("Country : "+country);
	}
}

class MainClass2{
		public static void main(String[] args) {
		User.showUserCountry();
		new User().userDetails();
	}
}
