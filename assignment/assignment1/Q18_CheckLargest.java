package assignment.assignment1;

import java.util.Scanner;

public class Q18_CheckLargest {
/*
 * Q18. Write a program to display largest number from given three values.
 */
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter second number: ");
		int num2 = sc.nextInt();
		
		System.out.println("Enter third number: ");
		int num3 = sc.nextInt();
		
		if(num1> num2 && num1>num3) {
			System.out.println("First number is greater then second and third, i.e: "+num1+ " >" +num2 +" and "+num3);
		}else if(num2> num1 && num2>num3) {
			System.out.println("Second number is greater then first and third, i.e: "+num2+ " >" +num1 +" and "+num3);
		}else {
			System.out.println("Third number is greater then first and second, i.e: "+num3+ " >" +num1 +" and "+num2);
		}
	}
}
