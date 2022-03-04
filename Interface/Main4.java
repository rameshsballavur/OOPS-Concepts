interface Run{

	// from jdk 8 onward concrete methods also valid here
	public static void test(){  // static concrete method  // Overriding is not possible
		System.out.println("static test method");
	}

	public default void test1(){  //non static concrete method // overriding is optional
		System.out.println("non-static test1 method");
	}

	public void count();  // abstract method
}

class Sample implements Run{  
	@Override
	public void count(){   //overriding is mandatory because count is abstract
		System.out.println("Overriden count");
	}
}

class Main4{
	public static void main(String[] args) {
		Sample s1 = new Sample();
		s1.count();
		Run.test(); // to access static member we need to use interfaceName.MemberName
		s1.test1(); // non-static concrete method can be accessed by creating object of subclass only 
	}
}
