package controlstm.selection;

import java.util.Scanner;

public class Practise1 {
/*
 * Q. Take username and password from user, check if it is valid or not,
 * 	  if valid print login successful!, if not valid print invalid credentials! 
 */
	
	public static void main(String[] args) {
		String username = "santosh112";  //db
		String password = "password112"; // db
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter username: ");
		String uname = sc.next();
		System.out.println("Please enter password: ");
		String pass = sc.next();
		
		if(uname.equals(username) && pass.equals(password)) {
			System.out.println("Login Successfull!");
		}
	}
}
