package assignment12_1.closedcurve.good;

import assignment12_1.IllegalCurveException;

public class Circle extends ClosedCurve {
	double radius;

	public Circle(Double radius) throws IllegalCurveException {
		this(radius.doubleValue());
	}

	public Circle(double radius) throws IllegalCurveException {
		this.radius = radius;
		if (radius < 0)
			throw new IllegalCurveException(this);
	}

	public double computeArea() {
		return (Math.PI * radius * radius);
	}
}
