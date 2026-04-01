package assignment.assignment1;

import java.util.Scanner;

public class Q12_UserIInfo {
	/*
	 * Q12. Write a program to accept the roll, name, and nationality of the person and display 			those values in good format way.
	 */
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter student name:");
	String name = sc.next();
	
	System.out.println("Enter Roll No.: ");
	int rollno = sc.nextInt();
	
	System.out.println("Enter Nationality: ");
	String nationality = sc.next();
	
	System.out.println("---------------- User Info -----------------");
	System.out.println("Name = "+name);
	System.out.println("Roll no. = "+rollno);
	System.out.println("Nationality = "+nationality);
}
}
