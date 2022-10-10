package collection.practice;

import java.util.Iterator;
import java.util.TreeSet;

public class Treesetcollection {

	
	void treesetsorted()
	{
		TreeSet <String> set = new TreeSet <String>();
		
		set.add("ravi");
		set.add("raj");
		set.add("arti");
		set.add("ram");
		set.add("ravi");
		
		Iterator <String>  itr= set.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
			
	}
	public static void main(String[] args) {
		
		Treesetcollection obj= new Treesetcollection();
		obj.treesetsorted();
	}
}                
