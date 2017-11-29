public class Piece {
	String name;
	String color;
	boolean existence = true;
	String[][] board = new String[8][8];
	String piecePlace;
	int placel;
	int placef;
	int backl;
	int backf;
	boolean checkBack = false;
	
	public void start () {
		existence = true;
		if (name.equals("King")); {
			placef = 3;
			if (color.equals("Black")) {
				piecePlace = " K ";
				board[7][placef] = piecePlace;
				placel = 7;
			} else if (this.color.equals("White")) {
				piecePlace = " k ";
				board[0][placef] = piecePlace;
				placel = 0;
			}
		}
		setBoard();
		setPrintBoard();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		if (color.equals("Black") || color.equals("White")) {
			this.color = color;
		} else {
			System.out.println("Please choose Black or white as a color of pieces.");
		}
	}

	public boolean getExistence() {
		System.out.println("Existence of a " + color + " " + name + ": " + existence);
		return existence;
	}

	public void setExistence(boolean existence) {
		this.existence = existence;
	}

	
	public String getPiecePlace() {
		return piecePlace;
	}
	
	public void setPiecePlace(int a, int b) {
		if (existence == true) {
			boolean check = true;
			if (a-1 < 0 || a-1 > 7 || b-1 < 0 || b-1 > 7) {
				System.out.println("You are going to be out of board.");
				check = false;
			} else if ((a == placel + 2 || a == placel || a-1 == placel) && (b == placef+ 2 || b == placef || b-1 == placef)) {
				if ((placel % 2 == 0 && placef % 2 == 0) || (placel % 2 > 0 && placef % 2 > 0)) {
					this.board[placel][placef] = "   ";					
				} else {
					this.board[placel][placef] = "|||";
				}
				this.board[a-1][b-1] = this.piecePlace;
				backl = placel;
				backf = placef;
				placel = a - 1;
				placef = b - 1;
				check = false;
				checkBack = true;
			}
			if (check == true) {
				System.out.println("Unfortunately your move is impossible.");
			}
			setPrintBoard();
		} else {
			System.out.println("Your piece does not exist on a board. Please start a new game or make existence true.");
		}
	}
	
	public void setBack(){
		if (existence == true) {
			if (checkBack == true) {
				if ((placel % 2 == 0 && placef % 2 == 0) || (placel % 2 > 0 && placef % 2 > 0)) {
					this.board[placel][placef] = "   ";					
				} else {
					this.board[placel][placef] = "|||";
				}
				this.board[backl][backf] = this.piecePlace;
				placel = backl;
				placef = backf;
				checkBack = false;
				setPrintBoard();
			} else {
				System.out.println("You are not able to move back at this time.");
			}
		} else {
			System.out.println("Your piece does not exist on a board. Please start a new game or make existence true.");
		}
	}

	public void setBoard() {
		for (int i = 0; i < this.board.length; i++) {
			for (int j = 0;j < this.board.length; j++) {
				if (board[i][j] != piecePlace) {
					if ((i % 2 == 0 && j % 2 == 0) || (i % 2 > 0 && j % 2 > 0)) {
						this.board[i][j] = "   ";					
					} else {
					this.board[i][j] = "|||";
					}
				}
			}
		}
	}
	
	public void setPrintBoard() {
		getPiecePlace();
		System.out.print("  ");
		for (int i = 1; i <= 8; i++) {
			System.out.print("_" + i + "_");
		}
		System.out.println("");	
		for (int i = 0; i < this.board.length; i++) {
			System.out.print(i+1 + "|");
			for (int j = 0;j < this.board.length; j++) {
				System.out.print(board[i][j]);
			}
			System.out.println("|");
		}
		System.out.print("  ");
		for (int i = 1; i <= 8; i++) {
			System.out.print("---");
		}
		System.out.println("");
	}
}
