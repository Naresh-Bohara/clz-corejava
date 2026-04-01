package assignment.assignment1;

import java.util.Scanner;

public class Q20_Calc {
/*
 * Q20. Write a program to create the equivalent of a four-function calculator. 
 * The program to enter two integer numbers and an operator. It then carries out the 
 * specified arithmetic operation: addition, subtraction, multiplication or division
 * of the two numbers. Finally, it displays the result.
 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter second number: ");
		int num2 = sc.nextInt();
		
		System.out.println("Please enter operator you want "
				+ "to perform: '+' or '-' or '*' or '/' : ");
		char op =  sc.next().charAt(0);
		
		switch(op) {
		case '+' -> System.out.println("Addition of "+num1+ " and "+num2+" is: "+(num1+num2));
		case '-' -> System.out.println("Subtraction of "+num1+ " and "+num2+" is: "+(num1-num2));
		case '*' -> System.out.println("Addition of "+num1+ " and "+num2+" is: "+(num1*num2));
		case '/' -> System.out.println("Addition of "+num1+ " and "+num2+" is: "+(num1/num2));
		}
		
	}
}
