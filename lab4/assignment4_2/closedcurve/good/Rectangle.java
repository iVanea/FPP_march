package assignment4_2.closedcurve.good;

public class Rectangle extends ClosedCurve {
	private final double length, width;

	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
		// TODO Auto-generated constructor stub
	}

	@Override
	double computeArea() {
		// TODO Auto-generated method stub
		return (this.width*this.length);
	}


	
}
