package collection.practice;

import java.util.ArrayList;
import java.util.List;

public class Collectionwaytworeaddata {
	
	
	
	void waytwotoreaddata()
	{
		
		List <String> name = new ArrayList<String>();
		
		name.add("jay");
		name.add("swati");
		name.add("viru");
		name.add("vinu");
		
		//size method will retutn number of element present in colllecion
		
	//	System.out.println.(size));
		
		for(int i=0; i<name.size(); i++)
		{
			
			System.out.println(name.get(i));
		}
		
	}
             public static void main(String[] args) {
            	 
            	 Collectionwaytworeaddata obj= new Collectionwaytworeaddata();
            	 obj.waytwotoreaddata();
				
			}
}
