class Sample1{
	
	static int a=10;   //global-variable

	public static void test(){
		int b=5;   // local-variable
		System.out.println("local variable : "+b); //calling the local variable
		System.out.println("global variable : "+a); //calling the global variable
	}

	public static void main(String[] args) {
		System.out.println("global variable : "+a);  //calling the local variable
	  //System.out.println(b); --> calling the local variable which is in another function member which is not accessible
		test();
	}
}