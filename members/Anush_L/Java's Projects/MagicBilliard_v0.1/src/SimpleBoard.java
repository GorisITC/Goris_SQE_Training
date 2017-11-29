import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class SimpleBoard implements Board {
	
	final double height;
	final double width;
	String color;
	public final ArrayList<Ball> balls = new ArrayList<Ball>();
	 
	public SimpleBoard(double height, double width) {
		this.height = height;
		this.width = width;
	}

	public double getWidth() {
		return width;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setColor(String color) {
		this.color = color;
		
	}

	public String getColor(String color) {
		return color;
	}

	public void addBall(Ball ball) {
		balls.add(ball);
		ball.setBoard(SimpleBoard.this);
		
	}

	public void removeBall(Ball ball) {
		balls.remove(ball);
		
	}
	
	public void game(double time, String output) {	
		int totalTime = 0;
		while (totalTime < time) {
			totalTime += Ball.interval;
			for (Ball ball : SimpleBoard.this.balls) {
				ball.move();
			}
			for (int i = 0; i < SimpleBoard.this.balls.size() - 1; i++) {
				for (int j = i + 1; j < SimpleBoard.this.balls.size(); j++) {
					SimpleBoard.this.balls.get(i).checkTouchBall(SimpleBoard.this.balls.get(j));
				}
			}
		}
		FileWriter writer;
		try {
			writer = new FileWriter(output);
			BufferedWriter out = new BufferedWriter(writer);
			for (Ball ball:SimpleBoard.this.balls){
				String ballstring = ball.x + "," + ball.y + "," + ball.vx + "," + ball.vy + "," +  ball.name;
				out.write(ballstring);
				out.newLine();
			}
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}