package controlstm.selection;

public class SwitchTest {
/*
 * ---------Switch case / statement
 * # use when one varibale is compared against multiple values
 * # syntax:
 * switch(varibale){
 * 	case value1:
 * 		// statement
 * 	break;
 * 	case value2:
 * 		// stements
 * 	break;
 * case value3:
 * 		// stements
 * 	break;
 * .............
 * .............
 * default:
 * 		// statements
 * 
 */
	
	public static void main(String[] args) {
		int day =2;
		
		switch(day) {
		case 1:
			System.out.println("It's sunday");
			break;
		case 2:
			System.out.println("Moday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thrusday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;
		default:
			System.out.println("Invalid value...");
		}
	}
}
