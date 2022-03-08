package com.exceptionHandling.assignment;

public class Sample4 {
	
	public static void test() throws ClassCastException{
		throw new ClassCastException();
	}
	public static void main(String[] args) {
		test();
	}
}
