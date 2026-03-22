package typecasting;

public class IncrementTest {
	public static void main(String[] args) {
		int a = 10;
//		System.out.println(a+=4);
//		System.out.println(a); 
		
//		System.out.println(a++); // ?  10, 10 
////		
//		System.out.println(a + 5); // ?15, 16 , 
//		
//		System.out.println(a+=5); // ?5, 21 //a = a+5; //16
//		
//		System.out.println(++a); // ?11, 22  //17
////		
//		System.out.println(++a + a++); // ?21, 46 //36
////		
//		System.out.println(a); // ? 10, 24 //19
		
		
		
//		int a = 10;
//		int b = 2;
		
//		System.out.println(--a + b--);   // 10, 11, 9+2 == 11
//		System.out.println(b--);		    // 10, 0,   			1 
//		System.out.println(--b);			// 9, -1, 			-1
//		System.out.println(a-- + --a);	// 17, 16, 9+7 = 16
//		System.out.println(a);			// 10, 7,  //7  
//		System.out.println(b);			// 9, -1, -1
		
//		x = x+4;

		int x= 7;
		int y = 11;
		System.out.println(--x + --x - x--); 	// 6, 6, 6+5-5=6
		System.out.println(x+=4);				// 10, 8, =8
		System.out.println(x++ +  ++x - x++);	// 11, 4, 8+10-10 = 8
		System.out.println(x + y++);				// 22, 18, //22
		System.out.println(x + ++y);				// 23, 20, 11+13=24
		System.out.println(x);					// 11, 7, 11
		System.out.println(y);					// 14, 13,13
		
		
	}
}
