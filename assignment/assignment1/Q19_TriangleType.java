package assignment.assignment1;

import java.util.Scanner;

public class Q19_TriangleType {
/*
 * Q19. Write a Program to accept three sides of triangle and 
	 display which kind of triangle is formed.
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter sid-1: ");
		double a = sc.nextDouble();
		
		System.out.println("Please enter sid-2: ");
		double b = sc.nextDouble();
		
		System.out.println("Please enter sid-3: ");
		double c = sc.nextDouble();
		
		if(a+b>c && b+c>a && c+a>b) {
			if(a==b && b==c) {
				System.out.println("Triangle is equilateral.");
			}else if(a == b || b==c || c==a) {
				System.out.println("Triangle is isosceles.");
			}else {
				System.out.println("Triangle is scalene.");
			}
		}else {
			System.out.println("Invalid triangle sides.");
		}
	}
}
