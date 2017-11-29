import java.io.*;

public class Game {
    public static void main(String[] args) throws IOException {

        double width = 0;
        double height = 0;
        double time = 0;
        String input = null;
        String output = null;

        for (int i = 0; i < args.length-1; ++i) {
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
        Table table = new Table(width, height);
        BufferedReader reader = new BufferedReader(new FileReader(input));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] values = line.split(",");
            Ball ball = null;
            double x = Double.valueOf(values[1]);
            double y = Double.valueOf(values[2]);
            double vx = Double.valueOf(values[3]);
            double vy = Double.valueOf(values[4]);
            String name = values[5];
            if (values[0].equals("Simple")) {
                ball = new Ball(x, y, vx, vy, 1, name);
            } else if (values[0].equals("Bomb")) {
                ball = new Bomb(x, y, vx, vy, 1, name);
            } else if (values[0].equals("Ghost")) {
                ball = new Ghost(x, y, vx, vy, 1, name);
            }
            table.addBall(ball);
        }
       table.run(time,output);
    }
}
