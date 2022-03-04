
//we can access non-static-members present in the same class in a static method 
//                                                        - by creating an object of the class

/* class Sample{
	int a = 4875;

	public void test(){
		System.out.println("this is test() method of Sample class");
	}

	public static void main(String[] args) {
		System.out.println(new Sample().a *5);
		new Sample().test();
	}
}*/


// we can access non-static-members present in the same class in non-static-method 
//                                                              - just by using the member-name

class Sample {
	int a = 2342;   
	static int b=324;                   //non-static-data-member

	public void test(){                 //non-static-function-member
		System.out.println("this the test() of Sample class");

	}

	public void display(){              //non-static-function-member
		System.out.println(a);
		test();
		System.out.println(b);
	}

	public static void main(String[] args){        //function-member
		new Sample().display();
	}
}