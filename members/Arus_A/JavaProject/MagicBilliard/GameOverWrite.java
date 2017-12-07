import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class GameOverWrite {

    public static void grel(String output) throws IOException{
        List<Ball> balls;
        File file = new File(output);
        file.createNewFile();

        FileWriter wr=new FileWriter(file);

        for (int i = 0; i <Read.ballCount; i++){
            balls = Read.getBalls();
            String info=balls.get(i).x+", "+balls.get(i).y+", "+balls.get(i).vx+", "+balls.get(i).vy+", "+balls.get(i).type+"\n";
            wr.write(info);
            wr.flush();
        }
        wr.close();
    }
}
