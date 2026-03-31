package controlstm.looping;

import java.util.Scanner;

public class ForPractice4 {
	public static void main(String[] args) {
		/*
		 * q. sum of n natural numbers:
		 * 5= 1+2+3+4+5 = 15
		 */
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter your number: ");
		int num = sc.nextInt();
		
		int sum = 0;
		for(int i=0; i<=num; i++) {
			sum = sum+i;
		}
		/*
		 * sum = 0
		 *  num =3:
		 *  itereation: 1
		 *  i = 0 .....i<=num(3) ....true...>loop vitra janxa
		 *  sum = 0+0;
		 *  
		 *  iteration-2:
		 *  i=1 ...1<=num(3)......true ...>loop..
		 *  sum = 0+1
		 *  
		 *  sum = 1+2
		 *  
		 *  sum = 3+3 = 6
		 */
		System.out.println(sum);
	}
}
