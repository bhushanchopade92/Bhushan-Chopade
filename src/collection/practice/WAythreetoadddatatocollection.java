package collection.practice;

import java.util.ArrayList;
import java.util.List;

public class WAythreetoadddatatocollection {

	
	
	void waythreedatacollection()
	{
		
		List<String> name = new  ArrayList <String> ();
		
		name.add("jay");
		name.add("viru");
		name.add("swati");
		name.add("naman");
		name.add("jay");
		
		int i=0;
		int k= name.size();
		
		while(i<k)
		{
			
			
			System.out.println(name.get(i));
			i++;
		}
		
		
	}
	
	
	public static void main(String[] args) {
		
		WAythreetoadddatatocollection obj= new WAythreetoadddatatocollection();
		obj.waythreedatacollection();
		
	}
}



