package com.exceptionHandling.assignment;

public class Sample3 {
	public static void test() throws ArithmeticException {
		
		throw new ArithmeticException();
	}
	public static void main(String[] args) {
		test();
	}
}
