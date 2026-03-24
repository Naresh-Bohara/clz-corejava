package controlstm.selection;

import java.util.Scanner;

public class IfElseTest {
/*
 * ------------------ if-else -------------------
 * # exactly two condtion - true/false
 * # syntax:
 * 		if(){	
 * 			// statements
 * 		}else{
 * 			// statements
 * 		}
 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your salary: ");
		int salary = sc.nextInt();
		
		if(salary<30000) {
			salary = salary + 10000;
			System.out.println("Tero salary badyo ra salary = "+salary+" vayo");
		}else {
			System.out.println("Muji tero salary already badi xa tw dhani xas..");
		}
		
	}
}
