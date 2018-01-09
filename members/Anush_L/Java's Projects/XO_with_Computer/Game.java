import java.util.InputMismatchException;
import java.util.Scanner;

public class Game {
	String x = "[X]";
	String o = "[O]";
	String empty = "[ ]";
	boolean winner;
	boolean noWinner = true;
	short no = 0;
	boolean game = true;
	String[][] board = new String[3][3];
	boolean turn = true;
	String me = o;
	String player = x;
	String name1;
	String name2 = "Dedell";
	String name;
	User user1 = new User();
	User user2 = new User();

	public void setStart() {
		System.out.println("Hello, I am a computer and my name is " + name2 + ". I want to play with you.");
		Scanner u1 = new Scanner(System.in);
		System.out.println("Please enter your name: ");
		this.name1 = u1.next();

		System.out.println("Hi dear " + this.name1 + ". This is our Game' board.");

		setBoard();

		Scanner u2 = new Scanner(System.in);
		System.out.println("First player will be 'X'. If you want me to be first player, please type y: ");
		String first = u2.next();

		if (first.equalsIgnoreCase("y")) {
			System.out.println("OK. I'm the first player.");
			user1.setName(name2);
			user2.setName(name1);
			me = this.x;
			player = this.o;
		} else {
			user1.setName(name1);
			user2.setName(name2);
		}

		while (game == true) {
			getBoard();
			setTurn();
		}
	}
	
	public void setTurn () {
		if (game == true) {
			if (turn == true) {
				name = user1.getName();
				user(name, turn);
				turn = false;
			} else if (turn == false) {
				name = user2.getName();
				user(name, turn);
				turn = true;
			}
		}
	}

	
	public void user(String name, boolean turn) {
		if (!name.equals(this.name2)) {
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
		} else {
			compLogic();
		}
	}
	
	public void end(boolean winner) {
		this.game = false;
		if (winner == true) {
			System.out.print("The game ends. The winner is " + name);
			noWinner = false;
		} else if (winner == false && no == 0) {
			System.out.println("The game ends. The winner is " + name);
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


	public void compLogic () {
		System.out.println("My turn :)");
		if (!protection()) {
			attack(me);
		}
	}

	public boolean protection() {
		for (int i = 0; i < board.length; i++) {
			if (board[i][0] != empty && board[i][0] == board[i][1]) {
				if (board[i][2] == empty) {
					printBoard(i, 2, turn);
					return true;
				}
			}
			if (board[i][0] != empty && board[i][0] == board[i][2]) {
				if (board[i][1] == empty) {
					printBoard(i, 1, turn);
					return true;
				}
			}
			if (board[i][1] != empty && board[i][1] == board[i][2]) {
				if (board[i][0] == empty) {
					printBoard(i, 0, turn);
					return true;
				}
			}
			if (board[0][i] != empty && board[0][i] == board[1][i]) {
				if (board[2][i] == empty) {
					printBoard(2, i, turn);
					return true;
				}
			}
			if (board[0][i] != empty && board[0][i] == board[2][i]) {
				if (board[1][i] == empty) {
					printBoard(1, i, turn);
					return true;
				}
			}
			if (board[1][i] != empty && board[1][i] == board[2][i]) {
				if (board[0][i] == empty) {
					printBoard(0, i, turn);
					return true;
				}
			}
			if (board[0][0] != empty && board[0][0] == board[1][1]) {
				if (board[2][2] == empty) {
					printBoard(2, 2, turn);
					return true;
				}
			}
			if (board[0][0] != empty && board[0][0] == board[2][2]) {
				if (board[1][1] == empty) {
					printBoard(1, 1, turn);
					return true;
				}
			}
			if (board[1][1] != empty && board[1][1] == board[2][2]) {
				if (board[0][0] == empty) {
					printBoard(0, 0, turn);
					return true;
				}
			}
			if (board[0][2] != empty && board[0][2] == board[1][1]) {
				if (board[2][0] == empty) {
					printBoard(2, 0, turn);
					return true;
				}
			}
			if (board[0][2] != empty && board[0][2] == board[2][0]) {
				if (board[1][1] == empty) {
					printBoard(1, 1, turn);
					return true;
				}
			}
			if (board[1][1] != empty && board[1][1] == board[2][0]) {
				if (board[0][2] == empty) {
					printBoard(0, 2, turn);
					return true;
				}
			}
		}
		return false;
	}

	public boolean attack(String a) {
		if (board[1][1] == empty) {
			printBoard(1, 1, turn);
			return true;
		}
		for (int i = 0; i < 3; i+=2) {
			for (int j = 0; j < 3; j++) {
				if (board[i][i] == empty) {
					if ((board[i][j].equals(a) || board[j][i].equals(a) || board[j][j].equals(a)) && (!board[i][j].equals(this.player) && !board[j][i].equals(this.player) && !board[j][j].equals(this.player))) {
						printBoard(i, i, turn);
						return true;
					}
				}
				if (board[i][0] == empty && i == 2) {
					if ((board[i][j].equals(a) || board[j][j].equals(a) || board[0][2].equals(a) || board[1][0].equals(a)) && (!board[i][j].equals(this.player) && !board[j][j].equals(this.player) && !board[0][2].equals(this.player) && !board[1][0].equals(this.player))) {
						printBoard(i, 0, turn);
						return true;
					}
				}
				if (i == 0 && board[i][2] == empty) {
					if ((board[i][j].equals(a) || board[j][j].equals(a) || board[1][2].equals(a) || board[2][0].equals(a)) && (!board[i][j].equals(this.player) && !board[j][j].equals(this.player) && !board[2][0].equals(this.player) && !board[1][2].equals(this.player))) {
						printBoard(i, 2, turn);
						return true;
					}
				}
			}
		}
		if (board[0][0] == empty) {
			printBoard(0, 0, turn);
			return true;
		}
		if (board[2][2] == empty) {
			printBoard(2, 2, turn);
			return true;
		}
		if (board[0][2] == empty) {
			printBoard(0, 2, turn);
			return true;
		}
		if (board[2][0] == empty) {
			printBoard(2, 0, turn);
			return true;
		}
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				if (board[i][j] == empty) {
					printBoard(i, j, turn);
					return true;
				}
			}
		}
		return true;
	}

}
