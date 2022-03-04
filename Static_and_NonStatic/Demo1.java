
//we can access a static-member present in the  differnt class by using className.member-name 
class Demo
{

   static int a = 5; //static-data-member

   public static void test() // static-function-member
	{
		System.out.println("this is a test() of demo class");
	}
}

class Demo1{
	public static void main(String[] args) 
	{   //function member

		int res = Demo.a *5;
		System.out.println(res);
		Demo.test();
	}
}


