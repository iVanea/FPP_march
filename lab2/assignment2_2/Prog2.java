package assignment2_2;
/*
 * Create a class called Prog2. In the main method of the class, output to the console the
* result of doing the following two computations:
* 1. get a random number x in the range 1 .. 9 and compute PI pow x
* 
* 2. get a random number y in the range 3 .. 14 and compute y pow PI
*
* Use the RandomNumbers.java class that has been provided for you. (Do not use the
* Random class directly.)
 */
public class Prog2 {
	public static void main (String [] args) {
		RandomNumbers n = new RandomNumbers(1,9);
		System.out.println(Math.pow(Math.PI, n.generateNumber()));
		System.out.println(Math.pow(Math.PI, n.stupidGenerator()));
		System.out.println(Math.pow(n.generateNumber(),Math.PI));
		System.out.println(Math.pow(n.stupidGenerator(),Math.PI));
		
		for (int i = 0; i<20;i++)
			System.out.print(n.generateNumber());
		System.out.println("---");
		for (int i = 0; i<20;i++)
			System.out.print(n.stupidGenerator());
	}
}
