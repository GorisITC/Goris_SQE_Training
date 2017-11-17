
public class SimpleBall extends Ball{

	public SimpleBall(double x, double y, double radius, int number, Board board) {
		super(x, y, radius, number, board);
	}
	
	public void checkTouchBall(Ball ball) {
		if (ball.getClass().getSimpleName().equals("Ghostball")) {
			
		} else if (ball.getClass().getSimpleName().equals("BomBall")) {
			ball.touchAction(SimpleBall.this);
		} else {
			touchAction(ball);
		}
	}
	
	public void touchAction(Ball ball) {
        double dx = this.x - ball.x;
        double dy = this.y - ball.y;
        double distance = Math.sqrt(dx * dx + dy * dy);
        if (this.radius + ball.radius >= distance) {
			vy *= -1;
			vx *= -1;
			ball.vx *= -1;
			ball.vy *= -1;
			System.out.println("tick");
		}
		
	}
}