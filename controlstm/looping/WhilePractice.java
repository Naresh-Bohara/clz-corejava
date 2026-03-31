package controlstm.looping;

import java.util.Scanner;

public class WhilePractice {
	public static void main(String[] args) {
		int password = 1234;
		Scanner sc = new Scanner(System.in);
		
		int inputPassword = 0;
		while(inputPassword != password) {
			System.out.println("Enter correct password: ");
			inputPassword = sc.nextInt();
		}

	}
}
