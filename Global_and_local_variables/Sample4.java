/* 1) IF the method is static we cannot use "this" keyword.

   2) global non-static variable and local variable from static method can be
       differentiated by "creating new object".
*/

 class Sample4{
 	int a ;   //global variable

 	public static void test(){    //static function member
 		int a=5;  // local variable
 		System.out.println(a);  //calling local variable
 		System.out.println(new Sample4().a); //calling global variable and we can't use "this" keyword here
 	}

 	public static void main(String[] args) {
 		
 		test();
 	}
 }