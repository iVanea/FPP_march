package assignment9_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class SymbolBalancer {
	String ODD_DELIMITER = ""+(char)0;
	String filename;
	String text;
	char[] left;
	char[] right;
	public SymbolBalancer(String filename) {
		this.filename = filename;
		readFile();
	}
	public void setText(String text) {
		this.text = text;
	}
	
	boolean symbolsBalanced(String delimiters) {
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < delimiters.length(); i++) {
			char ch = delimiters.charAt(i);
			if (ch == '[' || ch == '(' || ch == '{' || ch == '<') {
				stack.push(ch);
			} else if (ch == ']') {
				if (stack.isEmpty() || stack.pop() != '[') {
					return false;
				}
			} else if (ch == ')') {
				if (stack.isEmpty() || stack.pop() != '(') {
					return false;
				}
			} else if (ch == '}') {
				if (stack.isEmpty() || stack.pop() != '{') {
					return false;
				}
			}else if (ch == '>') {
				if (stack.isEmpty() || stack.pop() != '<') {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}
	
	public static void main(String[] args) {
		SymbolBalancer sb = new SymbolBalancer("/Users/teamoteen/eclipse-workspace/lab9/src/assignment9_2/Employee.java");
		System.out.println(sb.symbolsBalanced("[]{}<>()||"));
		System.out.println(sb.symbolsBalanced(sb.text));
	}
	
	void readFile() {
		try {
			Scanner sc = new Scanner(new File(filename));
			sc.useDelimiter(ODD_DELIMITER);
			text = sc.next();
			System.out.println(text);
			sc.close();
		}
		catch(FileNotFoundException ex) {
			System.err.println("File Not Found Exception "+ex.getMessage());
		}
	}
	
}