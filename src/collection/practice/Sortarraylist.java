package collection.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sortarraylist {
	
	
	void sortarraylistjava()
	{
		
		List <String> list1 = new ArrayList <String>();
		
		list1.add("mango");
		list1.add("banana");
		list1.add("santra");
		list1.add("pineapple");
		 
		//sorting the lit
		
		Collections.sort(list1);
		
		//traversing the list hrough fo each loop
		
		for(String fruit: list1)
		{
			System.out.println(fruit);
		}
		
		//creating list of numbers
		
		List <Integer> list2 = new ArrayList <Integer>();
		
		list2.add(1);
		list2.add(25);
		list2.add(14);
		list2.add(32);
		
		//sorting the list
		
		Collections.sort(list2);
		
		//traversing the list hrough fo each loop
		
		for(Integer number : list2)
		{
			System.out.println(number);
		}
		
		
	}
                 public static void main(String[] args) {
					
                	 Sortarraylist obj = new Sortarraylist();
                	 obj.sortarraylistjava();
				}
}
