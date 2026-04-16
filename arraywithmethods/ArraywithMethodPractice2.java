package arraywithmethods;

import java.util.Arrays;
import java.util.Scanner;

public class ArraywithMethodPractice2 {
// array with methods:
//	1. array as args
//	2. array as return type
	
	/*
	 * method:
	 * ------------ primitive:  ------------
	 *
	 * void add(int a, int b){
	 * 		sysout(a+b);
	 * }
	 * 
	 * 1. array as args:
	 *  array:  
	 *  void add(int[] arr){
	 * 		// statements
	 * }
	 * 
	 * --------primitive: -----------
	 * int add(int a, int b){
	 * 		return a+b;
	 * }
	 * 
	 * array:
	 * int[] add(){
	 * 		nums = {1,23,4,45,54}
	 * 		return nums;
	 * }
	 * 
	 */
	
	
	/*
	 * Q. sqare of each element of array (use array as parameter and array as return type concept.)
	 */
	
	
//	public static void main(String[] args) {
//		getSquare();
//	}
	
	static void getSquare(){
		// create and put values in aray:
		int nums[]= takeArrayInput();
				
		// pass array as arg:
		int[] sqArr = squareOfArray(nums);
		System.out.println(Arrays.toString(sqArr));
	}
	
	static int[] takeArrayInput() {
		//1. create array:
		int nums[] = new int[5];
						
		Scanner sc = new Scanner(System.in);
						
		//2. put values in array:
		for(int i=0; i<nums.length; i++) {
			System.out.println("Enter number-"+(i+1)+": ");
			nums[i] = sc.nextInt();
		}
		
		return nums;
	}
	
	static int[] squareOfArray(int[] nums) {
		
		for(int i=0; i<nums.length; i++) {
			nums[i] = nums[i]*nums[i];
		}
		
		return nums;
	}
}
