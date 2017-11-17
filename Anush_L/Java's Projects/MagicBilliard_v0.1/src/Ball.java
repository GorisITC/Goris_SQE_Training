
public abstract class Ball{
	
	double radius;
	double x;
	double y;
	double vx;
	double vy;
	static final double interval = 0.2D;
	final int number;
	Board board;
	
	public Ball(double x, double y, double radius, int number, Board board) {
		this.x = x;
		this.y = y;
		this.radius = radius;
		this.number = number;
		this.board = board;
		board.addBall(Ball.this, number - 1);
		this.vx = 2;
		this.vy = 2;
	}
	
	public void move() {
			x += vx * interval;
			y += vy * interval;
			checkTouchBoard();
	}
	
	public void checkTouchBoard() {
		if ((x - radius <= 0 && vx < 0) || (x + radius >= board.getWidth() && vx > 0)) {
			vx = -vx;
		}
		if ((y - radius <= 0 && vy < 0) || (y + radius >= board.getHeight() && vy > 0)) {
			vy = -vy;
		}
	}
	
	public abstract void checkTouchBall(Ball ball);
	
	public abstract void touchAction(Ball ball);

}