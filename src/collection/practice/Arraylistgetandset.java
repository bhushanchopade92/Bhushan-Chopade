package collection.practice;

import java.util.ArrayList;

public class Arraylistgetandset {
	
	
	void getandsetarraylist()
	{
		
		ArrayList <String> li = new ArrayList <String>();
		
		li.add("mango");
		li.add("apple");
		li.add("pineapple");
		li.add("banana");
		li.add("berry");
		
		//accessing the element
		
		System.out.println("returning element:  "+  li.get(2));
		
		//changing the element
		
		li.set(3,"dates");
		
		//traversing list
		
		for(String fruit: li)
		{
			
			System.out.println(fruit);
		}
			
	}
            public static void main(String[] args) {
				
            	Arraylistgetandset obj= new Arraylistgetandset();
            	obj.getandsetarraylist();
			}
}
