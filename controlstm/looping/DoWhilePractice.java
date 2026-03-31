package controlstm.looping;

import java.util.Scanner;

public class DoWhilePractice {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        boolean satisfied;

	        do {
	            System.out.println("Writing answer...");

	            System.out.print("Are you satisfied with your answer? (true/false): ");
	            satisfied = sc.nextBoolean();

	        } while (!satisfied);

	        System.out.println("Answer finalized!");
	}
}
