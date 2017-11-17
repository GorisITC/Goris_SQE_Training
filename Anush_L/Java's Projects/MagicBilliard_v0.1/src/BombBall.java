
public class BombBall extends Ball {

	public BombBall(double x, double y, double radius, int number, Board board) {
		super(x, y, radius, number, board);
	}
	
	public void checkTouchBall(Ball ball) {
		if (ball.getClass().getSimpleName().equals("Ghostball")) {
			
		} else {
			touchAction(ball);
		}
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