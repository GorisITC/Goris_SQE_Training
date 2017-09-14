
public class Area {
	public static void main(String[] args) {
		System.out.println("The area of circle is " + area(0, 2, 4, 2));
		System.out.println("The area of triangle is " + area(2, 2, 4, 4, 6, 2));
		System.out.println("The area of rectangle is " + area(2, 2, 4, 4, 8, 4, 6, 2));
	}
	public static double area(double x, double y, double xx, double yy) {
//		The area of circle: S = π * d^2 / 4
//		π = 3.14159 
//		diameter of circle equals to root of (xx -x) * (xx -x) + (yy - y) * (yy - y)
		return (3.14159 * ((xx -x) * (xx -x) + (yy - y) * (yy - y)) / 4);
	}
	public static double area(double x, double y, double xx, double yy, double xxx, double yyy) {

//		ab, bc, ac are sides of triangle
		double ab = side(x, y, xx, yy);
		double bc = side(xx, yy, xxx, yyy);
		double ac = side(x, y, xxx, yyy);
//		ph is half of the perimeter of the triangle		
		double ph = (ab + bc + ac) / 2;
//		s is area of triangle
		double s = Math.sqrt(ph * (ph - ab) * (ph - ac) * (ph - bc));
		return s;
	}
	public static double area(double x, double y, double xx, double yy, double xxx, double yyy, double xxxx, double yyyy) {

//		ab, bc, ac cd are sides of triangle
		double ab = side(x, y, xx, yy);
		double ad = side(x, y, xxxx, yyyy);
//		s is area of rectangle
		double s = ab * ad;
		return s;
	}
	public static double side(double x, double y, double xx, double yy) {
//		a is a line from to points (x, y; xx, yy)
		double a = Math.sqrt((xx -x) * (xx -x) + (yy - y) * (yy - y));
		return a;
	}
} 
