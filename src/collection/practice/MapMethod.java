package collection.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapMethod {

	void mapmethod() {

		Map mapobj= new HashMap();
		
		//adding data to hahmap
		
		mapobj.put(1, "Pune");
		mapobj.put(2, "Palghar");
		mapobj.put(3, "mulshi");
		mapobj.put(1, "Panvel");
		mapobj.put(5, "Satara");
		mapobj.put(6, "Mumbai");
		
		System.out.println(mapobj);	 // if index is same it will present latest index value 
		
		
		List<String>  city=  new ArrayList <String>();
		
		city.add("Sydney");
		city.add("chicago");
		
		//System.out.println(city);
		
	}
public static void main(String[] args) {
	// TODO Auto-generated method stub   
	MapMethod obj= new MapMethod();
	obj.mapmethod();
		
}
}