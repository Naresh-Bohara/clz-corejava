package controlstm.looping;

import java.util.Scanner;

public class DoWhileLoop {
public static void main(String[] args) {
	/*
	 * --------------Do while-------------------
	 * # synatx:
	 * 
	 * 	do{
	 * 		//statements
	 * 		
	 * 	i++;
	 * 	}while(condition);
	 */
	
	
	/*
	 * for(int i = 20; i<=10; i++) {
		System.out.println("For loooop");
	}
	
	int i = 20;
	while(i<=10) {
		System.out.println("While loop");
		i++;
	}
	 */
//	int i = 11;
//	do {
//		System.out.println("Do While loop");
//		i++;
//	}while(i<=10);
	
	 Scanner sc = new Scanner(System.in);
     int choice;

     do {
         System.out.println("\n--- ATM MENU ---");
         System.out.println("1. Check Balance");
         System.out.println("2. Deposit");
         System.out.println("3. Withdraw");
         System.out.println("4. Exit");

         System.out.print("Enter your choice: ");
         choice = sc.nextInt();

         switch (choice) {
             case 1:
                 System.out.println("Balance: Rs. 10,000");
                 break;
             case 2:
                 System.out.println("Deposit successful");
                 break;
             case 3:
                 System.out.println("Withdrawal successful");
                 break;
             case 4:
                 System.out.println("Thank you!");
                 break;
             default:
                 System.out.println("Invalid choice");
         }

     } while (choice != 4);
 
}
}
