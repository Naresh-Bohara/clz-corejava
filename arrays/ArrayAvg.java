package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayAvg {
	public static void main(String[] args) {
		int[] marks = new int[4];
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<marks.length; i++) {
			System.out.println("Enter the marks "+(i+1));
			marks[i] = sc.nextInt();
		}
		
		int sum =0;
//		for(int i: marks) {
//			sum = sum+i;
//		}
		
		for(int i=0; i<marks.length; i++) {
			sum = sum+marks[i];
		}
		
		int avg = sum/marks.length;
		
		System.out.println(Arrays.toString(marks));
		System.out.println("Avg marks: "+avg);
		
		sc.close();
	}
}
