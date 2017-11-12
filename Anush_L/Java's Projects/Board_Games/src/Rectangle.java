
public class Rectangle implements MainObject {
	
	String color;
	double[] position;
	double area;
	boolean touch;
	
//	Constructor for Square
	public Rectangle(String color, double x, double y, double area, boolean touch) {
		this.color = color;
		this.position = new double[] {x, y};
		this.area = area;
		this.touch = touch;
	}


	public String color() {
		// TODO Auto-generated method stub
		return null;
	}

	public double[] position() {
		// TODO Auto-generated method stub
		return null;
	}

	public double area() {
		// TODO Auto-generated method stub
		return 0;
	}

	public double[] movement(double vx, double vy) {
		// TODO Auto-generated method stub
		return position;
	}

	public void touchFeature(boolean touch) {
		// TODO Auto-generated method stub
		
	}

}
