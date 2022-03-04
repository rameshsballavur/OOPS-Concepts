// Static-members of the same class
//       -->we can access the static-members present in the same class just by using member-name

class Demo{

	static int a =10; //static-data-member

	public static void test()  //static-function-member
	{
		System.out.println("this is test() of the demo class");
		System.out.println(a);
	}

	public static void main(String[] args) {      // static-function-member

		int res = a*5;
		System.out.println(res);
		test();
		
	}
}



	