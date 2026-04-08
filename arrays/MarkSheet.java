package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MarkSheet {
	static double[] marks = new double[5];
	
	static void takeInputMarks() {
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i< marks.length; i++) {
			while(true) {
				System.out.println("Enter your marks for subject "+(i+1)+": ");
				double enteredMarks = sc.nextDouble();
				
				if(enteredMarks >=0 && enteredMarks <= 100) {
					marks[i] = enteredMarks;
					break;
				}else {
					System.out.println("Please enter valid marks (1-100)");
				}
			}
		}
	}
	
	static void printMarks() {
		System.out.println("--------------------------------------------------------");
		System.out.println("Your marks in each subject are: "+ Arrays.toString(marks));
	}
	
	static double totalMarks() {
		double sum =0;

		for(double item: marks) {
			sum += item;
		}
		return sum;
	}
	
	static double percentage(double totalMarks) {
		double percentage = (totalMarks/500) *100;
		return percentage;
	}
	
	static boolean passOrFail() {
		for(double mark: marks) {
			if(mark < 40) {
				return false;
			}
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		takeInputMarks();
		printMarks();
		double totalMarks = totalMarks();
		
		boolean passOrFail = passOrFail();
			
		System.out.println("Your total marks is: "+totalMarks);
		
		System.out.println("Your percentage is: "+percentage(totalMarks)+"%");
		
		if(passOrFail) {
			System.out.println("You are pass!");
		}else {
			System.out.println("You are failed!");
		}
		
	}
}
