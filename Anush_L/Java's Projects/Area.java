
public class Area {
	public static void main(String[] args) {
		System.out.println(area(0, 2, 4, 2));
		System.out.println(area(2, 2, 4, 4, 6, 2));
		System.out.println(area(2, 2, 4, 4, 8, 4, 6, 2));
	}
//	Method for Circle
	public static double area(double x, double y, double xx, double yy) {
//		The area of circle: S = π * d^2 / 4
//		π = 3.14159 
//		diameter of circle equals to root of (xx -x) * (xx -x) + (yy - y) * (yy - y)
		double s = 3.14159 * ((xx -x) * (xx -x) + (yy - y) * (yy - y)) / 4;
        	if (x == xx && y == yy) {
            		System.out.print("Your area is not a circle. It is a dot. But if you think that it is a circle, be shure that it's area is ");
           		s = 0;
            		return s;
        	}
        	System.out.print("The area of circle is ");
        	return s;
	}
//	Method for Triangle
	public static double area(double x, double y, double xx, double yy, double xxx, double yyy) {

//		ab, bc, ac are sides of triangle
		double ab = side(x, y, xx, yy);
		double bc = side(xx, yy, xxx, yyy);
		double ac = side(x, y, xxx, yyy);
//		ph is half of the perimeter of the triangle		
		double ph = (ab + bc + ac) / 2;
//		s is area of triangle
		double s = Math.sqrt(ph * (ph - ab) * (ph - ac) * (ph - bc));
		if ((x == xx && y == yy) || (x == xxx && y == yyy) || (xx == xxx && yy == yyy)) {
            		System.out.print("Your area is not a triangle. But if you think that it is a triangle, be shure that it's area is ");
            		s = 0;
            		return s;
        	}
        	System.out.print("The area of triangle is ");
		return s;
	}
//	Method for Rectangle
	public static double area(double x, double y, double xx, double yy, double xxx, double yyy, double xxxx, double yyyy) {
//		ab, bc, ac, cd are sides of rectangle
		double ab = side(x, y, xx, yy);
		double ad = side(x, y, xxxx, yyyy);
//		s is area of rectangle
		double s = ab * ad;
		if ((x == xx && y == yy) || (x == xxx && y == yyy) || (x == xxxx && yyy == yyyy) || (xx == xxx && yy == yyy)|| (xx == xxxx && yy == yyyy) || (xxx == xxxx && yyy == yyyy)) {
            		System.out.print("Your area is not a rectangle. But if you think that it is a rectangle, be shure that it's area is ");
            		s = 0;
            		return s;
        	}
       	 	System.out.print("The area of rectangle is ");
		return s;
	}
//	Method for Line with 2 Dots
	public static double side(double x, double y, double xx, double yy) {
//		a is a line from to points (x, y; xx, yy)
		double a = Math.sqrt((xx -x) * (xx -x) + (yy - y) * (yy - y));
		return a;
	}
} 
