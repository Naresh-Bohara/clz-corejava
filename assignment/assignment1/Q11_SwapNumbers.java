package assignment.assignment1;

public class Q11_SwapNumbers {
	/*
	 * Q11. Write a program to swap two numbers
			a) using temp variable
			b) without temp variable
	 */
public static void main(String[] args) {
//	a. using temp variable
	int a = 23;
	int b = 24;
	
	int temp = a;
	a = b;
	b = temp;
	
	System.out.println("a = "+a+", b = "+b);
	
//	b) without temp variable
	int x = 27;
	int y = 28;
	x = x + y;
	y = x - y;
	x = x - y;
	
	System.out.println("x = "+x+", y = "+y);
	
//	c) using xor gate
	int c = 8;
	int d = 13;
	
	c = c^d;
	d = c^d;
	c = c^d;
	System.out.println(c+" "+ d);
}
}
