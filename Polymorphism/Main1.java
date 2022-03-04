class Sample{
	public void test(int a, int b){
		
		System.out.println(); /* step 2 : --> it is not going to print this method
		                          because super ref is calling this method declaration
		                          but method definition is overriden by sub-class method 
		                          definition so sub-class method definition 
                                  it is going to print */
	}
}
class Demo extends Sample{
	@Override
	public void test(int a, int b){
		int c = a+b;
		System.out.println(c);
	}
}
class Hide extends Sample{

	
}

class Main1{
	public static void main(String[] args) {
		Sample s1 = new Demo(); 
		s1.test(8,9);  /* step 1 : --> using an upcasted reference if you call an overriden method then you
		                  always get the implementation of subclass */
		// Sample s1 = new Sample();
		// s1.test();

	}
}