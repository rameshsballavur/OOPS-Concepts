abstract class Sample {

	public abstract void display();

	public static void display1(){
		System.out.println("display1");
	}

	public  final void displayyy(){// --> final can be inherited but cannot be overriden
		System.out.println("displayyy");

	}
	// private abstract void display2(); --> not possible because private members cannot be inherited
}

class Demo extends Sample{
	@Override
	public void display(){
		System.out.println("display");
	}

	//@Override  --> static methods cannot be annotated with @Override
	public static void display1(){
		System.out.println("display1");
	}

	//@Override              /* final methods can be inherited but cannot be overriden */
	// public final void displayyy(){
	// 	System.out.println("displayyy");         
	// }
}

class Main3{
	public static void main(String[] args) {
		Demo d = new Demo();
		d.display();
		d.display1();
		d.displayyy();

	}
}