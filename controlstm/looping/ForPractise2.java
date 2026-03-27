package controlstm.looping;

public class ForPractise2 {
	/*
	 * Q. sum of odd numbers and even numbers from 1 to 100 and finally add them for total
	 * output:
		 *  odd sum = ...
		 * 	even sum = ...
		 * 	total sum = ...
	 */
	public static void main(String[] args) {
		int oddSum = 0;
		int evenSum = 0;
		int total = 0;
		for(int i =1; i<=100; i++) {
			if(i%2 == 0) {
				evenSum = evenSum + i;
			}else {
				oddSum = oddSum + i;
			}
		}
		
		total = evenSum + oddSum;
		System.out.println("sum of odd numbers = "+oddSum);
		System.out.println("sum of even numbers = "+evenSum);
		System.out.println("Total sum = "+total);
	}
}
