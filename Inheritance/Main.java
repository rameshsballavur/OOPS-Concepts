class Super{     //parent class / base class / Super class

	final int a = 10;  // final variable can be inherited but cannot re-initialize the variable 

	public void car(){  
		System.out.println("car() method of super class : car -->RollsRoyce");
	}

	public void test(){
		System.out.println("This is test() method of super class ");
	}

	public final void test2(){  // final method can be inherited but final method cannot be overriden
		System.out.println("this is test2() method of super class");
	}
}

class SubClass extends Super{   //subclass / derived class / child class

	public void bike(){
		System.out.println("Bike() method of subclass : Bike --> Pulsar NS 200");
	}
}

class Main{
	public static void main(String[] args) {
		// by using super class object we can access only super class properties
	    // Superclass s1=new Superclass();
		//s1.bike();
		// s1.car();
//---------------------------------
		// by using sub class object ref we can access both sub and super class propertis
		SubClass s1 = new SubClass();
		s1.car();
		s1.bike();
		s1.test();
		s1.test2();
		System.out.println("a = "+s1.a);
	}
}