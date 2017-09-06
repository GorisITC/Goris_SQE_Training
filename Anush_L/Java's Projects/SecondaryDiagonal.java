
public class SecondaryDiagonal {
	public static void main(String[] args) {
		int a[][] = {{1,2,3}, {4,5,6}, {7,8,9}};
		float sum = 0;
		float n = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = a[i].length - 1; j >= 0; j--) {
				if (i + j > a.length - 1) {
					sum+= a[i][j];
					n+= 1;
				}
			}
		}
		System.out.println("The arithmetic mean of the numbers under the secondary diagonal: " + sum / n);
	}
}
