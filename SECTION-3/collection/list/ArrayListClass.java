package collection.list;

import java.util.ArrayList;



public class ArrayListClass {
	public static void main(String[] args) {
		ArrayList<Object>list=new ArrayList<Object>();
		list.add(10);
		list.add(null);
		list.add(5);
		list.add("dfhisudh");
		list.add("dfks");
		list.add(null);
		list.add(95);
		list.add("djsfoi");
		list.add(13);
		list.add(46);//append the specified element to the end of the list
		
		list.add(3, 100); //insert the element at the specified position, if the index is greater than list size or negative 
                            //- it throws IndexOutOfBoundException
		
	//	list.addAll(list); --> add all the elements once again to end of the list
		
	//	list.addAll(3, list); --> to append all the elements starting  at specified index(position)
		
		System.out.println(list.contains(0));// it returns true if the list contains an specified element
		
	//	list.clear(); //to remove all the elements from the list
		
		System.out.println(list.get(2));// get a element from particular index
		
		System.out.println(list.isEmpty()); // return true if the list is empty
		
	//	System.out.println(list.lastIndexOf(list)); // to get the last index of list
		
		System.out.println(list);// printing the added elements
		
		System.out.println("------------------------------------");
		System.out.println("list travrsing through for loop"+"\n");
	
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
		System.out.println("------------------------------------------");
		System.out.println("list traversing through for each loop"+"\n");
		
		for(Object i1 : list) {
			System.out.print(i1+" ");
		}
		System.out.println();
		
	}
	
	
}