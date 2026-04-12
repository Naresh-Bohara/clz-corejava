package arrays;

import java.util.Scanner;

public class FindAge {
public static void main(String[] args) {
	
	//1. create an array
	int[] ages = new int[3];
	
	//2. put data in array:
	Scanner sc = new Scanner(System.in);
	for(int i=0; i<ages.length; i++) {
		System.out.println("Please enter age "+(i+1)+": ");
		ages[i] = sc.nextInt();
	}
	
	System.out.println("---------------------------");
	
	//3. print array
//	for(int y: ages) {
//		System.out.println(y);
//	}
	
//	for(int i=0;  i<ages.length; i++) {
//		System.out.println(ages[i]);
//	}
	
	
	// check either searched age is in the array or not?
	System.out.println("Enter age you want to search: ");
	int searchAge = sc.nextInt();
	
	int i=0;
	boolean find = false;
	
	while(i < ages.length) {
		if(searchAge == ages[i]) { //ages[0], ages[1], ages[2]
			find = true;
			break;
		}else {
			i++;
		}
	}
	
	if(find == true) {
		System.out.println("Age is found! at index "+ i);
	}else {
		System.out.println("Age is not found!");
	}
}
}
