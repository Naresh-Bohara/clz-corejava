package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysPractice2 {
	/*
	 * Q. 5 marks ---- student -pass fail total percentage: ----
	 *  
	 */
	
	static double[] marks = new double[5];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//1. assign values:
		for(int i=0; i<marks.length; i++) 
			while(true) {
				System.out.println("Enter marks "+(i+1)+": ");
				double enteredMarks = sc.nextDouble();
				
				if(enteredMarks>=0 && enteredMarks<=100) {
					marks[i] = enteredMarks;
					break;
				}else {
					System.out.println("Please enter valid marks (1-100): ");
				}
			}
			
		
		// print marks:
		System.out.println("Your marks: "+ Arrays.toString(marks));
		double sum = 0;
		for(int i=0; i<marks.length; i++) {
			if(marks[i] >=40) {
				sum+=marks[i];
		}else {
			System.out.println("You are failed!");
			break;
		}
		
	}
		
		if(sum>=200) {
			System.out.println("You are pass!");
			double percent = (sum/500)*100;
			System.out.println("Your percentage is: "+percent+"%");
		}
	
}}
