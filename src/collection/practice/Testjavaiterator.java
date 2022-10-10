package collection.practice;

import java.util.Iterator;
import java.util.LinkedList;

public class Testjavaiterator {
	
	void waytoreaddata()
	{
		
		LinkedList<String> al=new LinkedList<String>(); 
		
		al.add("Ravi");  
		al.add("Vijay");  
		al.add("Ravi");  
		al.add("Ajay");
		
		Iterator <String> itr= al.iterator();
		
		while(itr.hasNext())
		{
		   System.out.println(itr.next());	
		}
		}
			
		public static void main(String[] args) {
			
			Testjavaiterator obj = new Testjavaiterator();
			obj.waytoreaddata();
		}
		
	}

