import org.omg.CORBA.INTERNAL;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Read {
    public static int ballCount=0;

    public static void Kardal() {
        final String fileName = "/home/arus/Java/Goris_SQE_Training/Arus_A/JavaProject/MagicBilliard/NewStartBalls.scv";
        int wigth=100;
        int length=100;

        Table table=new Table(wigth, length);
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String sCurrentLine;

            while ((sCurrentLine = br.readLine()) != null) {
                String[] values = sCurrentLine.split(", ");
                Ball ball = null;
                int x = Integer.valueOf(values[0]);
                int y = Integer.valueOf(values[1]);
                int vx = Integer.valueOf(values[2]);
                int vy = Integer.valueOf(values[3]);
                String type = values[4];
                if (values[4].equals("Simple")){
                    ball=new Ball(x, y, vx, vy, 1, type);
                    ballCount++;
                }
                else if (values[4].equals("Bomb")){
                    ball=new Bomb(x, y, vx, vy, 1, type);
                    ballCount++;
                }
                else if (values[4].equals("Transparent")){
                    ball=new Transparent(x, y, vx, vy, 1, type);
                    ballCount++;
                }
                table.addBall(ball);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}