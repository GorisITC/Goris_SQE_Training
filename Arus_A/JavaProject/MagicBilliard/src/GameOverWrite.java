import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class GameOverWrite {

    public static void Grel() throws IOException{
        final ArrayList<Ball> balls = new ArrayList<>();
        File file = new File("/home/arus/Java/Goris_SQE_Training/Arus_A/JavaProject/MagicBilliard/GameResults.csv");
        file.createNewFile();
        FileWriter wr=new FileWriter(file);

        for (int i = 0; i <Read.ballCount ; i++) {
            String ballString="Petq e tpvi resulty\n";
            wr.write(ballString);
            wr.flush();
        }
        wr.close();
    }
}
