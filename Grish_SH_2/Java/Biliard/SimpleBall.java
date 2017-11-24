public class SimpleBall extends Ball {

    public SimpleBall(double x, double y, double vx, double vy, double radius) {
        super(x, y, vx, vy, radius);
    }

    public void doAfterTouch(Ball ball) {
        double dx = this.x - ball.x;
        double dy = this.y - ball.y;
        double distance = Math.sqrt(dx * dx + dy * dy);
        if (this.radius + ball.radius >= distance) {
            System.out.println("Kpav");
            vy *= -1;
            vx *= -1;
            ball.vx *= -1;
            ball.vy *= -1;

        }

    }
}
