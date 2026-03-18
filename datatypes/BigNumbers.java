package datatypes;

import java.math.BigInteger;

public class BigNumbers {
	 public static void main(String[] args) {
		 	// long radius = 123438784787344546l;
			System.out.println(Long.MAX_VALUE);
			System.out.println(Long.MAX_VALUE + 23);
			
			System.out.println(Double.MAX_VALUE);
			System.out.println(Double.MAX_VALUE + 234.3);
			
			/*
			 * --------whole number
			 * - BigInteger - 
			 * - BigDecimal - 
			 * 
			 */
			
			BigInteger a = BigInteger.valueOf(Long.MAX_VALUE);
			BigInteger b = BigInteger.valueOf(Long.MAX_VALUE);
			
			BigInteger c = a.add(b);
			System.out.println(c);
			
	}
}
