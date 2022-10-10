package Numberpro;

import java.util.Scanner;

public class Squareroot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 double num,cube;
		 
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Please give a number to calculate Square root" );
	        num= sc.nextDouble();
	        
	        System.out.println("Square Root of "+num+" is ");
	        System.out.printf("%.2f",Math.sqrt(num));
	    }
		
		
		
		
	}


