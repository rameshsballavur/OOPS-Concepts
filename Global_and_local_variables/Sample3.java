/* Global non-static variable and local variable from non-static method
   can be differentiated by using "this" keyword with the global-variable
*/

class Sample3{ 
	int a;  //non-static globla variable
	public  void test(){   // non-static -function member
		int a=7;   //local variable
		System.out.println(a);  //calling local variable
		System.out.println(this.a); /*calling global variable using "this" keyword and
		                               "this" keyword can be used only in non-static function member.
                                     */
	}
	public static void main(String[] args) {
		new Sample3().test(); 


	}
}