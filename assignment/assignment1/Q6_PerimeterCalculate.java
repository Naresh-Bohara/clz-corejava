package assignment.assignment1;

import java.util.Scanner;

public class Q6_PerimeterCalculate {
/*
 * Q6. Write a program to find the perimeter of circle, triangle, and rectangle.
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("--------Perimeter of circle-------- ");
		System.out.println("Enter radius: ");
		double radius = sc.nextDouble();
		double perimeterc = 2*Math.PI*radius;
		System.out.println("Periimeter of circle is: "+perimeterc);
		
		System.out.println("--------Perimeter of rectangle-------- ");
		System.out.println("Enter length: ");
		double length = sc.nextDouble();
		System.out.println("Enter breadth: ");
		double breadth = sc.nextDouble();
		double perimeterr = 2*(length+breadth);
		System.out.println("Perimeter of circle is: "+perimeterr);
		
		System.out.println("--------Perimeter of triangle-------- ");
		System.out.println("Enter first side: ");
		double s1 = sc.nextDouble();
		System.out.println("Enter second side: ");
		double s2 = sc.nextDouble();
		System.out.println("Enter third side: ");
		double s3 = sc.nextDouble();
		double perimetert = s1+s2+s3;
		System.out.println("Perimeter of circle is: "+perimetert);
	}
}
