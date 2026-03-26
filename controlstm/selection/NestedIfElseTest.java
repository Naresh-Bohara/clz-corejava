package controlstm.selection;

import java.util.Scanner;

public class NestedIfElseTest {
	/*
	 * --------Nested if else ------------
	 * # syntax:
	 * 		if(){
	 * 			if(){
	 * 				if(){
	 * 						..........
	 * 						.........
	 * 					}else{
	 *
	 * 				}
	 * 			}else{
	 * 				//statements
	 * 			}
	 * 		}else{
	 * 			// statements
	 * 		}
	 */
	
	public static void main(String[] args) {
		// for checking eligible for voting or not 
//		String citizenship = "nepali";
//		int age = 20;
//		String voteCard = "yes";
		
		String citizenship, voteCard;
		int age;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your citizenship: ");
		citizenship = sc.next();
		System.out.println("Enter your age: ");
		age = sc.nextInt();
		System.out.println("Enter 'yes' if you have vote card else 'no' ");
		voteCard = sc.next();
		
		if(citizenship.equalsIgnoreCase("nepali")) {
			
			if(age>18) {
				if(voteCard.equalsIgnoreCase("yes")) {
					System.out.println("Please mailai vote dinus, tapai vote grana saknu hunxa....");
				}else {
					System.out.println("Vote card bana muji paila");
				}
			}else {
				System.out.println("fuchhe vote garna paudaiinas");
			}
		}else {
			System.out.println("Not eligible, nepali hoinas muji");
		}
		
	}
}
