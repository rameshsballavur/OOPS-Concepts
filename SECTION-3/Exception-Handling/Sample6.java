package com.exceptionHandling.assignment;

public class Sample6 {
	
	public static void test(String str) {
		try {
			//String str = "Ramesh";
			
			System.out.println(str.charAt(6));
			//System.out.println(str.charAt(4));
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("StringIndexOutOfBoundsException occured");
		}
		finally {
		
		}
	}
	
	public static void main(String[] args) {
		test("Ramesh");
		test("sdfkhskksjd");
	}

}
