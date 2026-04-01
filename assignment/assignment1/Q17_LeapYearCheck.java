package assignment.assignment1;

import java.util.Scanner;

public class Q17_LeapYearCheck {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Please enter a year: ");
	int year = sc.nextInt();
	
	if((year %4 == 0 && year %100 !=0) || (year%400 ==0)) {
		System.out.println("Year is a leap year.");
	}else {
		System.out.println("Year is not a leap year.");
	}
}
}
