package typecasting;

public class TernaryOperator {
public static void main(String[] args) {
	/*
	 * ----------------Ternary operator --------------
	 * # Ternary operator is a shortcut of if-else statement
	 * # It is used to make decisions in one line
	 * # symbo: ? :
	 * # syntax:
	 * 		condition ? value_if_true : value_if_false;
	 */
	
	int x = 10;
	String result = (x > 5) ? "Big" : "Small";
	System.out.println(result);
	
	int age = 18;
	String status = (age >= 18) ? "Eligible to vote" : "Not eligible";
	System.out.println(status);
	
	int a = 10;
	int b = 20;
	int max = (a > b) ? a : b;
	System.out.println(max);
}
}
