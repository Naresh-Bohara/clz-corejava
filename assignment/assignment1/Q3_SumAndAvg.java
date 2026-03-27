package assignment.assignment1;

import java.util.Scanner;

public class Q3_SumAndAvg {
/*
 * Q3. Write a program to find sum and average of two numbers input by User (using Scanner class).
 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int num1 = sc.nextInt();
		System.out.println("Enter second number: ");
		int num2 = sc.nextInt();
		
		int sum = num1 + num2;
		double avg = (double) (num1+num2)/2;
		System.out.println("Sum is: "+sum);
		System.out.println("Average is: "+avg);
	}
}
