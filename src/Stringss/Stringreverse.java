package Stringss;

public class Stringreverse {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str="text data";
		
		String revstr="";
		
		for(int i=str.length()-1;i>=0;i--)
			
		{
			
			revstr= revstr+ str.charAt(i);
		}
		
		System.out.println("original string: "+ str);
		
		System.out.println("reverse of given string: " + revstr);
		
		
		
		
	}


}
