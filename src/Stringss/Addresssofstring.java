package Stringss;

public class Addresssofstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1="chercher tech";
		String str2="chercher tech";
		
		// get the address of the strings
		
		System.out.println("Adrress of the string is :"   +   System.identityHashCode(str2));
		System.out.println("Adrress of the string is :"   +   System.identityHashCode(str1));
		
		String str3 = new String("Selenium-webdriver.com");
		String str4 = new String("Selenium-webdriver.com");
		// get the address of the strings
		System.out.println("Address of the str3 : "+System.identityHashCode(str3));
		System.out.println("Address of the str4 : "+System.identityHashCode(str4));
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
