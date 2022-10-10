package JAVAPROGRAMS;

import java.util.Scanner;

public class FindOddEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in); 
		System.out.println("Enter a number: ");
		
		int inputNumber = sc.nextInt();
		findNumber(inputNumber);
	}
	public static void findNumber(int number)
	
	{ 
		if(number%2!=0)
		{ 
			System.out.println("Number is odd");
	}
		
	
	else 
	{
	System.out.println("Number is even");
		
	}

}
}