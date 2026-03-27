package assignment.assignment1;

import java.util.Scanner;

public class Q7_VolumeOfCylinder {
/*
 * Q7. Write a program that read the radius and length of a cylinder and computes volume.
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Enter radius of cylinder: ");
		double radius = sc.nextDouble();
		System.out.println("Enter height of cylinder: ");
		double height = sc.nextDouble();
		double volume = Math.PI* Math.pow(radius, 2) * height;
		System.out.println("Volume is: "+volume);
	}
}
