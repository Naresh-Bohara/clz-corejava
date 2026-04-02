package controlstm;

import java.util.Scanner;

public class CheckMarks {
public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);

     while (true) {
         System.out.print("Enter marks (-1 to exit): ");
         int marks = sc.nextInt();

         // return
         if (marks == -1) {
             System.out.println("Program ended.");
             return;
         }

         // continue
         if (marks < 0 || marks > 100) {
             System.out.println("Invalid marks!");
             continue;
         }

         // break
         if (marks < 40) {
             System.out.println("Student failed!");
             break;
         }

         System.out.println("Passed with marks: " + marks);
     }

}
}
