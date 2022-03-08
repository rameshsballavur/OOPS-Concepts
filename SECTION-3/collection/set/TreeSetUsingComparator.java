package collection.set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class Order implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		return o2.length()-o1.length();
	}
	
}

public class TreeSetUsingComparator {
	
	public static void main(String[] args) {
		Order o = new Order();
		TreeSet<String> ts = new TreeSet<String>(o);
		
		ts.add("YY");
		ts.add("LLE");
		ts.add("AAAaa");
		ts.add("CCCC");
		ts.add("SNDN");
		ts.add("QPDFSKDH");
		
		System.out.println(ts);
		
		Iterator<String> itr = ts.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
	
}
