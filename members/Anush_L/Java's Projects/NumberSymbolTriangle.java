
public class NumberSymbolTriangle {
	public static void main(String[] args) {
		int n = 7;
		int j = 0;
		for (int i = 1; i <= n; i++) {
			for (j = 1; j <= i; j++) { 
				System.out.print(j);
			}
			for (int k = n; k >= j; k--) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
