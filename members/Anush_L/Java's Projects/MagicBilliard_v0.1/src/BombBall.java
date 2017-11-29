
public class BombBall extends Ball {

	public BombBall(double x, double y, double vx, double vy, double radius, String name) {
		super(x, y, vx, vy, radius, name);
	}
	
	public void checkTouchBall(Ball ball) {
		if (ball.getClass().getSimpleName().equals("Ghostball")) {
			
		} else {
			touchAction(ball);
		}
		checkTouchBoard();
	}
	
	public void touchAction(Ball ball) {
        double dx = this.x - ball.x;
        double dy = this.y - ball.y;
        double distance = Math.sqrt(dx * dx + dy * dy);
        if (this.radius + ball.radius >= distance) {
			board.removeBall(ball);
			board.removeBall(BombBall.this);
			System.out.println("Boooom");
		}
	}

}