package Numberpro;

import java.util.Scanner;

public class Cubeofnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		{
	        double num,cube;
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Please give the number to calculate cube");
	        num= sc.nextDouble();
	        cube = num*num*num;
	        System.out.println("Cube of "+num+" is ");
	        System.out.printf("%.2f",cube);
	    }
		
		
		
	}

}
