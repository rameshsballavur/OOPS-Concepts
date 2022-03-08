package collection.set;

import java.util.Iterator;
import java.util.LinkedHashSet;



public class LinkedHashSetMain {
	
	
	public static void main(String[] args)
	{
		LinkedHashSet<Object> lhs = new LinkedHashSet<Object>();
		
		lhs.add(10);
		lhs.add("abc");
		lhs.add(10);
		lhs.add(54);
		lhs.add(null);
		lhs.add(null);//not allowed more than one null value
		
		Iterator<Object>itr=lhs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}
}
