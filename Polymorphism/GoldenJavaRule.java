class Sample{
	public void test(){
		System.out.println("test of sample"); /* step 2 : --> it is not going to print this method
		                          because super ref is calling this method declaration
		                          but method definition is overriden by sub-class method 
		                          definition so sub-class method definition 
                                  it is going to print */
	}
}

class Demo extends Sample{
	@Override
	public void test(){
		System.out.println("test of Demo sub-class");
	}
}

class GoldenJavaRule{
	public static void main(String[] args) {
		Sample s1 = new Demo(); 
		s1.test();  /* step 1 : --> using an upcasted reference if you call an overriden method then you
		                  always get the implementation of subclass */
	}
}