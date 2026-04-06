package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrraysWithScanner {
	public static void main(String[] args) {
		int[] rolls = new int[5];
		Scanner sc =new Scanner(System.in);
		
		for(int i=0; i<rolls.length; i++) {
			System.out.println("Eneter roll for index "+i);
			rolls[i] = sc.nextInt();
		}
		
		
//		System.out.println(Arrays.toString(rolls));
		
//		System.out.println("-----------------");
//		System.out.println(rolls[0]);
//		System.out.println(rolls[1]);
//		System.out.println(rolls[2]);
//		System.out.println(rolls[3]);
//		System.out.println(rolls[4]);
		
		for(int x:rolls) {
			System.out.println(x);
		}
	}
}
