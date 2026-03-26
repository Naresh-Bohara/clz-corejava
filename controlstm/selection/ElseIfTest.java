package controlstm.selection;

public class ElseIfTest {
/*
 * ------------ Else if Test ---------------
 * # use when there are multiple conditions
 * # syntax:
 * 		if(){
 * 			
 * 		}else if(){
 * 		
 * 		}else if(){
 * 		
 * 		}else{
 * 		
 * 		}
 */
	
	public static void main(String[] args) {
		int marks = 80;
		
		if(marks>90) {
			System.out.println("Topper A+");
		}else if(marks>80) {
			System.out.println("Your grade is A");
		}else if(marks>70) {
			System.out.println("Your grade is B+");
		}else {
			System.out.println("You are below average student!");
		}
	}
	}

