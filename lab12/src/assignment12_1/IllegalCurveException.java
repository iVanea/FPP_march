package assignment12_1;

@SuppressWarnings("serial")
public class IllegalCurveException extends Exception{

	public IllegalCurveException() {
		super();
	}

	public IllegalCurveException(Object x) {
		super("An IllegalCurveException was thrown in a " + x.getClass().getSimpleName() + " instance");

	}
	
	public IllegalCurveException(String x) {
		super(x);
	}

}
