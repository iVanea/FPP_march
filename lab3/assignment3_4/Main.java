package assignment3_4;

public class Main {

	public static void main(String[] args) {
		Triangle triangle = new Triangle(12.5, 5);
		Rectangle rectangle = new Rectangle(3.4, 4.4);
		Circle circle = new Circle(2.5);

		System.out.println("Area of Triangle is " + triangle.computeArea());
		System.out.println("Area of Rectangle is " + rectangle.computeArea());
		System.out.println("Area of Circle is " + circle.computeArea());
		System.out
				.println("This is Triangle Area with three sides passed as arguments:");
		Triangle tri = new Triangle(5, 2, 4);
		System.out.println(tri.computeArea());

	}

}
