package Singleton;

public class Parent2 {

	
	private static Parent2 obj;
	
	String str;
	private Parent2()   {}
	
	int a=10;
	
	public static Parent2 getinstance()
	{
		if(obj==null)
		{
			obj=Parent2();
			
		}
		
		return obj;
		
		
	}
	
	
	
	
	
}
