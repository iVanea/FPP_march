package assignment2_5;

import java.util.Scanner;

/*
 * Write a program (called Prog5) that asks the user to input a String. The output is the
characters of this String in reverse order, which should be written to the console. (For
example, if the input string is "Hello", the ouptut string would be "olleH".) (Do not use
arrays and do not create a new String object. In particular, you may not use Java library
functions that peform the reverse operation for you, such as the reverse functions found
in StringBuilder and StringBuffer.)
 * 
 */
public class Prog5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Type a word:");
		String val = sc.next();
		
		System.out.println(reverse(val));
		
		sc.close();
		
		
	}
	
	public static String reverse(String val){
		if(val.length()==0)
			return "";
		int sLength = val.length();
		for(int i = sLength-1; i >= 0; i--)
		{
			char c = val.charAt(i);
			val +=c;
		}
		 
		return val.substring(sLength);
	}

}
