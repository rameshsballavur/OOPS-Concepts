
           //Version8Example.
interface Sample{
	public static void display(){
		System.out.println("static display method within interface sample");
	}

	public default void test(){
		System.out.println("non-static test method within interface sample");
	}
}

interface Run1 {
	public static void display(){
		System.out.println("static display method within interface Run1");
	}

	public default void test(){
		System.out.println("non-static test method within the interface Run1");
	}
}

class Demo implements Sample,Run1{
	@Override              // when you have same method name and argument in two interfaces 
	                               //must and should have to override to execute
	public void test(){
		System.out.println("non-static test method overriden in demo class");
	}
}

class Main5{
	public static void main(String[] args) {
		Demo d = new Demo();
		d.test();
		Sample.display();
		Run1.display();
		
	}
}