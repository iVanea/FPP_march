package assignment3_4;

public final class Rectangle {

	private final double width;
	private final double height;

	Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public double computeArea() {

		return width * height;
	}

	public double getWidthOfRect() {
		return this.width;
	}

	public double getHeightOfRect() {
		return this.height;
	}
}
