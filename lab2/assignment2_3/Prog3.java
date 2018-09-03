package assignment2_3;

public class Prog3 {
	public static void main(String [] args) {
		/*
		 * numbers:
1.27, 3.881, 9.6
Output to the console the following two values:
1. the sum of the floats as an integer, obtained by casting the sum to type int
2. the sum of the floats as an integer, obtained by rounding the sum to the nearest
integer, using the Math.round function
		 */
		float number1= (float)1.27;
		float number2= (float) 3.881, number3 = (float)9.6;
		
		System.out.println("Real sum equal "+number1+" + "+number2+" + "+number3+" = "+ (number1+number2+number3));
		System.out.println("Sum equal "+number1+" + "+number2+" + "+number3+" = "+ (int)(number1+number2+number3));
		System.out.println("Rounded sum equal "+number1+" + "+number2+" + "+number3+" = "+ Math.round((number1+number2+number3)));
	}
}
