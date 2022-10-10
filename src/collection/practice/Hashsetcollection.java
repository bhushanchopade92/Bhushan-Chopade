package collection.practice;

import java.util.HashSet;
import java.util.Iterator;

public class Hashsetcollection {
	
	
	void testjavacollection()
	{
		
		//creating hashset and adding elements
		
		HashSet <String> set = new HashSet <String> ();
		
		set.add("ravi");
		set.add("vijay");
		set.add("jay");
		set.add("harish");
		set.add("kunal");
		
		//traversing elememts
		
		Iterator itr= set.iterator();
		while(itr.hasNext())
		{
			
			System.out.println(itr.next());
		}
		
	}
             public static void main(String[] args) {
            	 
            	 Hashsetcollection obj = new Hashsetcollection();
            	 obj.testjavacollection();
				
			}
}
