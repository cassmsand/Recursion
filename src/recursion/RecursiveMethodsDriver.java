package recursion;

import java.util.Scanner;
import java.io.*;

public class RecursiveMethodsDriver {

	public static void main(String[] args) {
		
		//create scanner object
		Scanner scan = new Scanner(System.in);

		//Enter a number for scanner to initialize
		System.out.print("Enter a number: ");
		int number = scan.nextInt();
		
		System.out.println("The fibonacci result is: " + fibonacci(number));
		
		System.out.println("\nHighest to lowest: ");
		highestToLowest(number);
		
		System.out.println("\nLowest to highest: ");
		lowestToHighest(number);
		
		System.out.println("\nHighest to lowest to highest: ");
		highestToLowestToHighest(number);
		
		System.out.println("\nHighest to lowest to highest symbols: ");
		highestToLowestToHighestSymbols(number);
	
	}
	
	
	public static void highestToLowest (int n) {
		System.out.println(n);
		if (n > 1) {
			highestToLowest(n-1);
		}
	}
	
	public static void lowestToHighest(int n) {
		if (n > 1) {
			lowestToHighest(n-1);
		}
		System.out.println(n);
	}
	
	public static void highestToLowestToHighest(int n) {
		System.out.println(n);
		if (n > 1)
			highestToLowestToHighest(n - 1);
		System.out.println(n);
	}
	
	public static void highestToLowestToHighestSymbols(int n) {
		//start the i value at 1, while it is less than or equal to n, print "*" i times, n loop starts at n and subtracts one using recursive call
		for (int i = 1; i <= n; i++)
			System.out.print("*");
		System.out.println();
		if (n > 1)
			highestToLowestToHighestSymbols(n - 1);
		//start the j value at 1, while it is less than or equal to n, print "*" j times, n loop starts at 1
		for (int j = 1; j <= n; j++)
			System.out.print("!");
		System.out.println();
	}
		
		/*
		//save the value of n into i, repeat "*" i times, and then subtract one and loop, stop after 1 reached
		for (int i = n; i >= 1; i--)
			System.out.println("*".repeat(i));
		//start j value at 1, repeat "*" j times, and then add one to j and loop, stop after n reached
		for (int j = 1; j <= n; j++)
			System.out.println("!".repeat(j));
		*/
	

	public static long fibonacci(int n) {
		//if n is less than or equal to zero
		if (n <= 0)
			return -1;
		//if n is equal to 1 or 2
		else if (n == 1 || n == 2)
			return 1;
		//if n is greater than 2
		else
			return fibonacci(n-1) + fibonacci(n-2);
	}
	

}
