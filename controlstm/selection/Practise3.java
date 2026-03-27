package controlstm.selection;

import java.util.Scanner;

public class Practise3 {
/*
 * admin: admin dashboard
 * teacher: teacher dashboard
 * student: student dashboard
 * guest: guest dashboard
 * default: invalid role  
 * ----------using switch ------------
 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a role: ");
		String role = sc.next().toLowerCase();
		
		switch(role) {
		case "admin" -> System.out.println("You are in admin dashboard!");
		case "teacher" -> System.out.println("You are in teacher dashboard!");
		case "student" -> System.out.println("You are in student dashboard!");
		case "guest" -> System.out.println("You are in guest dashboard!");
		default -> System.out.println("Invalid role");
		}
	}
	
}
