package protectedProblem;

//inside firstpackage
public class HiddenClass {
	private String val = "val";
	
	protected String getVal() {
		System.out.print("Hell");
		return val;
		
	}
}



