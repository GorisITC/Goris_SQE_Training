
public class Matrix {
	public static void main(String[] args) {
		// col is count of columns and can be changed
		int col = 4;
		int n = 0;
		while (n < col) {
			for (int i = n + 1; i < col; i ++) {
				System.out.print(i + " ");
			}
			for (int j = 0; j < n && j >= 0; j++) {
				System.out.print(j + " ");
			}
			System.out.println(n);
			n+= 1;
		}
		//for displaying correct error if col is less than 0
		if (col < 0) {
			System.out.println("Column can not be less than 0.");
		}
	}
}
