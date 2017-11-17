
public class SimpleBoard implements Board {
	
	double height;
	double width;
	String color;
	Ball[] balls = new Ball[5];
	
	public SimpleBoard(double height, double width) {
		this.height = height;
		this.width = width;
	}

	public double getWidth() {
		return width;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setColor(String color) {
		this.color = color;
		
	}

	public String getColor(String color) {
		return color;
	}

	public void addBall(Ball ball, int number) {
		balls[number] = ball;
		
	}

	public void removeBall(Ball ball) {
		balls[ball.number] = null;
		
	}

}