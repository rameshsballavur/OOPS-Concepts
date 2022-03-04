class Sample{
	public void test(){
		System.out.println("test method of super-class Sample");
	}
}

class Demo extends Sample{
	public void display(){
		System.out.println("display method of sub-class Demo ");
	}
}

class DerivedCasting{
	public static void main(String[] args) {
		Demo d1 = new Demo();  // d1 is subclass object ref
		Sample s1 = d1; //s1 is upcasted ref(upcasting)
		s1.test();
		// s1.display(); --> by using upcasted ref u can access only super class property
		System.out.println("===============================");

		// >> to access subclass property  we need to achieve down casting
		Demo d2 = (Demo) s1;
		d2.test();
		d2.display(); // d2 is a downcasted ref , we can call both sub and super class property
	}
}