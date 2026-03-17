/*  program / java program
 * - read / scan / explain 
 * 
 * */

package corejavaclz;

import java.util.Scanner;

public class Hello {
	static public void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	
		int a, b, c;
		
		System.out.println("Enter a: ");
		a = sc.nextInt();
		
		System.out.println("Enter b: ");
		b = sc.nextInt();
		
		c = a+b;
		
		System.out.println(c);
	}
	
}


