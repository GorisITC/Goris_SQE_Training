import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

public class GameOverWrite {
    private final ArrayList<Ball> balls = new ArrayList<>();

    File file =new File("/home/arus/Java/Goris_SQE_Training/Arus_A/JavaProject/MagicBilliard/GameResults.csv");
    file.cr

        for (Ball ball: balls) {
        String ballString = ball.x + "," + ball.y + "," + ball.vx + ","
                + ball.vy + "," + ball.type;
        bf.write(ballString);
        bf.newLine();
    }
        bf.close();
}
