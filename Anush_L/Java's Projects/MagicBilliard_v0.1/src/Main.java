
public class Main {
	
	public static void main(String[] args) {
		
		startGame(150);
		
	}
	
	public static void startGame(int gameTime) {
		int totalTime = 0;
		
		SimpleBoard board = new SimpleBoard(1000, 1000);
		SimpleBall ball1 = new SimpleBall(15, 15, 5, 1, board);
		SimpleBall ball2 = new SimpleBall(25, 35, 5, 2, board);
		SimpleBall ball3 = new SimpleBall(45, 65, 5, 3, board);
		GhostBall ball4 = new GhostBall(98, 67, 5, 4, board);
		BombBall ball5 = new BombBall(150, 75, 60, 5, board);
		
		while (totalTime < gameTime) {
			totalTime += Ball.interval;
			for (Ball ball : board.balls) {
				ball.move();
			}
			for (int i = 0; i < board.balls.length - 1; i++) {
				for (int j = i + 1; j < board.balls.length; j++) {
					board.balls[i].checkTouchBall(board.balls[j]);
				}
			}
		}
	}
	
}