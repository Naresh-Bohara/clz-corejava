package methods;

public class MethodTypes {
/*
 * 1. no return type with no argument
 * 2. no return type with argument
 * 3. return type with no argument
 * 4. return type with argument
 * 
 */
	
	public static void main(String[] args) {
//		div();	//no return type with no argument
		printTable(4); //no return type with argument
		add(2,4);		// no return type with argument
		
		int s = area();  // return type with no argument
//		System.out.println(((Object)s).getClass().getSimpleName());
		System.out.println("sum = "+(s+10));
		
		// return type with argument
//		String bio = myInfo("dammar",23, 5.5f);
//		System.out.println(bio);
		System.out.println(myInfo("dammar",23, 5.5f));
		System.out.println(myInfo("naresh",23, 5.5f));
		System.out.println(myInfo("pawan",22, 5.1f));
	}
	
	// 1. no return type with no argument
	static void div() {
		int a = 10;
		int b=3;
		System.out.println("div = "+(a/b));
	}
	
	// 2. no return type with argument
	static void printTable(int num){
		for(int i=1; i<=10; i++) {
			System.out.println(num +" x "+ i+" = "+(num*i));
		}
	}
	
	// add
	static void add(int a, int b) {
		int sum = a+b;
		System.out.println("sum = "+sum);
	}
	
	// 3. return type with no argument
	 static int area() {
		 int l = 12;
		 int b = 10;
		 int area = l*b;
		 return area;
	 }
	 
	 
	 
	// 4. return type with argument
	static String myInfo(String name, int age, float height) {
		String myBio = "my name is "+ name + ", my age is "+age +", my height is "+height;
		return myBio;
	}
}
