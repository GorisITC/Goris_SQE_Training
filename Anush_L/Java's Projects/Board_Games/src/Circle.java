
public class Circle extends SimpleBoard implements MainObject {
	
	String color;
	double[] position;
	double radius;
	double area;
	boolean touch; // If false, Ball is Ghost
	int power = 0;

//	Constructor for Simple / Ghost ball
	public Circle(String color, double x, double y, double radius, boolean touch) {
		this.color = color;
		this.position = new double[] {x, y};
		this.radius = radius;
		this.touch = touch;
	}
	
//	Constructor for Bomb ball
	public Circle(String color, double x, double y, double radius, boolean touch, int power) {
		this.color = color;
		this.position = new double[] {x, y};
		this.radius = radius;
		this.touch = touch;
		this.power = power;
	}
	
	public String color() {
		// TODO Auto-generated method stub
		return color;
	}

	public double[] position() {
		// TODO Auto-generated method stub
		return position;
	}

	public double area() {
		
		return area;
	}

	public double[] movement(double vx, double vy) {
		if (position[0] + radius == getWidth()) {
			vx = -vx;
		}
		if (position[1] + radius == getHeight()) {
			vy = -vy;
		}
		position[0] += vx;
		position[1] += vy;
		return position;
	}

	public void touchFeature(boolean touch) {
		// TODO Auto-generated method stub
		
	}

}
