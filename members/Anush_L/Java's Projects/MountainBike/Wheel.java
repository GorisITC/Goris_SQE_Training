
public class Wheel {
	
	final double x;
	final double xx;
	final double y;
	final double yy;
	final double area;

	
	public Wheel(double x, double y, double xx, double yy) {
		this.x = x;
		this.xx = xx;
		this.y = y;
		this.yy = yy;
//		The area of circle: S = π * d^2 / 4
//		π = 3.14159 
//		diameter of circle equals to root of (xx -x) * (xx -x) + (yy - y) * (yy - y)
		this.area = (3.14159 * ((xx -x) * (xx -x) + (yy - y) * (yy - y)) / 4);
	}
	
	public double getArea(){
		return area;
	}
}
