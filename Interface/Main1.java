interface Run{  //Super Interface

	public void test();
	
}

class Sample implements Run{   // implementation class	
	public void test(){
		System.out.println("test method overriden of Super interface");
	}
}

class Main1{
	public static void main(String[] args) {
		Sample s1 = new Sample();
		s1.test();
		Run r1; // we can create only reference variable of interface  but not object
	}
}