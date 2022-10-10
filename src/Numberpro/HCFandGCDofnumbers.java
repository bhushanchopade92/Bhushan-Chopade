package Numberpro;

import java.util.Scanner;

public class HCFandGCDofnumbers {

	public static void main(String[] args) {
		
		double num1,num2,gcd=0;
        System.out.println("Java Program to calculate HCF/GCD " );
        Scanner sc = new Scanner(System.in);
        System.out.println("Please give first number");
        num1= sc.nextDouble();
        System.out.println("Please give second number");
        num2= sc.nextDouble();
        for(int i=1; i <= num1 && i <= num2; ++i)
        {
            if(num1%i==0 && num2%i==0)
            gcd = i;
        }
        System.out.println("G.C.D of number "+num1+" and "+num2+" = " +gcd);
    }

	}


