import java.util.InputMismatchException;
import java.util.Scanner;

public class Game {
	String player;
	String x = "[X]";
	String o = "[O]";
	String empty = "[ ]";
	boolean winner;
	boolean noWinner = true;
	short no = 0;
	boolean game = true;
	String[][] board = new String[3][3];
	boolean turn = true;
	String name1;
	String name2;
	String name;
	
	public void setStart() {
		Scanner u1 = new Scanner(System.in);
		System.out.println("Please enter a name of first user: ");
		this.name1 = u1.next();
	
		Scanner u2 = new Scanner(System.in);
		System.out.println("Please enter a name of second user: ");
		this.name2 = u2.next();
	
		User user1 = new User();
		user1.setName(name1);

		User user2 = new User();
		user2.setName(name2);
	
		setBoard();
		while (game == true) {
			getBoard();
			setTurn();
		}
	}
	
	public void setTurn () {
		if (game == true) {
			if (turn == true) {
				name = name1;
				user(name, turn);
				turn = false;
			} else if (turn == false) {
				name = name2;
				user(name, turn);
				turn = true;
			}
		}
	}
	

	
	public void user(String name, boolean turn) {
		try {
			Scanner cor1 = new Scanner(System.in);
			System.out.println(name + ", please enter the cordinates of your move: ");
			System.out.println("First coordinate: ");
			short corf = cor1.nextShort();
			if (corf > 3 || corf < 1) {
				System.out.println("Board coordinates are from 1 to 3");
				user(name, turn);
			} else {
				System.out.println("Second coordinate: ");
				short cors = cor1.nextShort();
				if (cors > 3 || cors < 1) {
					System.out.println("Board coordinates are from 1 to 3");
					user(name, turn);
				} else {
					printBoard(corf - 1, cors - 1, turn);
				}
			}
		} catch (InputMismatchException e) {
			System.out.println("You should enter a number.");
			user(name, turn);
		} 
	}
	
	public void end(boolean winner) {
		this.game = false;
		if (winner == true) {
			System.out.print("The game ends. The winner is " + name1);
			noWinner = false;
		} else if (winner == false && no == 0) {
			System.out.println("The game ends. The winner is " + name2);
			noWinner = false;
		} else if (noWinner == true && no == 1){
			System.out.println("The game ends. There is no winner.");
		}
	}

	
	public void setBoard() {
		System.out.print("  ");
		for (int i = 1; i <= 3; i++) {
			System.out.print(" " + i + " ");
		}
		System.out.println("  ");
		for (int i = 0; i < 3; i++) {
			System.out.print(i + 1 + " ");
			for (int j = 0; j < 3; j++) {
				this.board[i][j] = empty;
				System.out.print(board[i][j]);
			}
			System.out.println("");
		}
	}
	
	public String[][] getBoard() {
		return board;
	}
	
	
	public void printBoard(int a, int b,  boolean turn) {
		game = false;
		if (board[a][b] == x || board[a][b] == o) {
			System.out.println("This place is already used.");
			user(name, this.turn);
		} else {
			if (turn == true) {
			board[a][b] = this.x;
			} else {
				board[a][b] = this.o;
			}
			System.out.print("  ");
			for (int i = 1; i <= board.length; i++) {
				System.out.print(" " + i + " ");
			}
			System.out.println("  ");
			for (int i = 0; i < board.length; i++) {
				System.out.print(i + 1 + " ");
				for (int j = 0; j < board.length; j++) {
					System.out.print(board[i][j]);
					if (board[i][j] == empty) {
						game = true;
					}
				}
				System.out.println("");
			}
			if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[1][1] != empty) {
				if (board[0][0] == x) {
					winner = true;
				} else if (board[0][0] == o) {
					winner = false;
				}
				end(winner);
			}
			if (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[1][1] != empty) {
				if (board[0][2] == x) {
					winner = true;
				} else if (board[0][2] == o) {
					winner = false;
				}
				end(winner);
			}
			if (board[0][0] == board[0][1] && board[0][1] == board[0][2] && board[0][1] != empty) {
				if (board[0][0] == x) {
					winner = true;
				} else if (board[0][0] == o) {
					winner = false;
				}
				end(winner);
			}
			if (board[1][0] == board[1][1] && board[1][1] == board[1][2] && board[1][1] != empty) {
				if (board[1][0] == x) {
					winner = true;
				} else if (board[1][0] == o) {
					winner = false;
				}
				end(winner);
			}
			if (board[2][0] == board[2][1] && board[2][1] == board[2][2] && board[2][1] != empty) {
				if (board[2][0] == x) {
					winner = true;
				} else if (board[2][0] == o) {
					winner = false;
				}
				end(winner);
			}
			if (board[0][0] == board[1][0] && board[1][0] == board[2][0] && board[1][0] != empty) {
				if (board[0][0] == x) {
					winner = true;
				} else if (board[0][0] == o) {
					winner = false;
				}
				end(winner);
			}
			if (board[0][1] == board[1][1] && board[1][1] == board[2][1] && board[1][1] != empty) {
				if (board[0][1] == x) {
					winner = true;
				} else if (board[0][1] == o) {
					winner = false;
				}
				end(winner);
			}
			if (board[0][2] == board[1][2] && board[1][2] == board[2][2] && board[1][2] != empty) {
				if (board[0][2] == x) {
					winner = true;
				} else if (board[0][2] == o) {
					winner = false;
				}
				end(winner);
			}
			if (game == false && noWinner == true) {
				no = 1;
				end(winner);
			}
		}
	}
}
