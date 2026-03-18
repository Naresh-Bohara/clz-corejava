package datatypes;

public class DataTypesDocs {
	
	/*
	 * -------------- Data Types -----------------
	 * 	- proper data  representation.
	 * 	- proper memory allocation.
	 * 	- proper operation to be performed.
	 * 
	 * # Data Types: 
	 * 1. primitive  data types:
	 * 	 - built in data types , size , range, memory space...
	 * 	a. byte ---- whole number
	 * 	b. short --- whole number
	 * 	c. int ---- whole number // default
	 * 	d. long ---- whole number
	 * 	e. float ---- fractional/decimal
	 * 	f. double --- fractional/decimal  // default
	 * 	g. char - '@', '1', 't' '#'
	 * 	h. boolean -  true / false
	 * 
	 * 2. Non-primitive data types:
	 * 	- reference object/ instance
	 * 	a. string
	 * 	b. class
	 * 	c. array
	 * 	d. interface
	 * 	e. enums.......
	 */

	
	public static void main(String[] args) {
//		int a = 35;
//		System.out.println("value of a = "+a);
		
//		byte x = -128, 127
//		byte x = 129;
		
		// byte = 8 bits ---> 1 byte ---8 bits
		// int = 32 bits ---> 4 bytes
//		byte x =34;
		
		System.out.println("byte-size = " + Byte.SIZE + " byte-min value = "+
		Byte.MIN_VALUE + " max-value = "+Byte.MAX_VALUE);
		
//		System.out.println("Short -size = " + Short.SIZE + ", minValue: "+ 
//				Short.MIN_VALUE + ", Short-maxValue: " + Short.MAX_VALUE);
//		
//		System.out.println("int -size = " + Integer.SIZE + ", minValue: "+ 
//				Integer.MIN_VALUE + ", Integer-maxValue: " + Integer.MAX_VALUE);
	}
}
