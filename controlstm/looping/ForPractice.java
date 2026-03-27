package controlstm.looping;

public class ForPractice {
public static void main(String[] args) {
	
//	for(;;) {
//		System.out.println("------- Hacking -----------");
//	}
	
//	q1. 1,2,3,4,5,....., 99, 100
//	q2. 2, 4, 6, 8, ....., 200
//	q3. 3, 6, 9, 12, 15
//  q4. sum up to 1-100
	
	int sum = 0;
	for(int i=1; i<=100; i++) {
		sum = sum + i;
	}
	/*
	 * iteration-1:
	 * i =1 --------1<100? ----------yes......>
	 * sum  = 0+1--------1;
	 * print(1-->sum ko value)
	 * 
	 * iteration-2:
	 * i=2 -------2<100? ---------yes .....>
	 * sum = 1+2 = 3
	 * print(3)
	 * 
	 * iteration------......
	 * i = 101.....101<=100? -------false
	 * exit loop
	 * 
	 */
	
	System.out.println("Final sum value from 1 to 100 is: "+sum);
}
}
