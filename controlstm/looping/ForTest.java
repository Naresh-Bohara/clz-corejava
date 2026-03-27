package controlstm.looping;

public class ForTest {
	/* ---------------------- For Loop -----------------
	 * # repeatation 
	 * # when we have known number  of iterations.  
	 * 
	 * # syntax: 
	 * for(initialization; condition; inc/dec){
	 * 
	 * }
	 */
	
	
	
	
public static void main(String[] args) {
	for(int i=0; i<10; i++) {
		System.out.println("Good Morning!");
		System.out.println("I am dammar.");
	}
	/*
	 * i = 0 ----> 0<500? ----- yes/true ------> 
	 * 		- Good Morning
	 * 		- I am dammar.
	 * i = 1 -----> 1<500? ------ yes/true ----->
	 * 		- Good Morning
	 * 		- I am dammar.
	 * i = 2------> 2<500? ------- yes/true ------> 
	 * 		- Good Morning
	 * 		- I am dammar.
	 * ......................................
	 * ......................................
	 * i = 499 ------> 499<500? ------ yes/true------>
	 * 		- Good Morning
	 * 		- I am dammar.
	 * 
	 * i = 500 -------> 500<500? ------ no/false ------>
	 * 			-- loop exit 
	 */

	System.out.println("Hello");

}
}
