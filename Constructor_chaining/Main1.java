// class object{                /* Daimond Problem */

// }
class Super1{

	public void test(){
		System.out.println("testkjaks");
	}
}
class Super2{

	public void test(){
		System.out.print("test");
	}
}
class SubClass extends Super1,Super2{  // multiple inheritance is not possible in java

	public SubClass(){
		super();       // cant be created multiple super() statement
		System.out.println("subclass constructor");
	}
}
class Main1{
	public static void main(String[] args) {
		SubClass sb = new SubClass();
		sb.test();  // compiler gets confused to call which method with same name & same argument
		             //  present super class in 2 super classes

	}
}