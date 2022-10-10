package collection.practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collectionreaddata {
	
	
	void wayonetoreaddata()
	{
		List<String> name= new ArrayList<String>();
		
		name.add("sawti");
		name.add("suhas");
		name.add("raj");
		name.add("jay");
		
	// we will read data and store information into object of iteratormethod	
		
		Iterator itr= name.iterator();
		
		while(itr.hasNext())
			
		{
			System.out.println(itr.next());
			
		}
	}
                      public static void main(String[] args) {
						
                    	  Collectionreaddata obj = new Collectionreaddata();
                    	  obj.wayonetoreaddata();
                    	  
                    	  
					}
}
