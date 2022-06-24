wpackage Shape;

public class Circle extends Shape {
		private double r;
		public Circle(double sugar) {
			r=sugar;
		}
		public double getArea() {
			return r*r*Math.PI;
		}
		public double getPerimeter() {
			return 2*r*Math.PI;
		}
		public String toString() {
			return "A kör"+" "+"sugara: "+r;
		}
}
