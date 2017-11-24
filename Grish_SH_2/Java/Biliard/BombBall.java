public class BombBall extends Ball {

    public BombBall(double x, double y, double vx, double vy, double radius) {
        super(x, y, vx, vy, radius);
    }

    public void doAfterTouch(Ball ball) {
        double dx = this.x - ball.x;
        double dy = this.y - ball.y;
        double distance = Math.sqrt(dx * dx + dy * dy);
        if (this.radius + ball.radius >= distance) {
            board.removeBall(ball);
            board.removeBall(BombBall.this);
            System.out.println("Paytec");
        }
    }

}
