package assignment2_7;
/*
 * 2_9 but is 2_7
 * 
 * Write a program that generates a random set of 8 addition problems (intended for a child
in elementary school). Numbers to be added should be randomly chosen from the range
1..99. Each run of the program should result in a different set of problems (actually, there
is a tiny probablity that two runs of the program will produce the same set of problems,
but I don’t expect anyone will encounter this). Console output should be formatted like
this:
       29        38        59        66 
     + 43      + 37      + 68      + 14 
    _____     _____     _____     _____ 
    
           66        40        16        54 
     + 77      + 88      + 98      + 76 
    _____     _____     _____     _____ 
A Hint is provided in the folder that accompanies this assignment, in this directory.
 */

public class Program7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i<2; i++)
		{
			showExercise();
		}

	}
	
	public static int getRandomNumber() {
		return (int)(Constants.MIN + (Math.random() * (Constants.MAX - Constants.MIN)));
	}
	
	public static void showExercise() {
		String plus = "+";
		String line = "_____";
		String fs;
		
		fs = String.format("%20d %9d %9d %9d %n",getRandomNumber(),getRandomNumber(),getRandomNumber(),getRandomNumber());
		fs = fs + String.format("%17s%3d %6s%3d %6s%3d %6s%3d %n", plus, getRandomNumber(), plus, getRandomNumber(), plus, getRandomNumber(), plus, getRandomNumber());
		fs = fs + String.format("%20s %9s %9s %9s %n%n%n", line, line, line, line);
		
		System.out.println(fs);
			
	}

}
