package assignment2_4;

/*
 * 
 The records of a database table Product have been stored in text format using delimiters
“:” and “,” in the following way: Different rows are separated by “:” and, within a
particular record, different column entries are separated by “,”. In each record, the first
column is always productId.
Write a program (called Prog4) that will read such a text file and extract all the product
id’s that occur in the file. Your program should then output these values to the console in
the following form: (this is a typical example)
134A
213A
911C
012E
662Z
Since we have not yet discussed how to read a file in Java, a text file is provided for you
in this assignment in the form of a separate Java class, called Data. The records have
been stored as a long String in Data, named records. To access this String within
your own program, you can use this line of code:
myString = Data.records;
 * 
 */


import java.io.*;
import java.lang.reflect.Array;
public class Prog4 {
	public static void main(String [] args) throws IOException {
		String fileName = "/Users/teamoteen/eclipse-workspace/FPP/lab2/assignment2_4/productData";
	    String line = null;
	   
	    try {
	        // FileReader reads text files in the default encoding.
	        FileReader fileReader = 
	            new FileReader(fileName);

	        // Always wrap FileReader in BufferedReader.
	        BufferedReader bufferedReader = 
	            new BufferedReader(fileReader);

	        while((line = bufferedReader.readLine()) != null) {
	        		System.out.println(line.split(",")[0]);
	            //System.out.println(line);
	        }   

	        // Always close files.
	        bufferedReader.close();         
	    }
	    catch(FileNotFoundException ex) {
	        System.out.println(
	            "Unable to open file '" + 
	            fileName + "'");                
	    }
	    catch(IOException ex) {
	        System.out.println(
	            "Error reading file '" 
	            + fileName + "'");                  
	        // Or we could just do this: 
	        // ex.printStackTrace();
	      }
	   
		
	}

}
