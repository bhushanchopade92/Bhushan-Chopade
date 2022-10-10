package collection.practice;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class CollectionDemo {
	
	void listmethod()
	{
		
		//List <FULL DATA TYPE>  Variablename= new typeoflist <full data type>();
		
		List <Integer> li= new ArrayList <Integer>();
		
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(50);
		li.add(30);
		
		for(int i :li)
		{
			
			System.out.println(i);
		}
		
	}
     void Setmethod()
     {
    	Set <String> city = new HashSet<String>();
    	
    	city.add("pune");
    	city.add("nagpur");
    	city.add("pune");
    	city.add("mumbai");
    			
    	for(String s  :city)
    	{
    		
    		System.out.println(s);
    	}
     
     }
     
     public static void main(String[] args) {
    	 CollectionDemo obj = new CollectionDemo();
    	 obj.listmethod();
    	 obj.Setmethod();
    	 
	}
}
