package JAVAPROGRAMS;

import java.util.Scanner;

public class Swaptwonumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int x, y, z;
		Scanner sc = new Scanner(System.in); 
		
		x = sc.nextInt(); 
		y = sc.nextInt();
		
		System.out.println("Before swapping\n x = " + x + "\n y = " + y); 
		
		z = x; x = y; y = z;
		
		
		System.out.println("After swapping\n x = " + x + "\n y = " + y);
		}
		}
		
		
	


