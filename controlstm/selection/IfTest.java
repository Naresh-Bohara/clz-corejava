package controlstm.selection;

public class IfTest {
	/*
	 *  ------------- if -----------------
	 *  # syntax:
	 *  if(condition){
	 *  		// statements
	 *  }
	 * 
	 */
	public static void main(String[] args) {
		int salary = 29000;
		
		if(salary<30000) {
			salary += 10000;
		}
		
		System.out.println("salary = "+salary);
	}
}
