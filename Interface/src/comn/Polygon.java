package comn;

public class Polygon implements Square, Rectangle, Circle, Triangle {

	public void areaOfSquare(int s) {
		int area = s * s;
		System.out.println("Area of square is :" + area);
	}

	public void areaOfRectangle(int l, int b) {
		int area = l * b;
		System.out.println("Area of Rectangle is :" + area);
	}

	public void areaOfCircle(int r) {
		double area = 3.14 * r * r;
		System.out.println("Area of Circle is :" + area);
	}

	public void areaOfTriangle(int b, int h) {
		double area = 0.5 * b * h;
		System.out.println("Area of Triangle is :" + area);
	}
}
