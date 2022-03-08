package collection.set;

import java.util.HashSet;

public class HashSetMain {

	public static void main(String[] args) {
		
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(1);
		hs.add(5);
		hs.add(1);
		hs.add(90);
		hs.add(47);
		hs.add(null);
		System.out.println(hs);
		
		System.out.println("----------------");
		
		System.out.println("Retrieving data using forEach method");
		hs.forEach(obj->System.out.print(obj+" "));
		System.out.println();
		
		System.out.println("-----------------");
		
		System.out.println("Retrieving data using for each loop");
		for(Object obj:hs) {
			System.out.print(obj+" ");
		}
	}

}
