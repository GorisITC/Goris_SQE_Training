import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Main {

    public static void main(String[] args) {

        double width = 0;
        double height = 0;
        double time = 0;
        String input = null;
        String output = null;
        double x;
        double y;
        double vx;
        double vy;
        double radius = 15;

        for (int i = 0; i < args.length; i++) {
            if (args[i].equals("--width")) {
                width = Double.valueOf(args[++i]);
            }
            if (args[i].equals("--heigth")) {
                height = Double.valueOf(args[++i]);
            }
            if (args[i].equals("--time")) {
                time = Double.valueOf(args[++i]);
            }
            if (args[i].equals("--input")) {
                input = args[++i];
            }
            if (args[i].equals("--output")) {
                output = args[++i];
            }
        }

        SimpleBoard board = new SimpleBoard(height, width);

        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(input));
            String line;
            while ((line = reader.readLine()) != null) {
                Ball ball;
                String[] values = line.split(",");
                x = Double.valueOf(values[1]);
                y = Double.valueOf(values[2]);
                vx = Double.valueOf(values[3]);
                vy = Double.valueOf(values[1]);
                if (values[0].equals("simple")) {
                    ball = new SimpleBall(x, y, vx, vy, radius);
                    board.addBall(ball);

                } else if (values[0].equals("bomb")) {
                    ball = new BombBall(x, y, vx, vy, radius);
                    board.addBall(ball);

                } else if (values[0].equals("ghost")) {
                    ball = new GhostBall(x, y, vx, vy, radius);
                    board.addBall(ball);

                }
            }
        } catch (FileNotFoundException e) {
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        board.game(time, output);
    }

}
