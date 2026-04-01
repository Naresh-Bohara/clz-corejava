package assignment.assignment1;

import java.util.Scanner;

public class Q21_DayOfWeek {
/*
 * Q21. Program to input the number of (1...7) and translate to its 
	 equivalent name of the day of the week.
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a num from 1-7 for a day");
		int day = sc.nextInt();
		
		switch(day) {
		case 1 -> System.out.println("Sunday");
		case 2 -> System.out.println("Monday");
		case 3 -> System.out.println("Tuesday");
		case 4 -> System.out.println("Wednesday");
		case 5 -> System.out.println("Thrusday");
		case 6 -> System.out.println("Friday");
		case 7 -> System.out.println("Saturday");
		default -> System.out.println("Invalid day");
		}
	}
}
