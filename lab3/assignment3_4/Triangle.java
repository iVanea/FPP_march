package assignment3_4;

public final class Triangle {

	private final double base;
	private final double height;

	Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}

	Triangle(double a, double b, double c) {

		double x;
		if ((a + b) <= c || (a + c) <= b || (b + c) <= a) {
			System.out
					.println("The sizes of the Triangle doesn't satisfy the Triangle Inequality Theorem");
			this.base = 0;
			this.height = 0;
		} else {
			this.base = a;
			x = (a * a + b * b - c * c) / (2 * a);
			this.height = Math.sqrt(b * b - x * x);
		}

	}

	public double computeArea() {
		return (0.5 * base * height);
	}

	public double getBaseOfTriangle() {
		return this.base;
	}

	public double getHeightOfTriangle() {
		return this.height;
	}
}
