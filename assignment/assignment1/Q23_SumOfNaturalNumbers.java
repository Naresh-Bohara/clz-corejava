package assignment.assignment1;

import java.util.Scanner;

public class Q23_SumOfNaturalNumbers {
/*
 * Q23. Write a Program to sum 1 to nth natural numbers.
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a num upto which you want sum: ");
		int num  = sc.nextInt();
		int sum = 0;
		for(int i=1; i<=num; i++) {
			sum+=i;
		}
		System.out.println("Sum of 1 upto "+num+" is: "+sum);
	}
}
