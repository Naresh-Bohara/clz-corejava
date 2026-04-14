package arraywithmethods;

import java.util.Arrays;

public class ArrayWithMethod {
	/*
	 * ---------------------- Array with Method ---------------------------
	 * 
	 * 1. array  as paramter: {1,2,3,4,5, 10, 3}
	 * 
	 *  add(int a, int b, int c){
	 *  sysout(a+b+c);
	 *  }
	 *  
	 *  
	 *  # syntax:
	 *  void sum20Numbers(int[] nums){
	 *  	// statements...
	 *  }
	 * 
	 * 2. array as return type:
	 * 
	 * add(int a, int b, int c){
	 *  sum = (a+b+c);
	 *  return sum;
	 *  }
	 *  
	 *  # syntax:
	 *  int[] getSumOf20Numbers(){
	 *  	arr  = {1,2,3,43,4}
	 *  	return arr;
	 * 	}
	 * 
	 */
	
	
	public static void main(String[] args) {
		//1. array as parameter:
		int[] nums = {2,45,6,7,8,9};
		sumNumbers(nums);
		
		//2. array as return type:
//		System.out.println(Arrays.toString(getEvenNumsFrom1to100()));
		int evenNums[] = getEvenNumsFrom1to100();
		System.out.println(Arrays.toString(evenNums));
		
	}
	
	static void sumNumbers(int[] nums) {
		int sum = 0;
		for(int i=0; i<nums.length; i++) {
			sum += nums[i]; //0+1+2+3+4+5
		}
		
//		for(int x:nums) {
//			sum+=x;
//		}
		
		System.out.println("Sum is: "+sum);
	}
	
	//2. array as return type:
	static int[] getEvenNumsFrom1to100() {
		
		int[] evenNums = new int[50];
		
		int e =0;
		
		for(int i=1; i<=100; i++) {
			if(i%2==0) {
				evenNums[e] = i;
				e++;
			}
		}
		return evenNums;
	}
}
