
public abstract class Ball {

    double radius;
    double x;
    double y;
    double vx;
    double vy;
    static final double interval = 0.2D;
    SimpleBoard board;

    public Ball(double x, double y, double vx, double vy, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.vx = vx;
        this.vy = vy;
    }

    public void move() {
        x += vx * interval;
        y += vy * interval;
    }

    public void Touch(Ball ball) {
        if ((x - radius <= 0 && vx < 0) || (x + radius >= board.getWidth() && vx > 0)) {
            vx = -vx;
        }
        if ((y - radius <= 0 && vy < 0) || (y + radius >= board.getHeight() && vy > 0)) {
            vy = -vy;
        }
        if (ball.getClass().getSimpleName().equals("Ghostball")) {

        } else if (ball.getClass().getSimpleName().equals("BombBall")) {
            ball.doAfterTouch(Ball.this);
        } else {
            ball.doAfterTouch(Ball.this);
        }
    }

    public void setBoard(SimpleBoard board) {
        this.board = board;
    }


    public abstract void doAfterTouch(Ball ball);

}
