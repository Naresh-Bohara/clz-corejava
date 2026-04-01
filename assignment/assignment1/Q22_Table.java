package assignment.assignment1;

import java.util.Iterator;
import java.util.Scanner;

public class Q22_Table {
	/*
	 * Q22. Write a program to print the table of given number.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number for which you want table: ");
		int num = sc.nextInt();
		System.out.println("-------- Table of "+ num + " --------------");
		for(int i = 1; i<=10; i++) {
			System.out.println(num+" x "+ i+ " = "+ num*i);
		}
	}
}
