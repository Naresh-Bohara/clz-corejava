package assignment.assignment1;

import java.util.Scanner;

public class Q13_PrintIfNegative {
/*
 * Q13. Write a program to print the number entered by user
 * 		only if the number entered is negative.
 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a number: ");
		int num = sc.nextInt();
		
		if(num<0) {
			System.out.println("Your negative number is: "+num);
		}
	}
}
