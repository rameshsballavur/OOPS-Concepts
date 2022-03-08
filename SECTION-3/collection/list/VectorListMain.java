package collection.list;

import java.util.Collections;
import java.util.Vector;

public class VectorListMain {

	public static void main(String[] args) {
		
		Vector<Integer> list = new Vector<Integer>(15);
		
		list.add(10);
		list.add(1);
		list.add(5);
		list.add(6);
		list.add(9);
		list.add(40);
		list.add(95);
		list.add(65);
		list.add(13);
		list.add(46);
		
		System.out.println(list);// printing the added elements
		System.out.println("-------------");
		System.out.println("list travrsing through for loop");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
		System.out.println("--------------");
		System.out.println("list traversing through for each loop");
		
		for(Integer i1 : list) {
			System.out.print(i1+" ");
		}
		System.out.println();
		System.out.println("-------------------");
		
		System.out.println("first element is : "+list.firstElement());
		System.out.println("last element is : "+list.lastElement());
		Collections.sort(list);
		System.out.println(list);
		
		
	}

}
