package methods;

public class MethodDocs {	
/*
 * functions / methods
 * # for code re-useablity.
 * # line of block of code that perform specific task in the program is called method.
 * 
 * # syntax: 
 * 		return_type method_name(arg1, ar2, ... argn---paraameters){
 * 				// statements
 * 		}
 * 
 * # return_type: 
 * 		1. void:		no value (result) return from method
 * 		2. non-void:	value (result) return from method
 * 
 */
	
	static void print() {
		System.out.println("Hello there!...."); // build method
	}
	
	static void add() {
		int a = 10;
		int b= 20;
		int c = a+b;
		System.out.println("Sum = "+c);
	}
	
	static void area(){
		int l = 23;
		int b = 2;
		int area = l*b;
		System.out.println("area = "+area);	
	}
	
	public static void main(String[] args) {
//		MethodDocs mt = new MethodDocs();
//		mt.area();
		
		print(); // call method
		add();	//call
		area();
	}
	
	
}
