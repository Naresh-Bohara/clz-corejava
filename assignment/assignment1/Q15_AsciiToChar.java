package assignment.assignment1;

import java.util.Scanner;

public class Q15_AsciiToChar {
/*
 * Q15. Write a program that receives an ASCII code (between 0 – 128) and display its character 		[example: 97 (input) -> a(output)].
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a ascii number for char from '0' to '128' ");
		int ascii = sc.nextInt();
		if(ascii>0 && ascii < 128) {
			char ch = (char) ascii;
			System.out.println("The corresponding char for ascii number: "+ascii + " is "+ch);
		}else {
			System.out.println("Invalid ascii number.");
		}
	}
}
