package JAVAPROGRAMS;

import java.util.Scanner;

public class ConvertToCelsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input temperature in Fahrenheit: "); double fahrenheit = sc.nextDouble();
		double celsius = ((5 * (fahrenheit - 32.0)) / 9.0);
		System.out.println(fahrenheit + " degree fahrenheit is equal to " + celsius + "in celsius");
		}
		}
		
		
	


