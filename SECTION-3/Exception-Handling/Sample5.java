package com.exceptionHandling.assignment;

class SuperClass{
	
}
 class Sub1 extends SuperClass{
	
}
class Sub2 extends SuperClass{
	
}
public class Sample5 {
	
	public static void main(String[] args) {
		SuperClass sc = new Sub1();//upcasting
		
		Sub1 sb1 = (Sub1)sc;//downcasting 
		//Sub2 sb2 = (Sub2)sc; --> class ClassCastException occurs
		
		try {
			Sub2 sb2 = (Sub2)sc;
		}
		catch(ClassCastException e) {
			System.out.println("ClassCastException occured");
		}
	}
	

}
