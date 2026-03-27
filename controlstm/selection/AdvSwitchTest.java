package controlstm.selection;

import java.util.Scanner;

public class AdvSwitchTest {
/*
 * switch(){
 * 	case value1 -> ....//statements
 * case value2 -> ....//statements
 * case value3 -> ....//statements
 * ..................
 * ..................
 * default -> .....
 * }
 */
	
	public static void main(String[] args) {
//		String role = "admin";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter role: ");
		String role = sc.next();
		
		switch(role) {
		case "admin" -> System.out.println("Admin dashboard!");
		case "seller" -> System.out.println("Seller dashboard!");
		case "customer" -> System.out.println("Customer dashboard!");
		default -> System.out.println("Invalid role");
		}
	}
}
