import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Main {
	
	public static void main(String[] args) {
				
	    double width = 0;
	    double height = 0;
	    double time = 0;
	    String input = null;
	    String output = null;
		
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
			    String[] values = line.split(",");
			    if (values[0].equals("Simple")) {
			    	SimpleBall ball = new SimpleBall(Double.valueOf(values[1]), Double.valueOf(values[2]), Double.valueOf(values[3]), Double.valueOf(values[4]), 5, values[5]);
				    board.addBall(ball);

			    } else if (values[0].equals("Bomb")) {
			        BombBall ball = new BombBall(Double.valueOf(values[1]), Double.valueOf(values[2]), Double.valueOf(values[3]), Double.valueOf(values[4]), 5, values[5]);
				    board.addBall(ball);

			    } else if (values[0].equals("Ghost")) {
			       GhostBall ball = new GhostBall(Double.valueOf(values[1]), Double.valueOf(values[2]), Double.valueOf(values[3]), Double.valueOf(values[4]), 5, values[5]);
				    board.addBall(ball);

			    }
			}
		} catch (FileNotFoundException e) {
			System.out.println("Sorry, your file is not found.");
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
        
		board.game(time, output);
	}
	
}