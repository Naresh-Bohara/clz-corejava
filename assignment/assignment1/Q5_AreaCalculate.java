package assignment.assignment1;

import java.util.Scanner;

public class Q5_AreaCalculate {
/*
 * Q5. Write a program to find the area of circle, rectangle, and triangle.
 */
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("--------Area of circle-------- ");
	System.out.println("Enter radius: ");
	double radius = sc.nextDouble();
	double areac = Math.PI*radius*radius;
	System.out.println("Area of circle is: "+areac);
	
	System.out.println("--------Area of rectangle-------- ");
	System.out.println("Enter length: ");
	double length = sc.nextDouble();
	System.out.println("Enter breadth: ");
	double breadth = sc.nextDouble();
	double arear = length*breadth;
	System.out.println("Area of circle is: "+arear);
	
	System.out.println("--------Area of triangle-------- ");
	System.out.println("Enter breadth: ");
	double breadtht = sc.nextDouble();
	System.out.println("Enter height: ");
	double height = sc.nextDouble();
	double areat = 0.5*breadtht*height;
	System.out.println("Area of circle is: "+areat);
}
}
