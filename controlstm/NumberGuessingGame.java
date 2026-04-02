package controlstm;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		int secretNum = ran.nextInt(100)+1;
//		System.out.println(secretNum);
		System.out.println("---------- Number Guessing Game (1-100): -------------");
		
		int count = 0;
		boolean guessDone = false;
		
		while(!guessDone) { 
			System.out.println("Enter your guess: ");
			int userGuess = sc.nextInt();
			
			if(userGuess<=100 && userGuess >=0) {
				if(secretNum == userGuess) {
					System.out.println("Congrats! you got right guess!.. in "+count+" attempts.");
					break;
				}else if(secretNum > userGuess) {
					System.out.println("Your number is smaller, please enter greater number!");
					count++;
				}else {
					System.out.println("Your number is larger, please enter smaller number!");
					count++;
				}
			}else {
				System.out.println("Please enter number between 1-100: ");
			}
		}
	}
}
