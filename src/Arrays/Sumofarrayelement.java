package Arrays;

import java.util.Scanner;

public class Sumofarrayelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Java Program to find sum of array elements");
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0; i<size; i++) {
            System.out.print("Please give value for index "+ i +" : ");
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<size; i++)
        {
            sum=sum+arr[i];
        }
        System.out.print("Sum of array elements is "+ sum);
	}
	}


