package assignment.assignment1;

import java.util.Scanner;

public class Q9_PoundToKg {
/*
 * Q9. Write a program that converts pounds into kg. The program prompts the user to enter number 		of pounds, converts it to kg and displays the result [1 pound is 0.454 kg].
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your pounds: ");
		double pounds = sc.nextDouble();
		double kg = pounds * 0.453592;
		System.out.println(pounds + " pounds is = "+kg +" kilograms.");
	}
}
