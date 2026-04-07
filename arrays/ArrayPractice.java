package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
//	1. create
	static String[] cities = new String[4];
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
//		2. assign values:
		for(int i=0; i<cities.length; i++) {
			System.out.println("Enter city "+(i+1)+": ");
			cities[i] = sc.next();
		}
		System.out.println(Arrays.toString(cities));
		sc.close();
	}
	
	
}
