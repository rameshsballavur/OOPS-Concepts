package com.exceptionHandling.assignment;
public class Sample1 {
	public static void test(int num) {
		try {
			int res=100/num;
			System.out.println(res);
		}
		catch(Exception e) {
			System.out.println("invalid input");
		}
		finally {
			try {
				int[] arr = {1,2,3,4,5,6,7};
				System.out.println(arr[8]);
			}
			catch (Exception e) {
				System.out.println("invalid index");
			}
		}
	}
	public static void main(String[] args) {
		test(10);
		test(0);
		test(20);
	}

}
