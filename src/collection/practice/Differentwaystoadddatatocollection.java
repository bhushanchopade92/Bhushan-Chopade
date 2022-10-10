package collection.practice;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Differentwaystoadddatatocollection {
	
	void wayonetoadddata()
	{
		
		List <String>name= new ArrayList<String> ();
		
		name.add("suhas");
        name.add("balaji");
        name.add("pawan");
        name.add("swati");
		
		
		ArrayList <Integer> age= new ArrayList<Integer>();
		
		age.add(20);
		age.add(30);
		
		
		
	}
	void waytwotoadddata()
	{
		
		ArrayList <String> city= new ArrayList<String>();
	
				city.add("Pune");
				city.add("mumbai");
				city.add("nagpur");
				
				System.out.println(city);
				
}
	
	void waythreetoadddata()
	{
		
		ArrayList <String> animal = new ArrayList(Arrays.asList("dog","cat","lion","tiger"));		
	}
	
	public static void main(String[] args) {
		
		Differentwaystoadddatatocollection obj= new Differentwaystoadddatatocollection();
		obj.wayonetoadddata();
		//obj.waytwotoadddata();
		obj.waythreetoadddata();
	}
	
}