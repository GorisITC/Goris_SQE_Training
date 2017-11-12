// This class should include methods. Each of those should be one game.
public class Games {
	
	public static void main(String[] args) {
		magicBilliard(1);
	}
	
	private static void magicBilliard(int level) {
		SimpleBoard board = new SimpleBoard();
		Circle a = new Circle("Black", 100, 100, 10, true);
		Circle b = new Circle("Black", 120, 90, 10, true);
		Circle c = new Circle("Black", 130, 150, 10, true);
		Circle d = new Circle("Black", 140, 200, 10, true);
		if (level == 1) {
			Circle ga = new Circle("White", 50, 350, 10, false);
			Circle ba = new Circle("Black", 365, 15, 10, true, 1);
		}

	}
	
	private static void Billiard(int level) {
		
	}
	
	private static void snake(int level) {
		
	}
	
	private static void tetris(int level) {
		
	}
	
	// etc.
}
