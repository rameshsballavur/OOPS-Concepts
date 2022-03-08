package com.jsp.ObjectClass;

public class Sample {
	
	@Override
	public int hashCode() {
		return 1110;
	}
	
	@Override
	public String toString() {
		return "String method overriden";
	}
	
	public static void main(String[] args) {
		
		Sample s1 = new Sample();
		
		int h1 = s1.hashCode();
		System.out.println(h1);
		
		Sample s2 = new Sample();
		
		int h2 = s2.hashCode();
		System.out.println(h2);
		
		String str = s1.toString();
		System.out.println(str);
		System.out.println(s2);// it will call the toString() method of object class
		
		boolean b1 = s1.equals(s2); //it always compares the hashcode not the  string or value
		System.out.println(b1);
		
	}

}
