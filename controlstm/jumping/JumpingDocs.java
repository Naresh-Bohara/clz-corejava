package controlstm.jumping;

public class JumpingDocs {
/*
 * 	 3. branching (jumping): loop --jump--skip--exit---
		 * 		a. break
		 * 		b. continue
		 * 		c. return
 */
	
	public static void main(String[] args) {
		for(int i =0; i<=10; i++) {
			
			if(i==6 || i==4) {
//				break; ---> loop break/exit
//				continue;--> skip iteration for those condition
//				return; ----> exit from method/function -- in which loop is...
			}
			System.out.println(i);
		}
		System.out.println("---------end of for loop----------");
	}
}
