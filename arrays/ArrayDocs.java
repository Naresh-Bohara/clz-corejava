package arrays;

import java.util.Arrays;

public class ArrayDocs {
	/*
	 * ------------------- Array -----------------------
	 * # collection of data(homogeneous -- same type)
	 * # fixed size
	 * # index
	 * # contigenous memory allocation 
	 * # object in java
	 * 
	 * # syntax:
	 * 		data_type[] arr = new data_type[size];
	 */
	public static void main(String[] args) {
		
		/*
		 * ages[0] : 0
		 * ages[1] : 0
		 * ages[2] : 0
		 * ages[3] : 0
		 */
		
//		1. declare array / create array
		int[] ages = new int[4];
		
//		2. add values in array
		ages[0] = 12;
		ages[1] = 22;
		ages[2] = 27;
		ages[3] = 32;
		
//		3. acess / print ....
//		System.out.println(ages[0]);
//		System.out.println(ages[1]);
//		System.out.println(ages[2]);
//		System.out.println(ages[3]);
		
		System.out.println(Arrays.toString(ages));
		
	}
}
