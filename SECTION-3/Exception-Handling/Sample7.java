package com.exceptionHandling.assignment;

public class Sample7 {
	
	public static void test(int n) {

		System.out.println(n);
		
	}
	
	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,5};
		try {
		test(arr[5]);
		}
		catch (Exception e) {
			System.out.println("exception occured");
		}
		test(arr[3]);
	}
}
