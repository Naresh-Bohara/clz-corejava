package assignment.assignment1;

import java.util.Scanner;

public class Q24_Factorial {
/*
 * Q24. Write a program to print the factorial number of given number.
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number for which you want a factorial: ");
		int num = sc.nextInt();
		int fact = 1;
		if(num==0 || num==1) {
			System.out.println("Factorial is 1.");
		}else if(num>1) {
			for(int i=num; i>=2; i--) {
				fact *=i;
			}
			System.out.println("Factorial is: "+fact);
		}else {
			System.out.println("Factorial is undefined.");
		}
	}
}
