package Numberpro;

import java.util.Scanner;

public class LCMoftwonumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double num1,num2,maxNum;
        System.out.println("Java Program to calculate LCM" );
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please give first number");
        
        num1= sc.nextDouble();
        
        System.out.println("Please give second number");
        num2 = sc.nextDouble();
        
        maxNum = (num1 > num2) ? num1 : num2;
        
        while (true) 
        {
            if (maxNum % num1 == 0 && maxNum % num2 == 0) {
            System.out.println("LCM = "+maxNum );
            break;
       }
            ++maxNum;
		
		
		
		
		
	}

}
}