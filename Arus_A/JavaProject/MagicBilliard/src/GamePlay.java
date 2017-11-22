import java.util.ArrayList;
import java.util.List;

public class GamePlay {
    static final List<Ball> balls=new ArrayList<>();

    static void run(double time, String output){
        while (time>0){
            for(Ball ball : balls){
                ball.move(0.1);
            }
            for (int i = 0; i < balls.size(); ++i) {
                for (int j = i+1; j < balls.size(); ++j) {
                    Ball first=balls.get(i);
                    Ball second=balls.get(j);
                    if(first.didTouchBall(second)){
                        System.out.println("tick");
                        first.updateAfterTouch(second);
                    }
                }
            }
            time-=0.1;
        }
        System.out.println("Game Over\n");
    }
}
