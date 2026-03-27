package assignment.assignment1;

import java.util.Scanner;

public class Q8_TemperatureConverter {
/*
 * Q8. Write a program to convert Fahrenheit to Celsius and Celsius to Fahrenheit.
 */
/*
 * c/5 = (f-32)/9 = r/4 = (k-273)/5
 * ---------------------------------
 * 
 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter choice: ");
		System.out.println("1--> for converting Fahrenheit to Celsius: ");
		System.out.println("2--> for converting Celsius to Fahrenheit: ");
		int choice = sc.nextInt();
		
		if(choice==1) {
			System.out.println("Please enter temperature in Fahrenheit: ");
			double tempFah = sc.nextDouble();
			double tempToCel = 5*((tempFah-32)/9);
			System.out.println("After conversion: "+tempFah + " = "+tempToCel+" degree Celsius");
		}else if(choice==2) {
			System.out.println("Please enter temperature in Celsius: ");
			double tempCel = sc.nextDouble();
			double tempToFah = ((9*tempCel)/5) + 32;
			System.out.println("After conversion: "+tempCel + " = "+tempToFah+" degree Fahrenheit");
		}else {
			System.out.println("Please choose '1' or '2', Invalid Choice!");
		}
	}
}
