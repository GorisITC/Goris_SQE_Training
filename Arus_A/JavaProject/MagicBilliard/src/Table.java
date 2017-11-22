import java.util.ArrayList;
import java.util.List;

public class Table {
    private int width;
    private int length;
    static final List<Ball> balls=new ArrayList<>();

    public Table(int width, int length){
        this.width=width;
        this.length=length;
    }

    public void addBall(Ball ball){
        balls.add(ball);
    }
}
