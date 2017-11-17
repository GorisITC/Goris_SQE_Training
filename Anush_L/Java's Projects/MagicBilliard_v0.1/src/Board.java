
public interface Board {
	
	public void setColor(String color);
	
	public String getColor(String color);
	
	public void addBall(Ball ball, int number);
	
	public void removeBall(Ball ball);
	
	public double getWidth();
	
	public double getHeight();
}