package methods;

import java.util.Scanner;

public class MethodPractice {
	
	// 1. void: return type hudaina, value return gardaina
	// 2. non-void: value return garne wala
	
	
	/*
	 * syntax:
	 * 	return_type method_name(arg1, arg2,..., argn){
	 * 		// statements
	 * }
	 */
	// no return type with no args...
	static void hello() {
		System.out.println("Hello there!");
	}
	
	// return type:
	static int sum() {
		int a = 23;
		int b= 12;
		System.out.println(a+b);
		return a+b;
	}
	
	/*
	 * 1. no return type with no argument
	 * 2. no return type with argument
	 * 3. return type with no argument
	 * 4. return type with argument
	 * 
	 */
	//1. no return type with no argument
	static void area() {
		int l=12;
		int b= 2;
		System.out.println(l*b);
	}

	// 2. no return type with argument
	/*
	 * static void printTable(int num) {
		for(int i = 1; i<=10; i++) {
			System.out.println(num + " x "+ i +" = "+ (num*i));
		}
	}
	 */
	
//	3. return type with no argument
	static int mul() {
		int num = 23;
		int times = 5;
		
		return num*times;
	}
	
	
//	4. return type with argument
//	static int add(int a, int b) {
//		
//		return a+b;
//	}
	
	
	static void div() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter numerator: ");
		int nume = sc.nextInt();
		System.out.println("Enter denumretor: ");
		int demo = sc.nextInt();
		
		System.out.println("Div is: "+ (nume/demo));
	}

	public static void main(String[] args) {
//		MethodPractice mtp = new MethodPractice();
//		mtp.hello();
		
//		hello();
//		sum();
//		
//		area();
		
//		int mul = mul();
//		System.out.println(mul());
		
//		System.out.println(add(3,4));
		
		div();
		
	}
	
	
	
}
