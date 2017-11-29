
public abstract class Ball{
	
	double radius;
	double x;
	double y;
	double vx;
	double vy;
	static final double interval = 0.2D;
	final String name;
	Board board;
	
	public Ball(double x, double y, double vx, double vy, double radius, String name) {
		this.x = x;
		this.y = y;
		this.radius = radius;
		this.name = name;
		this.vx = vx;
		this.vy = vy;
	}
	
	public void move() {
			x += vx * interval;
			y += vy * interval;
	}
	
	public void checkTouchBoard() {
		if ((x - radius <= 0 && vx < 0) || (x + radius >= board.getWidth() && vx > 0)) {
			vx = -vx;
		}
		if ((y - radius <= 0 && vy < 0) || (y + radius >= board.getHeight() && vy > 0)) {
			vy = -vy;
		}
	}
	
	public void setBoard(Board board) {
		this.board = board;
	}
	
	public abstract void checkTouchBall(Ball ball);
	
	public abstract void touchAction(Ball ball);

}