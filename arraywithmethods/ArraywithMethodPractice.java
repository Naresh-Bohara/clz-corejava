package arraywithmethods;

import java.util.Arrays;
import java.util.Scanner;

public class ArraywithMethodPractice {
	//Q. pass an array as args and return array cubic of its values
	// array pass {1,2,3,4,5} ---> {1, 8, 27, 64, 125}
	
	public static void main(String[] args) {
		getTriple();
	}
	
	static void getTriple(){
		int[] nums = takeinput();
		int triple[] = getTripleOfGivenArray(nums);
		System.out.println(Arrays.toString(triple));
	}
	
	static int[] takeinput() {
		Scanner sc  = new Scanner(System.in);
		// 1. create an array:
		int[] nums = new int[5];
		
		// 2. put values/datas in array:
		for(int i=0; i<nums.length; i++) {
			System.out.println("Enter the Number "+(i+1) +": ");
			nums[i]  = sc.nextInt();
		}
		sc.close();
		return nums;
		
	}
	
	static int[] getTripleOfGivenArray(int[] nums){
		
		for(int i=0; i<nums.length; i++) {
			nums[i] = nums[i]*nums[i]*nums[i];
		}
		return nums;
		
	}
	
	
}
