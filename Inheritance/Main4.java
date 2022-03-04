abstract class Facebookuser// genralized class
{
	public abstract void login();
	public abstract void logout();
	public abstract void forgotPassword();

	
}
class Web extends Facebookuser  //specialized class
{
	@Override
	public void login()
	{
		System.out.println("user login");
	}
	// @Override
	public void logout(){
		System.out.println("user logout");
	}
	public void sendOtp(){
		System.out.println("OTP method from web class");
	}
	// @Override
	public void forgotPassword(){
		System.out.println("change the password");
	}
	
}
class App extends Facebookuser
{
	// @Override
	public void login()
	{
		System.out.println("user login");
	}
	// @Override
	public void logout(){
		System.out.println("user logout");
	}
	//@Override
	public void forgotPassword(){
		System.out.println("change the password");
	}
	
}
class Main4
{
	public static void main(String[] args)
	{
		Web w1 =new Web();
		w1.login();
		w1.sendOtp();
		w1.logout();
		System.out.println("--------");
		App a1 = new App();
		a1.login();
		a1.logout();
		a1.forgotPassword();
	}
}