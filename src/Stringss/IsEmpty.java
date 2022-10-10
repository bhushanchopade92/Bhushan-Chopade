package Stringss;

public class IsEmpty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str1="   Enjoy the party     ";
		String str2="";
		
		System.out.println("If string is empty:"+   str1.isEmpty());
		
		System.out.println("If the string is empty: "+   str2.isEmpty());
		
		//replace method
		
		System.out.println("After replace:"+     str1.replace("Enjoy", "Dance"));
		
		
		//indexOf : this method returns the first index of the given substring or character.
		
		System.out.println("The index of nj:"+   str1.indexOf("nj"));
		
		
		//lower case to upper case
		System.out.println("Upper case:"+  str1.toUpperCase());
		
		//upper case to lower case
		
		System.out.println("Lowercase:   "+    str1.toLowerCase());
		
		//TRIM METHOD : Removes the white spaces
		
		System.out.println("length before trim"+   str1.length());
		
		System.out.println("Length after trim:  "+   str1.trim().length());
		
		
		
		
	}

}
