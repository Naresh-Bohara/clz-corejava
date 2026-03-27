package assignment.assignment1;

import java.util.Scanner;

public class Q4_SimpleInterest {
/*
 * Q4. Write a program to calculate Simple Interest input by user. Simple Interest = PTR/100
 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter principal: ");
		double principal = sc.nextDouble();
		System.out.println("Enter Time: ");
		double time = sc.nextDouble();
		System.out.println("Enter Rate: ");
		double rate = sc.nextDouble();
		
		double si = (principal*rate*time)/100;
		
		System.out.println("Simple Interest: " +si);
	}
}
