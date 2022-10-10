package Stringss;

public class StartsWith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1= "Enjoy";
		String str2="The party";
		
		System.out.println("string starts with en: " +   str1.startsWith("En"));
		System.out.println("String statrts with The "+    str2.startsWith("The"));
		//ends with
		System.out.println("string ends with en: "  + str1.endsWith("joy"));
		
		//contains

		System.out.println("String contains nj :"+  str1.contains("nj"));
		
		//Equals
		
		System.out.println("Equals:  "+   str1.endsWith(str2));
		System.out.println("Equals:"   +     str1.equals("Enjoy")  );
	}

}
