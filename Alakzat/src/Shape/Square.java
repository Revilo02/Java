package Shape;

public class Square extends Shape {
	private double d;
	public Square(double a) {
		d=a;
	}
	public double getArea() {
		return d*d;
	}
	public double getPerimeter() {
		return 4*d;
	}
	public String toString() {
		return "Négyzet"+" "+" az oldala: "+d;
	}
}
