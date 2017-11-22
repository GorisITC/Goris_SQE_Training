import static java.lang.Math.sqrt;

public class Ball {
    public int x;
    public int y;
    public int vx;
    public int vy;
    public double radius;
    public String type;

    public Ball(int x, int y, int vx, int vy, double radius, String type){
        this.x=x;
        this.y=y;
        this.vx=vx;
        this.vy=vy;
        this.radius=radius;
        this.type=type;
    }
    public void move(double time){
        this.x+=vx*time;
        this.y+=vy*time;
    }

    public boolean didTouchBall(Ball ball){
        int dimensionX=this.x-ball.x;
        int dimensionY=this.y-ball.y;
        double distance=sqrt(dimensionX*dimensionX+dimensionY*dimensionY);
        if(this.radius+ball.radius<distance){
            return false;
        }else {
            return true;
        }
    }

    public void updateAfterTouch(Ball ball){
        this.vx=-this.vx;
        this.vy=-this.vy;
        ball.vx=-ball.vx;
        ball.vy=-ball.vy;
    }
}