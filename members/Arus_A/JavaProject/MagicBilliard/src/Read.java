import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Read {
    static int ballCount=0;
    static ArrayList<Ball> balls=new ArrayList<>();
    /**
     read each ball info(x,y,vx,vy,type) from the "NewStartBalls.scv" file and make the ball arraylist.
     */

    public static void readBallInfo(String fileName) {
        String sCurrentLine;
        String[] values;
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            for (int i=0; i<=ballCount && (sCurrentLine = br.readLine()) != null;i++) {
                values = sCurrentLine.split(", ");
                int x = Integer.valueOf(values[0]);
                int y = Integer.valueOf(values[1]);
                int vx = Integer.valueOf(values[2]);
                int vy = Integer.valueOf(values[3]);
                String type = values[4];
                if (values[4].equals("Simple")){
                    balls.add(new Ball(x, y, vx, vy, type));
                    Read.ballCount++;
                }
                else if (values[4].equals("Bomb")){
                    balls.add(new Bomb(x, y, vx, vy, type));
                    Read.ballCount++;
                }
                else if (values[4].equals("Transparent")){
                    balls.add(new Transparent(x, y, vx, vy, type));
                    Read.ballCount++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Ball> getBalls(){
        return balls;
    }
}