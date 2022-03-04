/* 1)IF the global variable and local variable has same names 
      THEN within the method body 'preference' is always FOR the "LOCAL VARIABLE" 

   2)Global 'static' variable and local variable can be differentiated by using
      "class Name" with the global variable.
*/
class Sample2{
	static int a=28; //static-global variable
	public static void test(){  //static -member
		int a=7;  //local variable   --> local variable cannot be static
		System.out.println(a);  // calls local variable
		System.out.println(Sample2.a); // calls global variable using className.memberName 
		                               //   (IF the global and local variable  are same 
		                               //      THEN global variable is called using className.memberName
	}

	public static void main(String[] args) {
		test();
	}
}

