package controlstm.selection;

import java.util.Scanner;

public class Practise2 {
/*
 * Q2. 15000 -> 20%    
 * 	   10000 -> 15%
 * 	   5000  -> 10%
 * 	   1000  -> 5%
 * 	   <1000 -> no discount
 *   ----------- using if else if ----------
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your amount: ");
		double amount = sc.nextDouble();
		
		if(amount>=15000) {
			System.out.println("You got 20% discount!");
		}else if(amount >= 10000) {
			System.out.println("You got 15% discount!");
		}else if(amount>=5000) {
			System.out.println("You got 10% discount!");
		}else if(amount>1000) {
			System.out.println("You got 5% discount!");
		}else {
			System.out.println("Sorry! no any discount!");
		}
		sc.close();
	}
	
}
