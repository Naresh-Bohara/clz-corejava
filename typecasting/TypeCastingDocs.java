package typecasting;

public class TypeCastingDocs {
	
	/*
	 *  ---------- Type Casting --------------
	 *  -  converting of one primitive data type to  another primitive ddadta 			type	. 
	 *  1. Implicit type casting (widening --- converting to larger)
	 *  		- small data types ->  larger data types
	 *  		- byte -> short -> int ->  long -> float -> double
	 *  		- java does automatically by itself.
	 *  		- data don't loss during this...
	 *  
	 *  
	 *  2. Explicit Type Casting (narrowing --- converting to smaller)
	 *  		-  larger data types -> smaller data types.
	 *  		- double -> float -> long ->  int -> short ->  byte
	 *  		- may loss data during converting...
	 *  		- java doesn't do by itself, we need to use cast operator (manually)
	 *  		- syntax: (data_type) (value)
	 *  
	 */
 public static void main(String[] args) {
	 //  implicit type casting 
	 	byte age = 23;
	 	int my_age = age;
	 	
	 // explict  type casting
	 	double  height = 5.5;
	 	int my_height = (int) height;
	 	
	 	System.out.println(my_age);
	 	System.out.println(my_height);
	 	
	 	
 	}
}
