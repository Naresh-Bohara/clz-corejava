package controlstm.looping;

import java.util.Scanner;

public class WhileTest {
	/*
	 * -------------While Loop----------------------
	 * # syntax:
	 * 		while(condition){
	 * 			// statements
	 * 			i++;
	 * 		}
	 */
	
	public static void main(String[] args) {
//		int i=0;
//		while(i<100) {
//			System.out.println("hello");
//			i++;
//		}
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the num: ");
		int num = sc.nextInt();
		
		int i = 0;
		int oddSum=0;
		int evenSum = 0;
		while (i<=num) {
			
			if(i%2==0) {
				evenSum+=i;
			}else {
				oddSum+=i;
			}
			i++;  // 1, 2,  3, 4
		}
		System.out.println("Even sum = "+evenSum);
		System.out.println("Odd sum = "+oddSum);
		
	}
}
