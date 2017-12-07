import java.util.ArrayList;
import java.util.List;

public class GamePlay {
    List<Ball> balls = new ArrayList<>();

    public void letsStart() {

        balls = Read.getBalls();
    }

    public void run(double time) {
        int winCount = 0;
        while (time > 0) {
            for (Ball ball : balls) {
                ball.move(10);
            }
            for (int i = 0; i < balls.size(); ++i) {
                for (int j = i + 1; j < balls.size(); ++j) {
                    Ball first = balls.get(i);
                    Ball second = balls.get(j);
                    if(first.equals(BallsType.Simple) && first.didTouchBall(second)){
                        System.out.println("tick");
                        winCount++;
                        first.updateAfterTouch(second);
                    }
                    if(first.equals(BallsType.Transparent) && first.didTouchBall(second)){
                        System.out.println("tick");
                        winCount++;
                        first.updateAfterTouch(second);
                    }
                    if(first.equals(BallsType.Bomb) && first.didTouchBall(second)){
                        System.out.println("tick");
                        winCount++;
                        first.updateAfterTouch(second);
                    }
                }
            }
            time -= 0.1;
        }
        System.out.println("The balls are touched " + winCount + " times.\n" + "The result can be found in the " + "GameResults.csv" + " file");
    }
}
