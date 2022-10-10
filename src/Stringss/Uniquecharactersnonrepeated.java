package Stringss;

import java.util.Scanner;

public class Uniquecharactersnonrepeated {

	public static void main(String[] args) {
		
		
		{
	        int max_count = 0;
	        char max_char=Character.MIN_VALUE;
	        System.out.println("Java program to find non Repeating Characters");
	        Scanner sc = new Scanner (System.in);
	        System.out.println ("Please enter a String");
	        String str = sc.nextLine(); 
	        int[] arr = new int[256];
	        for(int i = 0; i < str.length(); i++){
	            arr[str.charAt(i)]++; 
	        }
	        for(int i = 0; i < arr.length; i++)
	        {System.out.println ("Non Repeating characters are" + arr[i]);
	        	
	        }
	        System.out.println ("Non Repeating characters are");
	        for (int i = 0; i < 256; i++)
	        {
	            if (arr[i] == 1)
	            {
	                System.out.println((char)i);
	            }
		
		
		
		
		
	}
		}
}
}