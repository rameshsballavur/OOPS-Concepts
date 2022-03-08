package collection.list.arraylist.employee;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;



public class MainClass  {
	
	static ArrayList<Employee> list = new ArrayList<Employee>();
	
	public static void test() {
		Employee e1 = new Employee(102,"ramesh",75000);
		Employee e2 = new Employee(103,"ravi",85000);
		Employee e3 = new Employee(101, "akash",65000);
		list.add(e1);
		list.add(e2);
		
		list.add(e3);
		
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		
	}
	
	public static void main(String[] args) {
		test();
		
		//System.out.println(list);
	}
	
}
