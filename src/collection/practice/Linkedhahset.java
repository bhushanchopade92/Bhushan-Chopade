package collection.practice;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Linkedhahset {
	
	
	void linkedhashsetcollection()
	{
		
		LinkedHashSet <String> set = new LinkedHashSet <String> ();
		
		set.add("ravi");
		set.add("vijay");
		set.add("arti");
		set.add("ram");
		set.add("viru");
		
		Iterator <String> itr = set.iterator();
		while(itr.hasNext())
		{
			
			System.out.println(itr.next());
		}
		
		
		
	}
              public static void main(String[] args) {
			
            	  Linkedhahset obj = new Linkedhahset();
            	  obj.linkedhashsetcollection();
			}
}
