package assignment.assignment1;

import java.util.Scanner;

public class Q14_Relate2Numbers {
/*
 * Q14. Write a program to relate two integers entered by user using == or > or < sign.
 */
	 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter first number: ");
		int num1 = sc.nextInt();
		
		System.out.println("Please enter second number: ");
		int num2 = sc.nextInt();
		
		if(num1 > num2) {
			System.out.println("First number is greater which is: "+num1 + " > "+ num2);
		}else if(num1 < num2) {
			System.out.println("First number is smaller which is: "+num1 + " < "+ num2);
		}else {
			System.out.println("Both numbers are equal which are: "+num1 + " = "+ num2);
		}
		
	}
}
