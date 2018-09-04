package assignment3_4;

public final class Circle {

	private final double radius;

	Circle(double radius) {
		this.radius = radius;
	}

	public double computeArea() {
		return (Math.PI * this.radius * this.radius);
	}

	double getCircleRadius() {
		return this.radius;
	}
}
