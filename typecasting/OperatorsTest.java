package typecasting;

public class OperatorsTest {
	/*
	 * 1. arithmetic operator:  +, -, *, /, %
	 * 2. relational operator: == , !=, >, <, >=, <= 
	 * 3. logical operator: &&, ||, !
	 * 4. Assignment operator: =, +=, -=, *=, /=, %=
	 * 5. Increment/Decrement operator: ++, --
	 * 		a. ++a : pre-increment: first increase -> then use increased value
	 * 		b. a++: post increase: first use value as it was ->  then increase
	 */
	
	public static void main(String[] args) {
		
		int a = 10;
		
		int b = 3;
		
//		System.out.println(a+b);
		
		System.out.println(a++);
		
		System.out.println(++a);
		
		System.out.println(a++ + ++a); 
		
		System.out.println(--b + b--);
		
				
	}
}
