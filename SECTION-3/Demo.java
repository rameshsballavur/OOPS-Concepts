package com.java.numbers;

class InvalidAgeException extends Exception{
	public InvalidAgeException(String str) {
		super(str);
	}
}

public class Demo {
	public static void validate(int age) throws InvalidAgeException{
		if(age<18) {
			throw new InvalidAgeException("Age is not valid to vote");
		}
		else {
			System.out.println("welcome to voting");
		}
	}
	
	public static void main(String[] args) {
		try {
			validate(23);
			System.out.println("=========================");
			validate(13);
			validate(40);
		} catch (InvalidAgeException e) {
			System.out.println("Exception occured "+e);
		}
		System.out.println("Rest of the code......");
	}
}
