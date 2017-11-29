
public class GhostBall extends Ball{

	public GhostBall(double x, double y, double vx, double vy, double radius, String name) {
		super(x, y, vx, vy, radius, name);
	}
	
	public void checkTouchBall(Ball ball) {
		checkTouchBoard();
	}

	public void touchAction(Ball ball) {
		
	}

}