package assignment12_1;

@SuppressWarnings("serial")
public class IllegalTriangleException extends IllegalCurveException{

	public IllegalTriangleException() {
		super();
	}

	public IllegalTriangleException(Object x) {
		//super(arg0);
		super("An IllegalTriangleException was thrown in a " + x.getClass().getSimpleName() + " instance");
	}
	
	public IllegalTriangleException(String x) {
		//super(arg0);
		super("An IllegalTriangleException was thrown in a " + x.getClass().getSimpleName() + " instance");
	}

}
