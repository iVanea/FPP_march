package protectedProblem.otherpkg;

import  protectedProblem.Subclass;

public class ExternalClass {
	public String readVal() {
		Subclass cl = new Subclass();
		return cl.getVal(); 
	}
	
	public void main(String [] args) {
		new ExternalClass();
	}
}


