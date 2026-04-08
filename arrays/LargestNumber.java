package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class LargestNumber {
	public static void main(String[] args) {
		int[] arr = new int[4];
		
		Scanner sc = new Scanner(System.in);
		
		// assign value to array:
		for(int i=0; i<arr.length; i++) {
			System.out.println("Enter number "+(i+1)+": ");
			arr[i]= sc.nextInt();
		}
		 
		int max = arr[0];
	
		for(int i=0; i< arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("Largest Number is: "+ max);
	}
}
