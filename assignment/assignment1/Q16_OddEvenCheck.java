package assignment.assignment1;

import java.util.Scanner;

public class Q16_OddEvenCheck {
/*
 * Q16. Write a program to find the given number is even or odd.
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a number: ");
		int num = sc.nextInt();
		
		
		if(num%2==0) {
			System.out.println("The number is even.");
		}else {
			System.out.println("The number is odd.");
		}
	}
}
