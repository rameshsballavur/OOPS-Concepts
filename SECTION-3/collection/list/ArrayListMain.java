package collection.list;

import java.util.ArrayList;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.Vector;

public class ArrayListMain {

	public static void main(String[] args) 
	{
		ArrayList<Object> list = new ArrayList<Object>();
		list.add(17);
		list.add(9);
		list.add(20);
		list.add(27);
		list.add(1);
		list.add(1);//append the specified element to the end of the list
		
		//list.add(3, 100); //insert the element at the specified position, if the index is greater than list size or negative 
		                                          //- it throws IndexOutOfBoundException
		
		list.addAll(list);		
		System.out.println(list.contains(0));//
		
		System.out.println("Array List collection property : "+list);
		TreeSet<Object> ts = new TreeSet<Object>(list);
		ts.add(34);
		ts.add(98);
		ts.add(5);
		
		System.out.println("applied TreeSet collection property : "+ts);
		Vector<Object> vlist = new Vector<Object>(ts);
		vlist.add(87);
		vlist.add(13);
		vlist.add(19);
		vlist.add(null);
		vlist.add(null);
		System.out.println("applied vector collection property : "+vlist);
		
		HashSet<Object> hs = new HashSet<Object>(vlist);
		System.out.println("applied hashset collection proerty : "+hs);
		
		//retrieving the data using Iterator 
		Iterator<Object> itr =hs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		
		
		
		
	
		
	}
}
